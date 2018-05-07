package operator

/**
 * @author: xiong
 * @time: 2018/01/30
 * @说明:
 */

fun main(args: Array<String>) {
    var a = 10
    var b = 2
    var c = false
    var d = "111"
    var e = "222"

    /**
     * 一元操作符
     */
    println(a.unaryPlus()) // +a
    println(a.unaryMinus()) // -a
    println(c.not()) // !c
    println(a.inc()) // a++
    println(a.dec()) // a--

    /**
     * 二元操作符
     */
    println(a.plus(b)) // a+b
    println(a.minus(b))  // a-b
    println(a.times(b)) // a*b
    println(a.div(b))// a/b
    println(a.rem(b)) // a%b
    println(b.rangeTo(a)) // b..a
    println(d.contains(e)) // d in e
    println(!d.contains(e)) // d !in e
}