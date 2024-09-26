package org.example.lesson4

fun main() {

    val reservedTablesToday = 13
    val reservedTablesTomorrow = 9
    val isAccessToday: Boolean = reservedTablesToday < TABLES_IN_CAFE
    val isAccessTomorrow: Boolean = reservedTablesTomorrow < TABLES_IN_CAFE

    println("Доступность столиков на сегодня: $isAccessToday\nДоступность столиков на завтра: $isAccessTomorrow")
}

const val TABLES_IN_CAFE: Int = 13