package org.example.lesson21

fun List<Int>.evenNumbersSum() {
    var sumOfEvens: Int = 0
    sumOfEvens = this.filter { it % 2 == 0 }
        .sum()
    println(sumOfEvens)
}

fun main() {
    val listOfInts: List<Int> = listOf(1, 6, 2, 3, 3, 6, 5, 15, 13, 14, 17, 16)

    listOfInts.evenNumbersSum()
}