package org.example.lesson5

import kotlin.random.Random

fun main() {
    var a: Int = Random.nextInt(1, 10)
    var b: Int = Random.nextInt(1, 10)

    println("Сколько будет $a + $b ?")
    val areYouBot = readln().toInt()

    if (areYouBot == (a + b)) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}