package singleton

/**
 * @author: xiong
 * @time: 2017/12/29
 * @说明: 单例模式
 */
class Singleton private constructor() {
    public var mSingleton: Singleton? = null

    private object Holder {
        val INSTANCE = Singleton()
    }

    companion object Factory {
        fun getInstance(): Singleton {
            return Holder.INSTANCE
        }
    }
}

fun main(args: Array<String>) {
    val obj1 = Singleton.getInstance()
    val obj2 = Singleton.getInstance()
    println(obj1)
    println(obj2)
}