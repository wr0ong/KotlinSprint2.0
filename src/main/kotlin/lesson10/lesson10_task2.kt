package org.example.lesson10

fun main() {
    val loginOfUser: String
    val passwordOfUser: String
    println("Введите логин")
    loginOfUser = readln()
    println("Введите пароль")
    passwordOfUser = readln()

    if (checkLength(loginOfUser) && checkLength(passwordOfUser))
        println("Добро пожаловать!")
    else println("Логин и пароль должны бать от $LENGTH_OF_LOGIN_AND_PASSWORD символов и более")
}

fun checkLength(dataOfUser: String): Boolean {
    return dataOfUser.length >= LENGTH_OF_LOGIN_AND_PASSWORD
}

const val LENGTH_OF_LOGIN_AND_PASSWORD = 4