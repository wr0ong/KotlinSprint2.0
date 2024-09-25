package org.example.lesson4

fun main() {
    val isSunny: Boolean = true
    val isTentOpen: Boolean = true
    val airHumidity: Int = 20
    val seasonOfYear: String = "Зима"
    val isFavorableConditions: Boolean

    isFavorableConditions = ((isSunny == IS_WEATHER_SUNNY) && (isTentOpen == IS_TENT_OPEN_NEED) &&
            (airHumidity == AIR_HUMIDITY_NEED) && (seasonOfYear != SEASON_OF_YEAR_NOT_NEED))

    println("Благоприятны ли условия сейчас для роста бобовых? $isFavorableConditions")

}

const val IS_WEATHER_SUNNY: Boolean = true
const val IS_TENT_OPEN_NEED: Boolean = true
const val AIR_HUMIDITY_NEED: Int = 20
const val SEASON_OF_YEAR_NOT_NEED: String = "Зима"