package org.example.lesson12

class Weather() {
    var dayOfWeek: String = "Monday"
    var dayTimeTemperature: Int = 0
    var nightTimeTemperature: Int = 0
    var presenceOfPrecipitation: Double = 0.0

    fun printInfo () {
        println("Информация для ${dayOfWeek}:\nТемпература днем: $dayTimeTemperature оС \nТемпература ночью: $nightTimeTemperature оС \n" +
                "Количество осадков: $presenceOfPrecipitation мм\n")
    }
}

fun main() {
    val mondayWeather = Weather()
    mondayWeather.dayTimeTemperature = 17
    mondayWeather.nightTimeTemperature = 11
    mondayWeather.presenceOfPrecipitation = 0.11
    val tuesdayWeather = Weather()
    tuesdayWeather.dayOfWeek = "Tuesday"
    tuesdayWeather.dayTimeTemperature = 19
    tuesdayWeather.nightTimeTemperature = 12
    tuesdayWeather.presenceOfPrecipitation = 0.07

    mondayWeather.printInfo()
    tuesdayWeather.printInfo()
}