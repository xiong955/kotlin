package expand

/**
 * @author: xiong
 * @time: 2018/01/02
 * @说明: 扩展,扩展源码没有的功能
 */

fun ArrayList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}

class MyClass {
    var value: Int = 0
}

var MyClass.str: Int
    get() = value
    set(str) {
        value = str
    }


open class D{
    fun bar(){
        println("D.bar")
    }
}

class C{
    fun bar(){
        println("C.bar")
    }

    fun D.foo(){
        bar()
        this@C.bar()
    }

    fun caller(d:D){
        d.foo()
    }
}

fun main(args: Array<String>) {
    val mArray: ArrayList<Int> = ArrayList()
    mArray.add(10)
    mArray.add(20)
    mArray.add(30)
    mArray.swap(1, 2)
    println(mArray)


    val myClass = MyClass()
    myClass.str = 10
    println(myClass.value)
    println(myClass.str)

    C().caller(D())
}