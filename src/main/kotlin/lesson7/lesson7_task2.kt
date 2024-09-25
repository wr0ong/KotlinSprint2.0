package org.example.lesson7

fun main () {
    var randomCode: Int
    var confirmationOfUser: Int

    do {
        randomCode = (1000..9999).random()
        println("Код активации: $randomCode\nВведите код для входа!")
        confirmationOfUser = readln().toInt()
    }
        while (randomCode != confirmationOfUser)
        println("Добро пожаловать!")
}