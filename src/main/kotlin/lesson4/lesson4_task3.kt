package org.example.lesson4

fun main() {
    val isSunny: Boolean = true
    val isAwningOpen: Boolean = true
    val airHumidity: Int = 20
    val seasonOfYear: String = "Зима"
    val favorableConditions: Boolean

    if ((isSunny == IS_SUNNY_NEED) && (isAwningOpen == IS_AWNING_OPEN_NEED) && (airHumidity == AIR_HUMIDITY_NEED) &&
        (seasonOfYear != SEASON_OF_YEAR_NOT_NEED)) favorableConditions = true
    else favorableConditions = false

    println("Благоприятны ли условия сейчас для роста бобовых? $favorableConditions")

}

const val IS_SUNNY_NEED: Boolean = true
const val IS_AWNING_OPEN_NEED: Boolean = true
const val AIR_HUMIDITY_NEED: Int = 20
const val SEASON_OF_YEAR_NOT_NEED: String = "Зима"