package org.example.lesson7

fun main() {
    val mutableListOfPasswords: MutableList<Char> = mutableListOf()
    var longOfPassword: Int
    var randomChar: Char

    println("Введите длину пароля")
    longOfPassword = readln().toInt()
    while (longOfPassword < 6) {
        println("Длина пароля должна быть от 6 символов, введите число от 6 и больше")
        longOfPassword = readln().toInt()
    }
    for (i in 1..longOfPassword) {
            randomChar = (('1'..'9') + ('a'..'z') + ('A'..'Z')).random()
            mutableListOfPasswords.add(randomChar)
        }
    print("Ваш новый пароль: ")
    mutableListOfPasswords.forEach { print(it) }
}