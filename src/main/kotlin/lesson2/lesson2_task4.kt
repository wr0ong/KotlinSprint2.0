package org.example.lesson2

fun main() {
    var crystalMineral: Int = 11
    var irenMineral: Int = 7
    val buffPower: Float = 20f

    var crystalMineralFromBuff: Float = crystalMineral * (buffPower / MAX_PERCENTAGE)
    var irenMineralFromBuff: Float = irenMineral * (buffPower / MAX_PERCENTAGE)

    println("${crystalMineralFromBuff.toInt()}\n${irenMineralFromBuff.toInt()}")
}

public const val MAX_PERCENTAGE: Int = 100