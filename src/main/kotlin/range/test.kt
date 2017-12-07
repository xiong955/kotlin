package range


/**
 * @author: xiong
 * @time: 2017/11/27
 * @说明: 区间
 */

val range:IntRange = 0..10 // [0,10]
val range1:IntRange = 0.rangeTo(10) // [0,10]
val range2:IntRange = 0 until 10 // [0,10)
val range3:IntProgression = 4 downTo 0 // [4,0] 倒序
val range4:IntProgression = 0..10 step 3 // {0,3,6,9} step步长迭代数字
val mString = "HelloWorld"

fun main(args: Array<String>) {
    val i =5
    println(i in range) // in判断是否在区间

    range.forEach (::print)
    println()
    range1.forEach (::print)
    println()
    range2.forEach (::print)
    println()
    range3.forEach (::print)
    println()
    range4.forEach (::print)
    println()

    println(mString.slice(range2)) // slice,切片,截取String区间的字符
    test.mString
}