package org.example.lesson2

fun main() {
    var crystalMineral: Int = 11
    var irenMineral: Int = 7
    val buffPower: Float = 20f

    var crystalMineralFromBuff: Float = crystalMineral * (buffPower / 100)
    var irenMineralFromBuff: Float = irenMineral * (buffPower / 100)

    println("${crystalMineralFromBuff.toInt()}\n${irenMineralFromBuff.toInt()}")
}