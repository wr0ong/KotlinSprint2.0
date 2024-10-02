package org.example.lesson12

import kotlin.random.Random

class Weather5(
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
                    "Количество осадков: ${String.format("%.3f", presenceOfPrecipitation)} мм\n"
        )
    }
}

fun main() {
    val listOfDays: MutableList<Weather5> = mutableListOf()
    var count: Int = 0
    while (listOfDays.size < MAX_DAYS) {
        listOfDays.add(
            count, Weather5(
                ('1'..'7').random().toString(),
                (273..298).random(),
                (273..298).random(),
                Random.nextDouble(0.0, 0.2)
            )
        )
        count++
    }
    var midDayTemperature: Double = 0.0
    listOfDays.forEach {midDayTemperature += it.dayTimeTemperature.toDouble() / MAX_DAYS}
    println("Среднее значение температуры днем: ${String.format("%.3f", midDayTemperature) }")

    var midNightTemperature: Double = 0.0
    listOfDays.forEach {midNightTemperature += it.nightTimeTemperature.toDouble() / MAX_DAYS}
    println("Среднее значение температуры ночью: ${String.format("%.3f", midNightTemperature) }")

    val listOfDayTemperature = listOfDays.map { it.dayTimeTemperature }
    val listOfNightTemperature = listOfDays.map { it.nightTimeTemperature }

    val midDaysT = listOfDayTemperature.average()
    println(String.format("Среднее значение температуры днем (другим способом): %.3f", midDaysT))
    val midNightT = listOfNightTemperature.average()
    println(String.format("Среднее значение температуры ночью (другим способом): %.3f", midNightT))

    val listOfPresenceOfPrecipitation = listOfDays.filter { it.presenceOfPrecipitation > 0 }
    val quantityOfDaysWithPrecipitation = listOfPresenceOfPrecipitation.size
    println("Количество дней с осадками: $quantityOfDaysWithPrecipitation")
}


const val MAX_DAYS: Int = 30