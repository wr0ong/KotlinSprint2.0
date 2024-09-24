package org.example.lesson6

fun main() {
    val newUserLogin: String
    val newUserPassword: String
    var checkOfLogin: String
    var checkOfPassword: String

    println("Введите логин")
    newUserLogin = readln()
    println("Введите пароль")
    newUserPassword = readln()
    do {
        println("Подтвердите логин")
        checkOfLogin = readln()
        println("Подтвердите пароль")
        checkOfPassword = readln()
    } while ((checkOfLogin != newUserLogin) && (checkOfPassword != newUserPassword))
    println("Авторизация прошла успешно")
}