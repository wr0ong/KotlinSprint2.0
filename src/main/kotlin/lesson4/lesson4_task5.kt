package org.example.lesson4

fun main() {
    var exploreShipExpeditionReady: Boolean

    var shipDamage: Boolean
    var crewOfShip: Int
    var boxOfProvision: Int
    var favorableWeather: Boolean

    println("Введите есть ли повреждения корабля (true/false)")
    shipDamage = readLine().toBoolean()
    println("Введите количество экипажа корабля")
    crewOfShip = readLine()!!.toInt()
    println("Введите количество ящиков провизии")
    boxOfProvision = readLine()!!.toInt()
    println("Введите благоприятная ли погода (true/false)")
    favorableWeather = readLine().toBoolean()

    if (((shipDamage == false) && (crewOfShip >= CREW_OF_SHIP_MIN) && (crewOfShip <= CREW_OF_SHIP_MAX) &&
                (boxOfProvision > BOX_OF_PROVISION_MIX) && (favorableWeather == true)) || ((shipDamage == true)
                && (crewOfShip == CREW_OF_SHIP_MAX) && (boxOfProvision >= BOX_OF_PROVISION_MIX) && (favorableWeather == true))
    ) {
        exploreShipExpeditionReady = true
    } else exploreShipExpeditionReady = false

    println("Готовность корабля к долгосрочному плаванию: $exploreShipExpeditionReady")
}

const val CREW_OF_SHIP_MIN: Int = 55
const val CREW_OF_SHIP_MAX: Int = 70
const val BOX_OF_PROVISION_MIX: Int = 50