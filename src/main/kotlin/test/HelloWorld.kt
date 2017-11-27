package test

/**
 * @author: Xiong
 * @time: 2017/11/24
 * @说明: 基本类型
 */

val mBoolean:Boolean = false
val mInt:Int = Int.MAX_VALUE
val mFloat:Float = 1E0F
val mString:String? = "Hello World!" // ?关键字修饰类型为可空

fun main(args: Array<String>) {
    println(mBoolean)
    println(mInt)
    println(mFloat)
    println("Hello World!" == mString) // == 相当于 equals
    println("Hello World!" === mString) // === 相当于 ==
    println(mString!!.length) // !!绕过编译器,知道对象不可能为空
}