package org.example.lesson15

val mListOfPassengers: MutableList<String> = mutableListOf()
val mListOfCargoWeight: MutableList<Double> = mutableListOf()

abstract class Car(
    val brand: String,
    val model: String,
) : Move, Load {
}

class Truck(brand: String, model: String) : Car(brand, model) {

    override fun loadPassengerCar() {
        println("Это грузовой автомобиль, действие недоступно..")
    }

    override fun loadTruck() {
        val isMovePassenger: Boolean
        val nameOfPassenger: String
        val cargoWeight: Double

        println("Поедет ли пассажир?")
        isMovePassenger = readln().toBoolean()
        if (isMovePassenger) {
            println("Введите имя пассажира")
            nameOfPassenger = readln()
            mListOfPassengers.add(nameOfPassenger)
        } else println("Тогда перейдем к грузу..")
        println("Какой вес груза будем укладывать?")
        cargoWeight = readln().toDouble()
        if (cargoWeight <= MAX_CARGO_WEIGHT_IN_TRUCK) mListOfCargoWeight.add(cargoWeight)
        else println("Груз слишком большой, не сможем его погрузить")

        println("В машинах на данный момент: ${mListOfPassengers.size} человек, ${mListOfCargoWeight.sum()} тонн груза")
    }
}

class PassengerCar(brand: String, model: String) : Car(brand, model) {
    override fun loadTruck() {
        println("Это легковой автомобиль, действие недоступно..")
    }

    override fun loadPassengerCar() {
        val sumOfPassengers: Int
        var nameOfPassenger: String

        println("Сколько пассажиров поедет?")
        sumOfPassengers = readln().toInt()
        if (sumOfPassengers > MAX_PASSENGERS_IN_PASSENGER_CAR) println("Это слишком много, столько не влезет")
        else {
            for (i in 0 until sumOfPassengers) {
                println("Введите имя пассажира")
                nameOfPassenger = readln()
                mListOfPassengers.add(nameOfPassenger)
            }
            println("В машинах на данный момент: ${mListOfPassengers.size} человек, ${mListOfCargoWeight.sum()} тонн груза")
        }
    }
}

interface Move {
    fun move() {
        println("Машина уехала")
    }
}

interface Load {
    fun loadTruck()

    fun loadPassengerCar()
}

fun main() {
    val passengersNeedToMove = 6
    val weightOfCargoNeed = 2.0
    val truck1: Truck = Truck(
        brand = "MAN",
        model = "TGX 4x2",
    )

    val truck2: Truck = Truck(
        brand = "MAN",
        model = "TGS 6x4",
    )

    val passengerCar1: PassengerCar = PassengerCar(
        brand = "Honda",
        model = "Civic",
    )

    val passengerCar2: PassengerCar = PassengerCar(
        brand = "Mazda",
        model = "3",
    )
    while ((mListOfPassengers.size <= passengersNeedToMove) && (mListOfCargoWeight.sum() <= weightOfCargoNeed)) {
        truck1.loadTruck()
        truck1.move()
        truck2.loadTruck()
        truck2.move()
        passengerCar1.loadPassengerCar()
        passengerCar1.loadTruck()
        passengerCar1.move()
        passengerCar2.loadPassengerCar()
        passengerCar2.move()
    }
}

const val MAX_PASSENGERS_IN_PASSENGER_CAR = 3
const val MAX_CARGO_WEIGHT_IN_TRUCK = 2.0
