package org.example.lesson10

fun main() {
    val loginOfUser: String
    val passwordOfUser: String
    println("Введите логин")
    loginOfUser = readln()
    println("Введите пароль")
    passwordOfUser = readln()
    checkingOfRegistration(loginOfUser = loginOfUser, passwordOfUser = passwordOfUser)
}
fun checkingOfRegistration(loginOfUser: String, passwordOfUser: String) {
    if ((loginOfUser.length < LENGTH_OF_LOGIN_AND_PASSWORD)||(passwordOfUser.length < LENGTH_OF_LOGIN_AND_PASSWORD))
        println("Логин и пароль должны быть не менее $LENGTH_OF_LOGIN_AND_PASSWORD символов")
    else println("Добро пожаловать!")
}

const val LENGTH_OF_LOGIN_AND_PASSWORD = 4