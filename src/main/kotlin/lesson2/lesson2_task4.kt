package org.example.lesson2

fun main() {
    var crystalMineral: Int = 11
    var irenMineral: Int = 7
    val buffPower: Float = 0.2f
    var crystalMineralFromBuff: Float = crystalMineral * buffPower
    var irenMineralFromBuff: Float = irenMineral * buffPower

    println("${crystalMineralFromBuff.toInt()}\n${irenMineralFromBuff.toInt()}")
}