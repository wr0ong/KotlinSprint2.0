package org.example.lesson4

fun main() {
    val cargoWeight1: Int = 20
    val cargoSize1: Int = 80
    val cargoWeight2: Int = 50
    val cargoSize2: Int = 100

    var isAverage1: Boolean =
        (cargoWeight1 > MIN_CARGO_WEIGHT) && (cargoWeight1 <= MAX_CARGO_WEIGHT) && (cargoSize1 < MAX_CARGO_SIZE)
    var isAverage2: Boolean =
        (cargoWeight2 > MIN_CARGO_WEIGHT) && (cargoWeight2 <= MAX_CARGO_WEIGHT) && (cargoSize2 < MAX_CARGO_SIZE)

    println("Груз с весом $cargoWeight1 кг и объемом $cargoSize1 соответствует категории 'Average': $isAverage1")
    println("Груз с весом $cargoWeight2 кг и объемом $cargoSize2 соответствует категории 'Average': $isAverage2")

}
const val MIN_CARGO_WEIGHT: Int = 35
const val MAX_CARGO_WEIGHT: Int = 100
const val MAX_CARGO_SIZE: Int = 100