package morepackages.packages1

/**
 * @author: Xiong
 * @time: 2017/11/27
 * @说明:
 */

 class Xiong(val mString: String){
    init {
        println("输出了$mString")
    }

    override fun toString(): String {
        return mString
    }
}