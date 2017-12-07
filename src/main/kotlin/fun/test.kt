package `fun`

/**
 * @author: xiong
 * @time: 2017/11/28
 * @说明: 函数,lambda表达式
 */

val mArrayString : Array<String> = arrayOf("1","3","5","7")

fun main(args: Array<String>) {
    println(sum(10, 10))
    println(sum1(10, 10))
    println(a(10))
    println(b(10))
    println(c.invoke(5,5))
    println(d(1,1,3))
    mArrayString.forEach ForEach@{
        if (it == "5"){
            return@ForEach
        }
        println(it)
    }
    println("End")
}

fun sum(arg1: Int, arg2: Int) = arg1 + arg2

fun sum1(arg1: Int, arg2: Int): Int {
    return arg1 + arg2
}

var a = fun(b: Int): Int {
    return b
}

fun b(b: Int): Int {
    return b
}

var c = { arg1: Int, arg2: Int ->
    arg1 + arg2
}

var d = { arg1: Int, arg2: Int, arg3: Int ->
    88 % 7
}
