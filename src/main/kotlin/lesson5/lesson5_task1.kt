package org.example.lesson5

fun main() {
    var summandToVerification1: Int = (1..10).random()
    var summandToVerification2: Int = (1..10).random()

    println("Сколько будет $summandToVerification1 + $summandToVerification2 ?")
    val areYouBot = readln().toInt()

    if (areYouBot == (summandToVerification1 + summandToVerification2)) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}