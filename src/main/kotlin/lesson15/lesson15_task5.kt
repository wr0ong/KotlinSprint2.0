package org.example.lesson15

import kotlin.coroutines.CoroutineContext

abstract class Car(
    val brand: String,
    val model: String,
    val gosNumber: String,
    open val mListOfPassengers: MutableList<String> = mutableListOf(),
    open val mListOfCargoWeight: MutableList<Double> = mutableListOf(),
) : Load, Move {
}

class Truck(
    brand: String,
    model: String,
    gosNumber: String,
) : Car(brand, model, gosNumber) {

    override fun loadPassengerCar(mListOfPassengersInPassengerCar: MutableList<String>) {
        println("Это грузовой автомобиль, действие недоступно..")
    }

    override fun move() {
        println("Машина ${this.brand + " " + this.model + "номер :" + this.gosNumber} выехала")
    }

    fun getInformation(): Triple<Boolean, String, Double> {
        var nameOfPassenger: String = ""
        val isMovePassenger: Boolean
        println("Поедет ли пассажир?")
        isMovePassenger = readln().toBoolean()
        if (isMovePassenger) {
            println("Введите имя пассажира")
            nameOfPassenger = readln()
        }
        println("Введите вес груза")
        var cargoWeight: Double = readln().toDouble()
        if (cargoWeight > MAX_CARGO_WEIGHT_IN_TRUCK) cargoWeight = 0.0

        return Triple(isMovePassenger, nameOfPassenger, cargoWeight)
    }

    override fun loadTruck(isMovePassenger: Boolean, nameOfPassenger: String, cargoWeight: Double) {
        if (nameOfPassenger != "") mListOfPassengers.add(nameOfPassenger)
        if (cargoWeight != 0.0) mListOfCargoWeight.add(cargoWeight)
        else println("Груз слишком большой, он не поместится")
        if (nameOfPassenger != "") println("Погрузка завершена, погружено $cargoWeight т груза и пассажир $nameOfPassenger")
        else println("Погрузка завершена, погружено $cargoWeight т груза")
    }
}

class PassengerCar(
    brand: String,
    model: String,
    gosNumber: String,
) : Car(brand, model, gosNumber) {
    override fun move() {
        println("Машина ${this.brand + " " + this.model + "номер :" + this.gosNumber} выехала")
    }

    override fun loadTruck(isMovePassenger: Boolean, nameOfPassenger: String, cargoWeight: Double) {
        println("Это легковой автомобиль, действие недоступно..")
    }

    fun getInformation(): MutableList<String> {
        val sumOfPassengers: Int
        var nameOfPassenger: String
        val mListOfPassengersInPassengerCar: MutableList<String> = mutableListOf()

        println("Сколько пассажиров поедет?")
        sumOfPassengers = readln().toInt()
        if (sumOfPassengers > MAX_PASSENGERS_IN_PASSENGER_CAR) println("Это слишком много, столько не влезет")
        else {
            for (i in 0 until sumOfPassengers) {
                println("Введите имя пассажира")
                nameOfPassenger = readln()
                mListOfPassengersInPassengerCar.add(nameOfPassenger)
            }
            println("В машину село ${mListOfPassengersInPassengerCar.size} пассажира")
        }
        return mListOfPassengersInPassengerCar
    }

    override fun loadPassengerCar(mListOfPassengersInPassengerCar: MutableList<String>) {
        mListOfPassengers.addAll(mListOfPassengersInPassengerCar)
    }
}

interface Move {
    fun move()
}

interface Load {
    fun loadTruck(isMovePassenger: Boolean, nameOfPassenger: String, cargoWeight: Double)
    fun loadPassengerCar(mListOfPassengersInPassengerCar: MutableList<String>)
}

fun main() {
    val mListOfAllPassengers: MutableList<String> = mutableListOf()
    val mListOfAllCargoWeight: MutableList<Double> = mutableListOf()
    val passengersNeedToMove = 6
    val weightOfCargoNeed = 2.0
    val truck1: Truck = Truck(
        brand = "MAN",
        model = "\"TGX 4x2\"",
        gosNumber = "c052cp"
    )

    val truck2: Truck = Truck(
        brand = "MAN",
        model = "\"TGS 6x4\"",
        gosNumber = "e777ac"
    )

    val passengerCar1: PassengerCar = PassengerCar(
        brand = "Honda",
        model = "\"Civic\"",
        gosNumber = "a332po"
    )

    val passengerCar2: PassengerCar = PassengerCar(
        brand = "Mazda",
        model = "\"3\"",
        gosNumber = "x218xe"
    )

    while (mListOfAllPassengers.size < NEED_DELIVERY_PASSENGERS) {
        val mListOfPassengers1 = passengerCar1.getInformation()
        passengerCar1.loadPassengerCar(mListOfPassengers1)
        mListOfAllPassengers.addAll(passengerCar1.mListOfPassengers)
        passengerCar1.move()
        println("Уже уехало ${mListOfAllPassengers.size} пассажиров")
        passengerCar1.mListOfPassengers.clear()
        val mListOfPassengers2 = passengerCar2.getInformation()
        passengerCar2.loadPassengerCar(mListOfPassengers2)
        mListOfAllPassengers.addAll(passengerCar2.mListOfPassengers)
        passengerCar2.move()
        println("Уже уехало ${mListOfAllPassengers.size} пассажиров")
        passengerCar2.mListOfPassengers.clear()
    }

    while (mListOfAllCargoWeight.sum() < MAX_CARGO_WEIGHT_IN_TRUCK) {
        val (isMovePassenger1, nameOfPassenger1, cargoWeight1) = truck1.getInformation()
        truck1.loadTruck(isMovePassenger1, nameOfPassenger1, cargoWeight1)
        mListOfAllCargoWeight.add(truck1.mListOfCargoWeight.last())
        if (truck1.mListOfPassengers.isNotEmpty()) {
            mListOfAllPassengers.add(truck1.mListOfPassengers.last())
        }
        truck1.move()
        println("Уже погружено и перевезено ${mListOfAllCargoWeight.sum()} т груза")

        val (isMovePassenger2, nameOfPassenger2, cargoWeight2) = truck2.getInformation()
        truck2.loadTruck(isMovePassenger2, nameOfPassenger2, cargoWeight2)
        mListOfAllCargoWeight.add(truck2.mListOfCargoWeight.last())
        if (truck2.mListOfPassengers.isNotEmpty()) {
            mListOfAllPassengers.add(truck2.mListOfPassengers.last())
        }
        truck2.move()
        println("Уже погружено и перевезено ${mListOfAllCargoWeight.sum()} т груза")
    }
    println("Всего перевезено ${mListOfAllPassengers.size} пассажиров и ${mListOfAllCargoWeight.sum()} т груза")
}

const val MAX_PASSENGERS_IN_PASSENGER_CAR = 3
const val MAX_CARGO_WEIGHT_IN_TRUCK = 2.0
const val NEED_DELIVERY_PASSENGERS = 6