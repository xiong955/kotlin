package generic

import array.arrayInt
import java.util.*

/**
 * @author: xiong
 * @time: 2018/01/04
 * @说明: 泛型
 * kotlin没有?通配符,用out和in关键字代替
 *     out泛型占位符,只能用在方法的返回值,只能返回T,而不能消耗T,也即不能把T当参数使用,T也称作 协变类型参数。      生产者
 *     in泛型占位符,只能被用作方法的参数,被操作,而不能作为返回值,T也称作 逆变类型参数。                           消费者
 */

class Box<T>(t: T) {
    var value = t
}

fun main(args: Array<String>) {
    var box1: Box<Int> = Box(20)
    var box2: Box<String> = Box("10")
    println(box1.value)
    println(box2.value)
    val from: Array<Int> = arrayOf(1, 2, 3)
    val to: Array<Any?> = arrayOfNulls(5)
    copy(from, to)

    TestTTT("1")
    TestTTT(1)
    TestTTT(Box(20))
}

abstract class Source<out T> {
    abstract fun nextT(): T
}

fun demo(str: Source<String>) {
    val objects: Source<Any> = str
}

abstract class Comparable<in T> {
    // T被声明为in类型,所以不能为T
    abstract fun comparableTo(other: T): Int
}

fun demo(x: Comparable<Number>) {
    // 1.0是Double类型,Double是Number的子类
    x.comparableTo(1.0)
    val y: Comparable<Double> = x
}

fun copy(from: Array<out Any>, to: Array<Any?>) {
    assert(from.size == to.size)
    for (i in from.indices) {
        to[i] = from[i]
    }
}

//类型参数放在函数名称之前。
//如果在调用处明确地传入了类型参数, 那么类型参数应该放在函数名称 之后。如果不传入参数类型，编译器会根据传入的值自动推断参数类型。
fun <T> TestTTT(i:T){
    when(i){
        is Int -> println("is int")
        is String -> println("is string")
        else -> println("T is ???")
    }
}
