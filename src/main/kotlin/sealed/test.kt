package sealed

/**
 * @author: xiong
 * @time: 2018/01/04
 * @说明: 封闭类
 * 在某种意义上,密封类就是扩展的枚举类enum(枚举类的值集合也是受限)
 * 不同之处:
 *     枚举类的每个枚举常量只存在一个实例,
 *     密封类的一个子类可以有可包含状态的多个实例!
 *
 * 密封类的好处在于:使用when表达式,如果能覆盖所有情况,就无需再添加else子句
 */

sealed class Expr {
    data class Const(val number: Double) : Expr()
    data class Sum(val e1: Expr, val e2: Expr) : Expr()
    object NotANumber : Expr()
}

fun eval(expr: Expr): Double = when (expr) {
    is Expr.Const -> expr.number
    is Expr.Sum -> eval(expr.e1) + eval(expr.e2)
    Expr.NotANumber -> Double.NaN
}

fun main(args: Array<String>) {
    println(eval(Expr.Const(11.1)))
    println(eval(Expr.Sum(Expr.Const(11.1),Expr.Const(0.1))))
    println(eval(Expr.NotANumber))
}