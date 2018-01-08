package `interface`

/**
 * @author: xiong
 * @time: 2018/01/02
 * @说明: 接口,抽象
 */
interface MyInterface{
    fun process()
    fun getName():String{
        return "Xiong"
    }
}

class MyClass : MyInterface {
    override fun process() {
        println("嘻嘻嘻")
    }

    override fun getName(): String {
        return "My Xiong"
    }
}

fun main(args: Array<String>) {
    val mClass = MyClass()
    println(mClass.getName())
    mClass.process()
    println(MyDerived().f())
}

open class Base{
    open fun f(){}
}

abstract class Derived :Base(){
    override abstract fun f()
}

class MyDerived: Derived() {
    override fun f() {
        println("1111")
    }
}