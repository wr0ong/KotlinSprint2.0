package org.example.lesson12

class Weather3(dayOfWeek: String, dayTimeTemperature: Int, nightTimeTemperature: Int, presenceOfPrecipitation: Double) {
    var dayOfWeek: String = dayOfWeek
    var dayTimeTemperature: Int = dayTimeTemperature - 273
    var nightTimeTemperature: Int = nightTimeTemperature - 273
    var presenceOfPrecipitation: Double = presenceOfPrecipitation

    fun printInfo() {
        println(
            "Информация для ${dayOfWeek}:\nТемпература днем: $dayTimeTemperature оС \nТемпература ночью: $nightTimeTemperature оС \n" +
                    "Количество осадков: $presenceOfPrecipitation мм\n"
        )
    }
}

fun main() {
    val weatherToDay: Weather3 = Weather3(
        "Вторник",
        287,
        282,
        0.05,
    )

    weatherToDay.printInfo()
}