package org.example.lesson22

data class Car(val brand: String, val model: String, val gosNumber: String)

fun main(){
    val car: Car = Car("Mazda", "3", "e052oy")

    val brand = car.component1()
    val model = car.component2()
    val gosNumber = car.component3()

    println("brand: $brand, model: $model, gos number: $gosNumber")
}