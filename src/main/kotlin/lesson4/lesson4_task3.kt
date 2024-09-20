package org.example.lesson4

fun main() {
    var solarWeather: Boolean = true
    var openTend: Boolean = true
    var airHumidity: Int = 20
    var seasonOfYear: String = "Зима"
    var favorableConditions: Boolean

    if ((solarWeather == true) && (openTend == true) && (airHumidity == 20) && (seasonOfYear != "Зима"))
        favorableConditions = true
    else favorableConditions = false

    println("Благоприятны ли условия сейчас для роста бобовых? $favorableConditions")

}