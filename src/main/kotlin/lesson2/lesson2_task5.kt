package org.example.lesson2

fun main() {
    var sumContribution: Double = 70000.0
    val percentageOfBank: Double = 16.7

    println("Введите насколько хотите вложить сумму (целое количество лет)")

    try {
        var yearsOfContribution = readln().toInt()
        for (i in 1..yearsOfContribution) {
            sumContribution = sumContribution + sumContribution * (percentageOfBank / 100)
        }
    } catch (e: Exception) {
        println("Введите корректное число")
        var yearsOfContribution = readln().toInt()
        for (i in 1..yearsOfContribution) {
            sumContribution = sumContribution + sumContribution * (percentageOfBank / 100)
        }
    } finally {
        println(String.format("Сумма составит %.3f", sumContribution))
    }

}