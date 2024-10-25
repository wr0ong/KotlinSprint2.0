package org.example.lesson18

abstract class Dice() {
    open fun rollDice() {}
}

class FirstDice() : Dice() {
    private val numberOfFaces: Int = 4

    override fun rollDice() {
        val rollResult = (1..numberOfFaces).random()
        println("Результат броска кубика с $numberOfFaces гранями: $rollResult")
    }
}

class SecondDice() : Dice() {
    private val numberOfFaces: Int = 6

    override fun rollDice() {
        val rollResult = (1..numberOfFaces).random()
        println("Результат броска кубика с $numberOfFaces гранями: $rollResult")
    }
}

class ThirdDice() : Dice() {
    private val numberOfFaces: Int = 8

    override fun rollDice() {
        val rollResult = (1..numberOfFaces).random()
        println("Результат броска кубика с $numberOfFaces гранями: $rollResult")
    }
}

fun main() {
    val firstDice: FirstDice = FirstDice()
    val secondDice: SecondDice = SecondDice()
    val thirdDice: ThirdDice = ThirdDice()

    val mListOfDices: MutableList<Dice> = mutableListOf()

    mListOfDices.add(firstDice)
    mListOfDices.add(secondDice)
    mListOfDices.add(thirdDice)

    mListOfDices.forEach { it.rollDice() }
}

