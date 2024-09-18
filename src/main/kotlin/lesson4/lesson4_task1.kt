package org.example.lesson4

fun main() {
    val tablesOnCafe: Int = 13
    var accessTablesToday: Int = 0
    var accessTablesTomorrow: Int = 4
    var reservedTablesOnToday: Int = tablesOnCafe
    var reservedTablesTomorrow: Int = tablesOnCafe - accessTablesTomorrow
    var accessToday: Boolean
    var accessTomorrow: Boolean

    if (reservedTablesOnToday < tablesOnCafe) accessToday = true
    else accessToday = false
    if (reservedTablesTomorrow < tablesOnCafe) accessTomorrow = true
    else accessTomorrow = false

    println("Доступность столиков на сегодня: $accessToday\nДоступность столиков на завтра: $accessTomorrow")
}