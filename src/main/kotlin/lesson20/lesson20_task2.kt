package org.example.lesson20

class Player(val name: String, var healthPoint: Int, val maxHealthPoint: Int = 100)

fun main(){
    val takePotion: (Player) -> Unit = {it.healthPoint = it.maxHealthPoint; println("Вы подобрали лечебное зелье и излечились до максимального уровня хп") }
    val player: Player = Player("qwerty", 50)
    println("Текущее здоровье - ${player.healthPoint}")
    takePotion(player)
    println("Текущее здоровье - ${player.healthPoint}")
}