package org.example.lesson2

fun main() {
    var sumContribution: Double = 70000.0
    val percentageOfBank: Double = 16.7

    println("Введите насколько хотите вложить сумму (целое количество лет)")
    var yearsOfContribution = readLine()!!.toInt()
    for (i in 1..yearsOfContribution) {
        sumContribution = sumContribution + sumContribution * (percentageOfBank / 100)
        println(String.format("Сумма через $i лет (года) составит %.3f", sumContribution))
    }
}