package extend

/**
 * @author: Xiong
 * @time: 2017/11/27
 * @说明: 继承,类强转
 */

open class People(val str: String, val int: Int, val boolean: Boolean) {
    init {
        println("这个类:${javaClass.simpleName},输出了str:$str,int:$int,boolean:$boolean")
    }
}

class Man(str: String, int: Int, boolean: Boolean) : People(str, int, boolean)
class Woman(str: String, int: Int, boolean: Boolean) : People(str, int, boolean)

fun main(args: Array<String>) {
    val man: Man = Man("男人", 18, true)
    val woman: Woman = Woman("女人", 18, true)


    val parent = Parent()
    val child: Child? = parent as? Child
    println(child)
}

open class Parent
class Child : Parent()
