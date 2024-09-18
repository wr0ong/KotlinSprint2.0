package org.example.lesson3

fun main() {
    var surname: String = "Андреева"
    val name: String = "Татьяна"
    val patronymic: String = "Сергеевна"
    var age: Int = 20

    println("$surname $name $patronymic, $age")
    age = 22
    surname = "Сидорова"
    println("$surname $name $patronymic, $age")
}
