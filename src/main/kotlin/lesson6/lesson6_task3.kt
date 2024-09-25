package org.example.lesson6

fun main() {
    var needTimeToUser: Int
    var secondsInTimer: Int

    println("Введите сколько секунд засечь")
    needTimeToUser = readln().toInt()
    secondsInTimer = needTimeToUser

    while (secondsInTimer != 0) {
        println("Осталось секунд: $secondsInTimer")
        Thread.sleep(1000)
        secondsInTimer--
    }
    println("Время вышло")
}