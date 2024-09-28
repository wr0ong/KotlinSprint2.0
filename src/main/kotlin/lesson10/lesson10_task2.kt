package org.example.lesson10

fun main() {
    val loginOfUser: String
    val passwordOfUser: String
    println("Введите логин")
    loginOfUser = readln()
    println("Введите пароль")
    passwordOfUser = readln()

    if (confirmationOfRegistration(loginOfUser) && confirmationOfRegistration(passwordOfUser) == true)
        println("Добро пожаловать!")
    else println("Логин и пароль должны бать от $LENGTH_OF_LOGIN_AND_PASSWORD символов и более")
}

fun confirmationOfRegistration(dataOfUser: String): Boolean {
    if (dataOfUser.length < LENGTH_OF_LOGIN_AND_PASSWORD)
        return false
    else return true
}

const val LENGTH_OF_LOGIN_AND_PASSWORD = 4