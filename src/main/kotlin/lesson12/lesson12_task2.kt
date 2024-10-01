package org.example.lesson12

class Weather2(
    var dayOfWeek: String,
    var dayTimeTemperature: Int,
    var nightTimeTemperature: Int,
    var presenceOfPrecipitation: Double,
) {

    fun printInfo() {
        println(
            "Информация для ${dayOfWeek}:\nТемпература днем: $dayTimeTemperature оС \nТемпература ночью: $nightTimeTemperature оС \n" +
                    "Количество осадков: $presenceOfPrecipitation мм\n"
        )
    }
}

fun main() {
    val mondayWeather2 = Weather2(
        "Monday",
        19,
        14,
        0.11,
    )

    mondayWeather2.printInfo()
}