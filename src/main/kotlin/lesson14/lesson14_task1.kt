package org.example.lesson14

open class LinerShip(
    val name: String = "Liner1",
    val speed: Int = 60,
    val carrying: Int = 700,
    val capacity: Int = 250,
    val isSplittingIce: Boolean = false,
) {
    fun printShipInfo() {
        println("Название - $name\nСкорость - $speed км/ч\nГрузоподъемность - $carrying кг\nВместительность - $capacity человек")
        if (isSplittingIce) println("Может колоть лед\n")
        else println("Не может колоть лед\n")
    }

    fun startOfMove() {
        println("Корабль $name начал движение!")
    }
}

class CargoShip(
    name: String = "CargoShip1",
    speed: Int = 45,
    carrying: Int = 2000,
    capacity: Int = 100,
    isSplittingIce: Boolean = false,
) : LinerShip(name, speed, carrying, capacity, isSplittingIce) {
}

class IcebreakerShip(
    name: String = "Icebreaker1",
    speed: Int = 30,
    carrying: Int = 650,
    capacity: Int = 90,
    isSplittingIce: Boolean = true
) : LinerShip(name, speed, carrying, capacity, isSplittingIce) {
}

fun main() {
    val linerShip1: LinerShip = LinerShip()
    val cargoShip1: CargoShip = CargoShip()
    val icebreakerShip1: IcebreakerShip = IcebreakerShip()

    linerShip1.printShipInfo()
    cargoShip1.printShipInfo()
    icebreakerShip1.printShipInfo()
}