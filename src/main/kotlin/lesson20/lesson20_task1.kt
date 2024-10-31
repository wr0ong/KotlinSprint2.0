package org.example.lesson20

fun main() {
    println("Введите имя пользователя")
    val name: String = readln()

    val splashScreen: () -> String = { "С наступающим Новым Годом, $name!" }
    println(splashScreen())
}