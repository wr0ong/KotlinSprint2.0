package org.example.lesson4

fun main() {

    val accessTablesToday = 0
    val accessTablesTomorrow = 4
    var accessToday: Boolean = TABLES_IN_CAFE > TABLES_IN_CAFE - accessTablesToday
    var accessTomorrow: Boolean = TABLES_IN_CAFE > TABLES_IN_CAFE - accessTablesTomorrow

    println("Доступность столиков на сегодня: $accessToday\nДоступность столиков на завтра: $accessTomorrow")
}

const val TABLES_IN_CAFE: Int = 13