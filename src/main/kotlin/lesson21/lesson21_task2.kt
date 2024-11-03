package org.example.lesson21

fun List<Int>.evenNumbersSum() {
    var sumOfEvens: Int = 0
    for (i in 0 until this.size) {
        if (this[i] % 2 == 0) {
            sumOfEvens += this[i]
        }
    }
    println(sumOfEvens)
}

fun main() {
    val listOfInts: List<Int> = listOf(1, 6, 2, 3, 3, 6, 5, 15, 13, 14, 17, 16)

    listOfInts.evenNumbersSum()
}