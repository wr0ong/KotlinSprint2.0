package org.example.lesson20

class NewPlayer(val name: String, var isKeyInBackpack: Boolean = false) {
    fun foundKey() {
        isKeyInBackpack = true
        println("Игрок $name нашел ключ!")
    }
}

fun main() {
    val player: NewPlayer = NewPlayer("123")
    val openTheDoor: (NewPlayer) -> Unit = {
        if (it.isKeyInBackpack) println("Игрок ${it.name} открыл дверь")
        else println("Дверь заперта")
    }

    openTheDoor(player)
    player.foundKey()
    openTheDoor(player)
}

