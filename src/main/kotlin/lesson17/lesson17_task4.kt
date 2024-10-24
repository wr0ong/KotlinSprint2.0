package org.example.lesson17

class Package(val number: Int, geolocation: String) {
    var counterOfChangeGeolocation = 1
    var geolocation = geolocation
        get() = field
        set(value) {
            if (this.geolocation != value) {
                counterOfChangeGeolocation++
                field = value
            } else field = value
        }

    fun changeGeolocation(newGeo: String) {
        this.geolocation = newGeo
    }

    fun printInfo() {
        println("Заказ №$number находится в пункте: $geolocation, промежуточная точка №$counterOfChangeGeolocation")
    }
}

fun main() {
    val package1: Package = Package(1, START_OF_WAY)
    package1.printInfo()
    package1.changeGeolocation(START_OF_WAY)
    package1.printInfo()
    package1.changeGeolocation("Промежуточное почтовое отделение города МСК")
    package1.printInfo()
    package1.changeGeolocation("ПВЗ получателя")
    package1.printInfo()
    package1.changeGeolocation("ПВЗ получателя")
    package1.printInfo()
}

const val START_OF_WAY: String = "Место сбора заказа"