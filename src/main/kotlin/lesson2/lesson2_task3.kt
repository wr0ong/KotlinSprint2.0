package org.example.lesson2

fun main() {
    var hourOfTrainStart: Int = 9
    var minuteOfTrainStart: Int = 39
    var minutesInWay: Int = 457
    var hourOfTrainFinish: Int = (minutesInWay + 39) / 60 + 9
    var minuteOfTrainFinish: Int = minutesInWay % 60

    println("$hourOfTrainFinish:$minuteOfTrainFinish")
}