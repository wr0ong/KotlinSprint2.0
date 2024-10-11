package org.example.lesson15

abstract class WeatherStationStats() {
    open val temperature: Int = 0
    open val precipitation: Double = 0.0
}

class Temperature(override val temperature: Int) : WeatherStationStats() {
}

class PrecipitationAmount(override val precipitation: Double) : WeatherStationStats() {
}

class WeatherServer() {
    fun getInfo() {
        println("Введите значение температуры или количества осадков")
        val result = readln()
        val digit = result.partition { it.isDigit() }
        if ((digit.second == "") || (digit.second == "-")) {
            val temperature: Temperature = Temperature(result.toInt())
            println("Температура: ${temperature.temperature}")
        } else {
            val precipitationAmount: PrecipitationAmount = PrecipitationAmount(result.toDouble())
            println("Осадки: ${precipitationAmount.precipitation}")
        }

    }
}

fun main() {
    val weatherInfo1 = WeatherServer()
    weatherInfo1.getInfo()
    weatherInfo1.getInfo()
}