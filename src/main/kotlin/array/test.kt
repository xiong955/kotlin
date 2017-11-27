package array

import morepackages.packages1.Xiong


/**
 * @author: xiong
 * @time: 2017/11/27
 * @说明: 数组
 */
val arrayInt: IntArray = intArrayOf(1, 3, 5, 7)
val arrayChar: CharArray = charArrayOf('1', '3', '5', '7')
val arrayString: Array<String> = arrayOf("1", "3", "5", "7")
val arrayBean: Array<Xiong> = arrayOf(Xiong("1"), Xiong("3"))

fun main(args: Array<String>) {
    for(int in arrayInt){
        println(int)
    }

    for (s in arrayString) {
        println(s)
    }

    println(arrayBean[1])
    arrayBean[1] = Xiong("5")
    println(arrayBean[1])

    println(arrayChar.joinToString())
    println(arrayInt.slice(1..2))
}