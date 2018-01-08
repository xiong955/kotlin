package bean

/**
 * @author: xiong
 * @time: 2018/01/04
 * @说明: 数据类
 */
data class UserBean(var name:String,var age:Int)

fun main(args: Array<String>) {
    var user1 = UserBean("xiong",18)
    var user2 = UserBean("xiong",20)
    println(user1)
    println(user2)
    println(user1 == user2)
}