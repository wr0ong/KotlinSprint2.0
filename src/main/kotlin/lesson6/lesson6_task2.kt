package org.example.lesson6

fun main() {
    val needTimeToUser: Long

    println("Введите сколько секунд засечь")
    needTimeToUser = readln().toLong()
    Thread.sleep(1000*needTimeToUser)
    println("Прошло $needTimeToUser секунд")
}