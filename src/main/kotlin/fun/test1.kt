package `fun`

import javax.swing.tree.TreeNode

/**
 * @author: xiong
 * @time: 2018/01/12
 * @说明: 函数,中缀表达式,内联
 *
 *   中缀表达式条件:1,成员函数或扩展函数
 *                  2,只有1个参数
 *                  3,使用infix关键字声明
 */

infix fun String.div(str: String): String {
    return this.replace(str, "")
}

/**
 * 调用某个函数实际上将程序执行顺序转移到该函数所存放在内存中某个地址，
 * 将函数的程序内容执行完后，再返回到转去执行该函数前的地方。
 * 这种转移操作要求在转去前要保护现场并记忆执行的地址，转回后先要恢复现场，
 * 并按原来保存地址继续执行。也就是通常说的压栈和出栈。因此，
 * 函数调用要有一定的时间和空间方面的开销。那么对于那些函数体代码不是很大，
 * 又频繁调用的函数来说，这个时间和空间的消耗会很大。

 * 那怎么解决这个性能消耗问题呢，这个时候需要引入内联函数了。
 * 内联函数就是在程序编译时，编译器将程序中出现的内联函数的调用表达式用内联函数的函数体来直接进行替换。
 * 显然，这样就不会产生转去转回的问题，但是由于在编译时将函数体中的代码被替代到程序中，
 * 因此会增加目标程序代码量，进而增加空间开销，而在时间代销上不象函数调用时那么大，
 * 可见它是以目标代码的增加为代价来换取时间的节省。
 */

/**
 * inline 内联
 * noinline 不内联
 * crossinline 交叉内联
 * 一些内联函数可能调用传给它们的不是直接来自函数体。
 * 而是来自另一个执行上下文的 lambda 表达式参数，例如来自局部对象或嵌套函数。
 * 在这种情况下，该 lambda 表达式中也不允许非局部控制流。
 * 为了标识这种情况，该 lambda 表达式参数需要用 crossinline 修饰符标记。
 */
inline fun processProduct(area: (str: String) -> String, noinline area1: (str: String) -> String): String {
    return area("iphone") + "  " + area1("埃菲尔铁塔")
}

inline fun f(crossinline body: () -> Unit) {
    var a = Runnable { body() }
}

fun main(args: Array<String>) {
    var str = "hello world"
    // 一般调用
    println(str.div("l"))
    // 中缀表达式,中缀表达式可以连续使用
    println(str div "e" div "o")

    println()
    println(processProduct({ name -> "$name 美国" }, { name1 -> "$name1 法国" }))
    f(body = { 1 + 1 })

}
