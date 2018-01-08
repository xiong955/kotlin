package constructor

/**
 * @author: xiong
 * @time: 2017/12/29
 * @说明: 构造器
 */

fun main(args: Array<String>) {

    xiong("111")
    xiong(10)
    xiong("222","222")
    xiong()
}

class xiong(url: String) {
    init {
        println(url)
    }

    constructor(value: Int) : this("222") {
        println(value)
    }

    constructor(str: String, url: String) : this("[$url]") {
        println(str + ":" + url)
    }

    constructor() : this(20) {
        println("333")
    }
}