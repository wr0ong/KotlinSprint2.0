package org.example.lesson5

fun main() {
    var yearOfBorn: Int
    val yearNow: Int = 2024
    val monthOfYear: Int = 9
    val dayOfMonth: Int = 24
    val monthOfBorn: Int
    val dayOfBorn: Int

    println("Введите год рождения")

    try {
        yearOfBorn = readln().toInt()
    } catch (e: Exception) {
        println("Неправильный год рождения, повторите ввод!")
        yearOfBorn = readln().toInt()
    }
    if (yearNow - yearOfBorn == AGE_OF) {
        println("Введите месяц рождения")
        monthOfBorn = readln().toInt()
        println("Введите день рождения")
        dayOfBorn = readln().toInt()
        if ((monthOfBorn < monthOfYear) || ((monthOfBorn == monthOfYear) && (dayOfBorn <= dayOfMonth)))
            println("Показать экран со скрытым контентом")
        else println("Доступ закрыт")
    } else if (yearNow - yearOfBorn > AGE_OF) println("Показать экран со скрытым контентом")
    else println("Доступ закрыт")
}

const val AGE_OF = 18