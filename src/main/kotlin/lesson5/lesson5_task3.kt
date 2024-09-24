package org.example.lesson5

fun main() {
    val firstWinningNumber: Int = (1..42).random()
    var secondWinningNumber: Int = (1..42).random()
    if (firstWinningNumber == secondWinningNumber) secondWinningNumber = (1..42).random()

    var playerFirstChoiceNumber: Int
    var playerSecondChoiceNumber: Int

    println("Введите первое число от 1 до 42")
    try {
        playerFirstChoiceNumber = readln().toInt()
    } catch (e: Exception) {
        println("Вы ввели неверное число, попробуйте еще раз!")
        playerFirstChoiceNumber = readln().toInt()
    }

    println("Введите второе число от 1 до 42")
    try {
        playerSecondChoiceNumber = readln().toInt()
    } catch (e: Exception) {
        println("Вы ввели неверное число, попробуйте еще раз!")
        playerSecondChoiceNumber = readln().toInt()
    }

    if (((playerFirstChoiceNumber == firstWinningNumber) || (playerFirstChoiceNumber == secondWinningNumber)) &&
        ((playerSecondChoiceNumber == firstWinningNumber) || (playerSecondChoiceNumber == secondWinningNumber))
    )
        println("Поздравляем! Вы выиграли главный приз!")
    else if (((playerFirstChoiceNumber == firstWinningNumber) || (playerFirstChoiceNumber == secondWinningNumber)) ||
        ((playerSecondChoiceNumber == firstWinningNumber) || (playerSecondChoiceNumber == secondWinningNumber)))
        println("Вы выиграли утешительный приз!")
    else println("Неудача!")

    println("Для победы нужны были $firstWinningNumber и $secondWinningNumber")
}