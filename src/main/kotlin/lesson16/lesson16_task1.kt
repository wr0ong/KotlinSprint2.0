package org.example.lesson16

class Dice(
    private val value: Int = (1..6).random()
){
    fun checkValue(){
        println("Выпало число ${this.value}")
    }
}

fun main(){
    val dice: Dice = Dice()
    dice.checkValue()
}