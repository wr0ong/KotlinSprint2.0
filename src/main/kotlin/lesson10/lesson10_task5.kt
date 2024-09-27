package org.example.lesson10

fun main() {
    val boxOfProducts: MutableList<String> = mutableListOf("Корова", "Сено", "Коза", "Яйца куриц")
    val loginOfUser: String
    val passwordOfUser: String

    println("Введите логин")
    loginOfUser = readln()
    println("Введите пароль")
    passwordOfUser = readln()

    if (createJWTKey(loginOfUser, passwordOfUser) != "не сгенерирован") {
        print("Ваш список покупок: $boxOfProducts")
    } else println("Логин и пароль введены неверно!")
}

fun createJWTKey(loginOfUser: String, passwordOfUser: String): String {
    var keyOfUser1: String = "не сгенерирован"
    if ((loginOfUser == LOGIN_OF_USER1) && (passwordOfUser == PASSWORD_OF_USER1)) {
        keyOfUser1 = ""
        for (i in 1..LENGTH_OF_JWT_KEY) {
            keyOfUser1 += (('a'..'z')+(1..9)+('A'..'Z')).random()
        }
    }
    println("Ваш JWTKey: $keyOfUser1")
    return (keyOfUser1)
}

const val LOGIN_OF_USER1 = "Николай"
const val PASSWORD_OF_USER1 = "qwerty123"
const val LENGTH_OF_JWT_KEY = 32

