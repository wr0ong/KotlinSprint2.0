package org.example.lesson7

fun main() {
    val longOfPassword: Int = 6
    var password: String = ""

    for (i in longOfPassword downTo 1) {
        if (i % 2 == 0) password += ('a'..'z').random()
        else password += (1..9).random().toString()
    }
    println(password)
}
