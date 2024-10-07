package org.example.lesson14

open class LinerShip2(
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

    open fun startLoadingTheShip(){
        println("У $name выдвинут горизонтальный трап со шкуфта, можно начать погрузку...\n")
    }
    open fun stopLoadingTheShip(){
        println("Горизонтальный трап в исходном положении, погрузка судна $name завершена\n")
    }
}

class CargoShip2(
    name: String = "CargoShip1",
    speed: Int = 45,
    carrying: Int = 2000,
    capacity: Int = 100,
    isSplittingIce: Boolean = false,
) : LinerShip2(name, speed, carrying, capacity, isSplittingIce) {
    override fun startLoadingTheShip(){
        println("У корабля $name погрузочный кран активирован, можно начать погрузку...\n")
    }
    override fun stopLoadingTheShip(){
        println("Погрузочный кран в исходном положении, погрузка судна $name завершена\n")
    }
}

class IcebreakerShip2(
    name: String = "Icebreaker1",
    speed: Int = 30,
    carrying: Int = 650,
    capacity: Int = 90,
    isSplittingIce: Boolean = true
) : LinerShip2(name, speed, carrying, capacity, isSplittingIce) {
    override fun startLoadingTheShip(){
        println("У корабля $name ворота со стороны кормы открыты, можно начать погрузку...\n")
    }
    override fun stopLoadingTheShip(){
        println("Ворота закрыты, погрузка судна $name завершена\n")
    }
}

fun main() {
    val linerShip1: LinerShip2 = LinerShip2()
    val cargoShip1: CargoShip2 = CargoShip2()
    val icebreakerShip1: IcebreakerShip2 = IcebreakerShip2()

    linerShip1.printShipInfo()
    cargoShip1.printShipInfo()
    icebreakerShip1.printShipInfo()
    linerShip1.startLoadingTheShip()
    linerShip1.stopLoadingTheShip()
    cargoShip1.startLoadingTheShip()
    cargoShip1.stopLoadingTheShip()
    icebreakerShip1.startLoadingTheShip()
    icebreakerShip1.stopLoadingTheShip()

}