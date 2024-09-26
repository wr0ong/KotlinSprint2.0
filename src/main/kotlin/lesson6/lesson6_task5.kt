package org.example.lesson6

fun main() {
    var randomFirstSummand: Int
    var randomSecondSummand: Int
    var numberOfTry: Int = 3
    var userSum: Int

    randomFirstSummand = (1..9).random()
    randomSecondSummand = (1..9).random()
    println("Проверка на бота! Решите простой пример: $randomFirstSummand + $randomSecondSummand =?")
    userSum = readln().toInt()
    numberOfTry--

    while ((numberOfTry > 0) && (userSum != randomFirstSummand + randomSecondSummand)) {
        randomFirstSummand = (1..9).random()
        randomSecondSummand = (1..9).random()
        numberOfTry--
        println("Неверно! Попробуйте решить это: $randomFirstSummand + $randomSecondSummand =? ")
        userSum = readln().toInt()
    }
    if (userSum != randomFirstSummand + randomSecondSummand) println("Вы ботик")
    else println("Добро пожаловать!")
}