package org.example.lesson1

fun main() {
    val seconds: Int = 6480
    var hours: Int = seconds / 3600
    val minutes: Int = seconds / 60
    val ostMinutes: Int = (seconds % 3600) / 60
    val ostSeconds: Int = seconds % 60

    if (hours < 10) print("0$hours:") else print("$hours:")
    if (ostMinutes < 10) print("0$ostMinutes:") else print("$ostMinutes:")
    if (ostSeconds < 10) print("0$ostSeconds") else print(ostSeconds)
}