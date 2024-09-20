package org.example.lesson4

fun main() {

    var accessTablesToday: Int = 0
    var accessTablesTomorrow: Int = 4
    var accessToday: Boolean
    var accessTomorrow: Boolean

    if (TABLES_IN_CAFE <= TABLES_IN_CAFE - accessTablesToday) accessToday = false
    else accessToday = true
    if (TABLES_IN_CAFE <= TABLES_IN_CAFE - accessTablesTomorrow) accessTomorrow = false
    else accessTomorrow = true

    println("Доступность столиков на сегодня: $accessToday\nДоступность столиков на завтра: $accessTomorrow")
}

const val TABLES_IN_CAFE: Int = 13