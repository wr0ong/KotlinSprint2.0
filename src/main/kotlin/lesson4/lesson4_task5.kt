package org.example.lesson4

fun main() {
    val isExploreShipExpeditionReady: Boolean

    val isDamaged: Boolean
    val crewOfShip: Int
    val boxOfProvision: Int
    val isFavorableWeatherNow: Boolean

    println("Введите есть ли повреждения корабля (true/false)")
    isDamaged = readln().toBoolean()
    println("Введите количество экипажа корабля")
    crewOfShip = readln().toInt()
    println("Введите количество ящиков провизии")
    boxOfProvision = readln().toInt()
    println("Введите благоприятная ли погода (true/false)")
    isFavorableWeatherNow = readln().toBoolean()

    if (((isDamaged != IS_CASE_DAMAGE) && (crewOfShip >= CREW_OF_SHIP_MIN) && (crewOfShip <= CREW_OF_SHIP_MAX) &&
                (boxOfProvision > BOX_OF_PROVISION_MIX) && (isFavorableWeatherNow == IS_FAVORABLE_WEATHER)) || ((isDamaged == IS_CASE_DAMAGE) &&
                (crewOfShip == CREW_OF_SHIP_MAX) && (boxOfProvision >= BOX_OF_PROVISION_MIX) && (isFavorableWeatherNow == IS_FAVORABLE_WEATHER))
    ) {
        isExploreShipExpeditionReady = true
    } else isExploreShipExpeditionReady = false

    println("Готовность корабля к долгосрочному плаванию: $isExploreShipExpeditionReady")
}

const val CREW_OF_SHIP_MIN: Int = 55
const val CREW_OF_SHIP_MAX: Int = 70
const val BOX_OF_PROVISION_MIX: Int = 50
const val IS_CASE_DAMAGE: Boolean = true
const val IS_FAVORABLE_WEATHER: Boolean = true