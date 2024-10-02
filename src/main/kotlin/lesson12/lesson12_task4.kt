package org.example.lesson12

class Weather4(
    dayOfWeek: String,
    dayTimeTemperature: Int,
    nightTimeTemperature: Int,
    presenceOfPrecipitation: Double
) {
    var dayOfWeek: String = dayOfWeek
    var dayTimeTemperature: Int = dayTimeTemperature - 273
    var nightTimeTemperature: Int = nightTimeTemperature - 273
    var presenceOfPrecipitation: Double = presenceOfPrecipitation

    init {
        println(
            "Информация для ${dayOfWeek}:\nТемпература днем: ${this.dayTimeTemperature} оС \nТемпература ночью: ${this.nightTimeTemperature} оС \n" +
                    "Количество осадков: $presenceOfPrecipitation мм\n"
        )
    }
}

fun main() {
    val weatherToDay: Weather4 = Weather4(
        "Вторник",
        287,
        282,
        0.05,
    )

}