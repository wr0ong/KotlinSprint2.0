package org.example.lesson15

abstract class WeatherStationStats(value: Double?) {
    open val value: Double? = null
}

class Temperature(override val value: Double?) : WeatherStationStats(value) {
}

class PrecipitationAmount(override val value: Double?) : WeatherStationStats(value) {
}

class WeatherServer() {
    fun getInfo() {
        println("Введите значение температуры (с + если температура выше 0,с  - если ниже 0) или количества осадков")
        val result = readln()
        val digit = result.partition { it.isDigit() }
        println(digit)
        if ((digit.second == "-.") || (digit.second == "+.") || (digit.second == "-") || (digit.second == "+")) {
            val temperature: Temperature = Temperature(result.toDouble())
            println("Температура: ${temperature.value}")
        } else {
            val precipitationAmount: PrecipitationAmount = PrecipitationAmount(result.toDouble())
            println("Осадки: ${precipitationAmount.value}")
        }

    }
}

fun main() {
    val weatherInfo1 = WeatherServer()
    weatherInfo1.getInfo()
    weatherInfo1.getInfo()
}