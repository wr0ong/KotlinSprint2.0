package org.example.lesson_3

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.text.SimpleDateFormat

private val dtf = DateTimeFormatter.ofPattern("HH:mm:ss")
private val timeOfNight = "05:00:00"
private val timeOfMorning = "12:00:00"
private val timeOfDay = "18:00:00"
private val timeOfEvening = "23:59:59"
private val range1 = timeOfMorning..timeOfDay
private val range2 = timeOfDay..timeOfEvening
private val range3 = timeOfNight..timeOfMorning

fun main() {
    println("Введите имя пользователя")
    val userName = readLine()
    var welcomeToApp: String = "Доброй ночи, $userName!"
    val now = LocalDateTime.now()

    if (dtf.format(now) in range1) {
        welcomeToApp = "Добрый день, $userName!"
        println(welcomeToApp)
    } else if (dtf.format(now) in range2) {
        welcomeToApp = "Доборый вечер, $userName!"
        println(welcomeToApp)
    } else if (dtf.format(now) in range3) {
        welcomeToApp = "Доброе утро, $userName!"
        println(welcomeToApp)
    } else println(welcomeToApp)
}
