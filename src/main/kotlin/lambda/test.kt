package lambda

/**
 * @author: xiong
 * @time: 2018/01/10
 * @说明: lambda表达式,高阶函数
 */

interface Product {
    var area: String
    fun sell(name: String)
}

class MobilePhOne : Product {
    override var area: String = ""

    override fun sell(name: String) {
        println("销售$name")
    }

    override fun toString(): String {
        return area
    }
}

fun mobilePhoneArea(name: String): String {
    return "$name 美国"
}

//高阶函数
fun processProduct(product: Product, area: (name: String) -> String): Product {
    // 调用第二个参数指定的函数
    product.area = area("iPhone")
    return product
}

fun q111(name: String): String {
    return name
}

fun main(args: Array<String>) {
    var product = MobilePhOne()
    // 将函数作为参数值传入高阶函数,需要在函数名前加两个冒号(::)作为标记
    processProduct(product, ::mobilePhoneArea)
    processProduct(product) { name ->
        "$name 美国"
    }
    println(product)
}