package org.example.lesson2

import kotlin.math.pow

fun main() {
    var sumContribution: Double = 70000.0
    val percentageOfBank: Double = 16.7

    println("Введите насколько хотите вложить сумму (целое количество лет)")

    try {
        var yearsOfContribution = readln().toInt()
         sumContribution = sumContribution * (CONST_FROM_FORMIL+(percentageOfBank / MAX_PERCENTAGE)).pow(yearsOfContribution)
    } catch (e: Exception) {
        println("Введите корректное число")
        var yearsOfContribution = readln().toInt()
        sumContribution = sumContribution * (CONST_FROM_FORMIL+(percentageOfBank / MAX_PERCENTAGE)).pow(yearsOfContribution)
    } finally {
        println(String.format("Сумма составит %.3f", sumContribution))
    }
}

const val CONST_FROM_FORMIL: Int = 1