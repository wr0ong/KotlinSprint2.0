package org.example.lesson10

fun main() {
    var sumOfHumans: Int = 0
    var sumOfMachines: Int = 0
    val quantityOfMotion: Int
    var diceOfHuman: Int
    var diceOfMachine: Int

    println("Введите количество бросков")
    quantityOfMotion = readln().toInt()

    for (i in 1..quantityOfMotion) {
        diceOfHuman = diceRoll()
        println("Вы выбросили $diceOfHuman")
        sumOfHumans = sumOfHumans + diceOfHuman
        Thread.sleep(500)
        diceOfMachine = diceRoll()
        println("Компьютер выбросил $diceOfMachine")
        sumOfMachines = sumOfMachines + diceOfMachine
        Thread.sleep(500)
    }
    if (sumOfHumans > sumOfMachines) println("Вы выиграли с суммой $sumOfHumans")
    else if (sumOfHumans == sumOfMachines) println("Ничья с суммой $sumOfHumans")
    else println("Компьютер победил с суммой $sumOfMachines")
}

fun diceRoll(): Int {
    val diceScore: Int = (1..6).random()
    return diceScore
}