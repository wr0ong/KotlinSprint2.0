package org.example.lesson8

fun main() {
    val viewingInMonday: Int = 523
    val viewingInTuesday: Int = 436
    val viewingInWednesday: Int = 536
    val viewingInThursday: Int = 654
    val viewingInFriday: Int = 456
    val viewingInSaturday: Int = 776
    val viewingInSunday: Int = 786
    val arrayOfViewing: IntArray

    arrayOfViewing = intArrayOf(
        viewingInMonday, viewingInTuesday, viewingInWednesday,
        viewingInThursday, viewingInFriday, viewingInSaturday, viewingInSunday
    )

    val sumOfViewings = arrayOfViewing.sum()
    println("Просмотров за неделю: $sumOfViewings")
}