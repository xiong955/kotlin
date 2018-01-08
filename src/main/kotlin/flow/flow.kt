package flow

/**
 * @author: xiong
 * @time: 2017/12/26
 * @说明: 控制流(switch -> when)
 */
val a = 10
val b = 20

fun main(args: Array<String>) {

    if (a < b) {
        println("true")
    }

    when (a) {
        10 -> {
            println(10)
        }
        20 -> {
            println(20)
        }
    }
}