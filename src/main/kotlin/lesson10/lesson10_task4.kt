package org.example.lesson10

fun main() {
    var sumOfHumansWins: Int = 0
    var sumOfMachinesWins: Int = 0
    var sumOfDraw: Int = 0
    var diceOfHuman: Int
    var diceOfMachine: Int

    while (restartGame() == "да") {
        diceOfHuman = dicesRoll()
        println("Вы выбросили $diceOfHuman")
        Thread.sleep(500)
        diceOfMachine = dicesRoll()
        println("Компьютер выбросил $diceOfMachine")
        Thread.sleep(500)
        if (diceOfHuman > diceOfMachine) sumOfHumansWins++
        else if (diceOfHuman == diceOfMachine) sumOfDraw++
        else sumOfMachinesWins++
    }
    if (sumOfHumansWins > sumOfMachinesWins) println("Вы выиграли со счетом $sumOfHumansWins - $sumOfMachinesWins")
    else if (sumOfHumansWins == sumOfMachinesWins) println("Ничья со счетом $sumOfMachinesWins - $sumOfHumansWins")
    else println("Компьютер выиграл со счетом $sumOfMachinesWins - $sumOfHumansWins")
}

fun dicesRoll(): Int {
    val diceScore: Int = (1..6).random()
    return diceScore
}

fun restartGame(): String {
    val restartGame: String
    println("Бросить кости?")
    restartGame = readln()
    return (restartGame)
}