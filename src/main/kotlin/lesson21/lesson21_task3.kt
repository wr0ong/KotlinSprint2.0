package org.example.lesson21

class PlayerNew(val name: String, var healthPoint: Int, val maxHealthPoint: Int = 100) {
    init {
        if (healthPoint > maxHealthPoint) healthPoint = maxHealthPoint
    }
}

fun PlayerNew.isHealthy(): Boolean {
    val isHealthy: Boolean
    isHealthy = healthPoint == maxHealthPoint
    return isHealthy
}

fun main() {
    val newPlayer = PlayerNew("Player1", 100)
    val newPlayer2 = PlayerNew("Player2", 99)

    newPlayer.isHealthy()
    newPlayer2.isHealthy()
}