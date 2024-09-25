package org.example.lesson6

fun main() {
    val newUserLogin: String = "traktor"
    val newUserPassword: String = "300"
    var checkOfLogin: String
    var checkOfPassword: String

    do {
        println("Подтвердите логин")
        checkOfLogin = readln()
        println("Подтвердите пароль")
        checkOfPassword = readln()
    } while ((checkOfLogin != newUserLogin) && (checkOfPassword != newUserPassword))
    println("Авторизация прошла успешно")
}