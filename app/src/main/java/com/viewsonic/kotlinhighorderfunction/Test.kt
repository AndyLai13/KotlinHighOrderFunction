package com.viewsonic.kotlinhighorderfunction

val list = listOf(1, 2, 3, 4, 5)

fun main(args: Array<String>) {
    with()
    Delegate().exec()
}

fun run() {
    run {
        val drink = FiftyLan()
        drink.plasticBag = true
        drink
    }.setIceLevel(FiftyLan.IceLevel.All)
}

fun Trun() {
    val drink = FiftyLan()
    drink.run {
        this.plasticBag = false
        this.setIceLevel(FiftyLan.IceLevel.Few)
        this
    }.setSugarLevel(FiftyLan.SugarLevel.All)
}

fun map() {
    val newList = list.map { it + 5 } // 針對map內的值操作
    newList.forEach { println(it) }
}

fun mapInt2Double() {
    val newList = list.map { it.toDouble() } // 針對map內的值操作
    newList.forEach { println(it) }
}

fun fold() {
    var fold = list.fold(50, { acc, i ->
        println("acc = $acc, i = $i")
        acc
    })
    println(fold)
}

fun filter() {
    val newList = list.filter { it % 2 == 0 }
    newList.forEach { println(it) }
}

fun takeWhile() {
    val newList = list.takeWhile { it < 3 }
    newList.forEach { println(it) }
}

fun let() {
    var temp: String? = "ss"
    temp?.let { temp = "s2" }
}

fun apply() {
    data class Person(var name: String, var age: Int)

    val person = Person("Andy", 30)
    person.apply { this.age = 20 }
    println(person)
}

fun with() {
    val name = "Andy"
    with(name) {
        println(this)
    }
}

fun also() {
    val drink = FiftyLan().also {
        it.setSugarLevel(FiftyLan.SugarLevel.Half)
    }.also {
        it.setIceLevel(FiftyLan.IceLevel.Few)
    }.also {
        it.plasticBag = true
    }

}

class FiftyLan {
    var plasticBag = false
    fun setSugarLevel(level: SugarLevel) {}
    fun setIceLevel(level: IceLevel) {}
    enum class SugarLevel { Half, All }
    enum class IceLevel { Few, All }
}

fun delegate() {

}