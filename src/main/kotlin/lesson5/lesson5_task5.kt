package org.example.lesson5

fun main() {
    val setOfWinningNumbers: Set<Int> = setOf((0..42).random(), (0..42).random(), (0..42).random())
    val userChoice1: Int
    val userChoice2: Int
    val userChoice3: Int

    println("Введите первое число от 0 до 42")
    userChoice1 = readln().toInt()
    println("Введите второе число от 0 до 42")
    userChoice2 = readln().toInt()
    println("Введите третье число от 0 до 42")
    userChoice3 = readln().toInt()

    val setOfUserChoice: Set<Int> = setOf(userChoice1, userChoice2, userChoice3)
    val sizeOfUserChoice = (setOfUserChoice intersect setOfWinningNumbers).size

    when (sizeOfUserChoice) {
        0 -> println("Вы не угадали ни одного числа")
        1 -> println("Вы угадали 1 число, получаете утешительный приз")
        2 -> println("Вы угадали 2 числа и получаете крупный приз!")
        3 -> println("Вы угадали все числа и выигрываете джекпот!")
    }
    println("Сегодня победили числа ${setOfWinningNumbers.elementAt(0)}, ${setOfWinningNumbers.elementAt(1)}," +
            " ${setOfWinningNumbers.elementAt(2)}")
}