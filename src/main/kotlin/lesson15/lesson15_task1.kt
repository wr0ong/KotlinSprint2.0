package org.example.lesson15

interface MovableSwim {
    fun movieSwim(): String {
        return ("может плыть")
    }
}

interface MovableFly {
    fun movieFly(): String {
        return ("может летать")
    }
}

class Crucian(val name: String) : MovableSwim

class Seagull(val name: String) : MovableSwim, MovableFly

class Duck(val name: String) : MovableSwim, MovableFly

fun main() {
    val crucian1 = Crucian("Karas")
    val seagull1 = Seagull("Chaika")
    val duck1 = Duck("Utka")

    println("${crucian1.name} ${crucian1.movieSwim()}")
    println("${seagull1.name} ${seagull1.movieFly()} и ${seagull1.movieSwim()}")
    println("${duck1.name} ${duck1.movieFly()} и ${duck1.movieSwim()}")

}