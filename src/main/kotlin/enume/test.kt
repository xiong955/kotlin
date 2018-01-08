package enume

/**
 * @author: xiong
 * @time: 2018/01/02
 * @说明: 枚举
 */
enum class Demo {
    A, B, C, D
}

// 为枚举类赋值
enum class Demo2(var i:Int){
    A(1),B(2),C(3),D(4);

    override fun toString(): String {
        return i.toString()
    }
}

fun main(args: Array<String>) {
    var a: Demo = Demo.A
    if (Demo.A == a) {
        println("枚举类相同")
    } else {
        println("枚举类不同")
    }
    println(Demo.A)
    // 枚举值
    println(Demo2.A)
    // 枚举名称
    println(Demo2.A.name)
    // 枚举索引
    println(Demo2.A.ordinal)
    // 根据名称找数值
    println(Demo2.valueOf("D"))
    // 遍历枚举值
    for (value in Demo2.values()) {
        println(value)
    }
}