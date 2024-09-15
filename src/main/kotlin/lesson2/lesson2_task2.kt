package org.example.lesson2

fun main() {
    var sumWorkers: Int = 50
    var sumInterns: Int = 30
    var selaryWorkers: Int = 50000
    var selaryInterns: Int = 30000
    var sumSelaryWorkers: Int = sumWorkers * selaryWorkers
    var sumAllSelayes: Int = sumSelaryWorkers + sumInterns * selaryInterns
    var middleSelaryes: Int = sumAllSelayes / (sumWorkers + sumInterns)

    println("$sumSelaryWorkers\n$sumAllSelayes\n$middleSelaryes")
}