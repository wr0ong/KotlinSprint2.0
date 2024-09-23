package org.example.lesson5

fun main() {
    val firstWinningNumber: Int = (1..42).random()
    var secondWinningNumber: Int = (1..42).random()
    if (firstWinningNumber == secondWinningNumber) secondWinningNumber = (1..42).random()

    val playerFirstChoiceNumber: Int
    val playerSecondChoiceNumber: Int

    println("Введите первое число")
    playerFirstChoiceNumber = readln().toInt()
    println("Ввелите второе число")
    playerSecondChoiceNumber = readln().toInt()

    if (((playerFirstChoiceNumber == firstWinningNumber)||(playerFirstChoiceNumber == secondWinningNumber)) &&
        ((playerSecondChoiceNumber == firstWinningNumber)||(playerSecondChoiceNumber == secondWinningNumber)))
        println("Поздравляем! Вы выиграли главный приз!")
    else if (((playerFirstChoiceNumber == firstWinningNumber)||(playerFirstChoiceNumber == secondWinningNumber)) ||
        ((playerSecondChoiceNumber == firstWinningNumber)||(playerSecondChoiceNumber == secondWinningNumber)))
        println("Вы выиграли утешительный приз!")
    else println("Неудача!")
    println("Для победы нужны были $firstWinningNumber и $secondWinningNumber")
}