package org.example.lesson6

fun main() {
    var needTimeToUser: Int
    var secondsInTimer: Int

    println("Введите сколько секунд засечь")
    needTimeToUser = readln().toInt()
    secondsInTimer = needTimeToUser

    while (secondsInTimer != 0) {
        Thread.sleep(1000)
        secondsInTimer--
    }
    println("Прошло $needTimeToUser секунд")
}