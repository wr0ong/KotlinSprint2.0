package org.example.lesson17

class Ship(
    _nameOfShip: String,
    _speed: Int,
    _portOfShip: String,
) {
    var nameOfShip = _nameOfShip
        get() = field
        set(value) {
            println("Нельзя изменить имя!")
            field = nameOfShip
        }

    var speed = _speed
    var portOfShip = _portOfShip
}

fun main() {
    val ship1: Ship = Ship("Polundra", 71, "Port1")

    ship1.nameOfShip = "OOOOOidsad"

    println("Имя на данный момент: ${ship1.nameOfShip}")
}