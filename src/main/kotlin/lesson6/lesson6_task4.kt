package org.example.lesson6

fun main() {
    val randomNumberToWin: Int = (1..9).random()
    var numberOfTry: Int = MAX_ATTEMPTS
    var userNumber: Int

    println("Введите число от 1 до 9")
    userNumber = readln().toInt()
    numberOfTry--
    while ((numberOfTry > 0) && (userNumber != randomNumberToWin)) {
        println("Осталост $numberOfTry попыток")
        println("Не угадал, попробуй еще раз ввести число от 1 до 9")
        userNumber = readln().toInt()
        numberOfTry--
    }
    if (userNumber == randomNumberToWin) println("Поздравляю! Вы выиграли")
    else println("Вы проиграли, было загадано число $randomNumberToWin")
}

const val MAX_ATTEMPTS = 5