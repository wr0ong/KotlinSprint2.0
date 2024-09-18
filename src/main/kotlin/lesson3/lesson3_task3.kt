package org.example.lesson3

fun main() {
    val arrayOfNumbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    var multiplier: Int = 5

    println("""
        $multiplier * ${arrayOfNumbers[0]} = ${multiplier*arrayOfNumbers[0]}
        $multiplier * ${arrayOfNumbers[1]} = ${multiplier*arrayOfNumbers[1]}
        $multiplier * ${arrayOfNumbers[2]} = ${multiplier*arrayOfNumbers[2]}
        $multiplier * ${arrayOfNumbers[3]} = ${multiplier*arrayOfNumbers[3]}
        $multiplier * ${arrayOfNumbers[4]} = ${multiplier*arrayOfNumbers[4]}
        $multiplier * ${arrayOfNumbers[5]} = ${multiplier*arrayOfNumbers[5]}
        $multiplier * ${arrayOfNumbers[6]} = ${multiplier*arrayOfNumbers[6]}
        $multiplier * ${arrayOfNumbers[7]} = ${multiplier*arrayOfNumbers[7]}
        $multiplier * ${arrayOfNumbers[8]} = ${multiplier*arrayOfNumbers[8]}
    """.trimIndent())

}