package commissioned

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

/**
 * @author: xiong
 * @time: 2018/01/09
 * @说明: 委托
 *
 * ReadOnlyProperty
 * ReadWriteProperty
 */

// 类委托
interface Parent {
    fun print()
}

class Child(val x: Int) : Parent {
    override fun print() {
        println("x->$x")
    }
}

class Commission(c: Child) : Parent by c

// 属性委托
class Delegate {

    private var temp = "old"

    operator fun getValue(ref: Any?, p: KProperty<*>): String {
        val className = ref.toString().substringBefore('@')
        return "$className --> ${p.name} --> $temp"
    }

    operator fun setValue(ref: Any?, p: KProperty<*>, value: String) {
        temp = value
    }

}

class MyClass {
    var name: String by Delegate()
}


// 可观察委托
class User {
    var name: String by Delegates.observable("Xiong") { property, oldValue, newValue ->
        // 响应函数的三个参数
        println("被赋予的属性:${property.name}")
        println("旧值:$oldValue  新值:$newValue")
    }

    // 阻止赋值
    var sex: String by Delegates.vetoable("man") { property, oldValue, newValue ->
        // 响应函数的三个参数
        println("被赋予的属性:${property.name}")
        println("旧值:$oldValue  新值:$newValue")
        var result = true
        // sex的属性不能为 woman
        if (newValue == "woman") {
            result = false
            println("sex的属性不能为 woman")
        }
        result
    }
}

// Map委托,只有get没有set
class Bean(var map: Map<String, Any>) {
    val name: String by map
    val age: Int by map
}

// MutableMap委托,有get和set
class Bean1(var map: MutableMap<String, Any>){
    var name: String by map
    var age: Int by map
}

fun main(args: Array<String>) {
    val c = Child(10)
    Commission(c).print()
    println()

    val e = MyClass()
    println(e.name)
    e.name = "new"
    println(e.name)
    println()

    val user = User()
    user.name = "Zhu"
    user.name = "Jie"
    println()

    user.sex = "?"
    user.sex = "woman"
    println(user.sex)
    println()

    var map = mapOf(
            "name" to "Xiong",
            "age" to 24
    )
    val bean = Bean(map)
    println(bean.name)
    println(bean.age)
    println()

    var mutableMap = mutableMapOf(
            "name" to "Xiong",
            "age" to 24
    )
    val bean1 = Bean1(mutableMap)
    println(bean1.name)
    println(bean1.age)
    bean1.name = "Zhu"
    println(mutableMap)
    mutableMap.put("age",18)
    println(bean1.age)
}