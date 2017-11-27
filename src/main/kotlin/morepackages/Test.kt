package morepackages

import morepackages.packages1.Xiong
import morepackages.packages2.Xiong as mXiong // as修饰变量名或者包名局部重命名,以解决冲突

/**
 * @author: Xiong
 * @time: 2017/11/27
 * @说明: 多包
 */

fun main(args: Array<String>) {
    val xiong: Xiong = Xiong("Xiong")
    val mXiong: mXiong = mXiong("mXiong")
}