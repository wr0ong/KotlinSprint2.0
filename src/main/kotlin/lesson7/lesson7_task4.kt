package org.example.lesson7

fun main() {
    val secondsInTimer: Int

    println("Введите, сколько секунд необходимо засечь")
    secondsInTimer = readln().toInt()

    for (i in secondsInTimer downTo 0) {
        if (i != 0) {
            println("Осталось $i секунд")
            Thread.sleep(1000)
        }
        else println("Время вышло!")
    }
}