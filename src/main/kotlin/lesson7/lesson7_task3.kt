package org.example.lesson7

fun main() {
    val userNumber: Int

    println("Введите число, до которого необходимо вывести все четные числа")
    userNumber = readln().toInt()

    for (i in 0..userNumber step 2) {
        print("$i ")
    }
}