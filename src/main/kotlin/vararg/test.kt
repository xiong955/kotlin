package vararg

/**
 * @author: xiong
 * @time: 2018/01/02
 * @说明: vararg 可变参数
 */

class Person(name: String) {
    private var mName: String = name
    fun getName(): String {
        return mName
    }
}

class Persons{
    // person 为可变参数,传入任意多个person对象
    fun addPersons(vararg persons: Person):List<Person>{
        val result = ArrayList<Person>()
        result += persons
        return result
    }
}

fun main(args: Array<String>) {
    // add任意多个person对象
    val persons = Persons().addPersons(Person("1"), Person("2"), Person("3"))
    for (person in persons){
        println(person.getName())
    }
}