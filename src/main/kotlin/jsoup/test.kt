package jsoup

import org.jsoup.Jsoup
import java.net.URL

/**
 * @author: xiong
 * @time: 2018/04/27
 * @说明: 爬虫
 */

fun main(args: Array<String>) {
    testJsoup()
}

fun testJsoup() {
    val doc = Jsoup.parse(URL("http://www.wandoujia.com/apps"), 5000)
    doc.select(".name").forEach { println(it) }
}