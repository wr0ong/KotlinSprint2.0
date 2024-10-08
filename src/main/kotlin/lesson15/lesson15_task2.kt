package org.example.lesson15

import org.example.lesson11.Ingredient

abstract class WeatherStationStats() {
    val mListOfTemperature: MutableList<Temperature> = mutableListOf()
    val mListOfAmount: MutableList<PrecipitationAmount> = mutableListOf()
}

open class Temperature() : WeatherStationStats() {
    val temperature: Int = 0
    init {
        mListOfTemperature.add(temperature)
    }
}

private fun <E> MutableList<E>.add(temperature: Int) {
}

open class PrecipitationAmount() : WeatherStationStats() {
    val amount: Double = 0.0
    init {
        mListOfAmount.add(amount)
    }
}

private fun <E> MutableList<E>.add(amount: Double) {

}

class WeatherServer() : WeatherStationStats() {
    fun getInfo() {
        val result = readln()
        val digit = result.partition { it.isDigit() }
        if (digit.second == "") {
            result.toInt()
            mListOfTemperature.add(result)
        }
        else mListOfAmount.add(result)
    }
}

private fun <E> MutableList<E>.add(element: String) {

}

fun main(){
    val a = WeatherServer()
    a.getInfo()

    println(a.mListOfAmount)
    println(a.mListOfTemperature)
}