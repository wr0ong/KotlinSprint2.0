package org.example.lesson10

fun main() {
    val lengthOfPassword: Int
    println("Введите длину пароля")
    lengthOfPassword = readln().toInt()
    createPassword(lengthOfPassword)
}

fun createPassword(lengthOfPassword: Int): (String) {
    var password: String = ""
    for (i in lengthOfPassword downTo 1) {
        if (i % 2 == 0) password += (1..9).random()
        else password += ("!\"#\$%&'()*+,-./ ").random()
    }
    println(password)
    return (password)
}