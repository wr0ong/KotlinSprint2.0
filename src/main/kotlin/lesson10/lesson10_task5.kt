package org.example.lesson10

fun main() {
    val loginOfUser: String
    val passwordOfUser: String
    var keyJWTOfUser: String = ""

    println("Введите логин")
    loginOfUser = readln()
    println("Введите пароль")
    passwordOfUser = readln()
    if (checkOfRegistration(loginOfUser = loginOfUser, passwordOfUser = passwordOfUser)) {
        keyJWTOfUser = createJWTKey()
        println("$loginOfUser, добро пожаловать!")
        println("Ваш список покупок: ${showTheBoxOfProduct(keyJWTOfUser)}")
    } else println("Логин или пароль неверны! Ваш список покупок ${showTheBoxOfProduct(keyJWTOfUser)}")
}

fun checkOfRegistration(loginOfUser: String, passwordOfUser: String): Boolean {
    if ((loginOfUser == LOGIN_OF_USER1) && (passwordOfUser == PASSWORD_OF_USER1))
        return (true)
    else return (false)
}

fun createJWTKey(): String {
    var keyOfUser1: String
    keyOfUser1 = ""
    for (i in 1..LENGTH_OF_JWT_KEY) {
        keyOfUser1 += (('a'..'z') + (1..9) + ('A'..'Z')).random()
    }
    println("Ваш JWTKey: $keyOfUser1")
    return (keyOfUser1)
}

fun showTheBoxOfProduct(keyOfUser: String): MutableList<String> {
    val boxOfProducts: MutableList<String> = mutableListOf("Корова", "Сено", "Коза", "Яйца куриц")
    val emptyBoxOfProducts: MutableList<String> = mutableListOf("Пуст")

    if (keyOfUser != "") return boxOfProducts
    else return (emptyBoxOfProducts)
}

const val LOGIN_OF_USER1 = "Николай"
const val PASSWORD_OF_USER1 = "qwerty123"
const val LENGTH_OF_JWT_KEY = 32

