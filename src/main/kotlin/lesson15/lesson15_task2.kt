package org.example.lesson15

abstract class WeatherStationStats() {
    val mListOfTemperature: MutableList<Int> = mutableListOf()
    val mListOfAmount: MutableList<Double> = mutableListOf()
}

open class Temperature() : WeatherStationStats() {
}

open class PrecipitationAmount() : WeatherStationStats() {
}

class WeatherServer() : WeatherStationStats() {
    fun getInfo() {
        val result = readln()
        val digit = result.partition { it.isDigit() }
        if (digit.second == "") {
            mListOfTemperature.add(result.toInt())
        }
        else {
            result.toDouble()
            mListOfAmount.add(result.toDouble())}
    }
}

fun main(){
    val weatherInfo1 = WeatherServer()
    weatherInfo1.getInfo()
    weatherInfo1.getInfo()

    weatherInfo1.mListOfAmount.forEach { println("Значение давления $it") }
    weatherInfo1.mListOfTemperature.forEach { println("Значение температуры $it") }
}