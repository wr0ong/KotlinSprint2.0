package org.example.lesson2

fun main() {
    var hourOfTrainStart: Int = 9
    var minuteOfTrainStart: Int = 39
    var minutesInWay: Int = 457
    var hourOfTrainFinish: Int = (minutesInWay + minuteOfTrainStart) / MINUTES_IN_HOUR + hourOfTrainStart
    var minuteOfTrainFinish: Int = minutesInWay % MINUTES_IN_HOUR

    println("$hourOfTrainFinish:$minuteOfTrainFinish")
}

const val MINUTES_IN_HOUR = 60