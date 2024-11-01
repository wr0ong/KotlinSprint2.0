package org.example.lesson19

class Spaceship(){
    fun takeOff(){
       // TODO Нужна информация о дополнительной логике
    }

    fun lend(){
        TODO("Добавить логику приземления")
    }

    fun shootFromAsteroid(){
        println("Начало отстрела от астероидов")
    }
}


fun main(){
    val spaceship: Spaceship = Spaceship()
    spaceship.takeOff()
    spaceship.shootFromAsteroid()
    spaceship.lend()
}