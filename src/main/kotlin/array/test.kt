package array

import morepackages.packages1.Xiong


/**
 * @author: xiong
 * @time: 2017/11/27
 * @说明: 数组
 */
val arrayInt: IntArray = intArrayOf(1, 3, 5, 7)
val arrayChar: CharArray = charArrayOf('H', 'e', 'l', 'l','o')
val arrayString: Array<String> = arrayOf("1", "3", "5", "7")
val arrayBean: Array<Xiong> = arrayOf(Xiong("1"), Xiong("3"))

fun main(args: Array<String>) {
    for(int in arrayInt){
        print(int)
    }
    println()

    for (s in arrayString) {
        print(s)
    }
    println()

    println(arrayBean[1])
    arrayBean[1] = Xiong("5")
    println(arrayBean[1])

    println(arrayChar.joinToString(""))
    println(arrayInt.slice(1..2))
}