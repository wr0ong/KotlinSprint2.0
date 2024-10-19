package org.example.lesson16

class Player(
    private var nameOfPlayer: String,
    private var healthPoint: Int = 100,
    private var damage: Int = 40,
) {
    private var statusOfPlayer: String = "жив"
    fun heal() {
        if (statusOfPlayer == "жив") {
            healthPoint += 15
            println("$nameOfPlayer полечился, его хп составляет $healthPoint единиц!")
        } else println("Нельзя лечить мертвеца, $nameOfPlayer мертв!")
    }

    fun attack(): Int {
        return damage
    }

    fun getDamage(damage: Int) {
        healthPoint -= damage
        if (damage == 0) println("Враг повержен, игрок $nameOfPlayer победил!")
        else if (healthPoint <= 0) {
            this.damage = 0
            statusOfPlayer = "погиб"
            println("Игрок ${nameOfPlayer + " " + statusOfPlayer}!")
        } else {
            println("$nameOfPlayer, вам нанесли урон $damage!, осталось $healthPoint единиц здоровья!")
        }
    }
}

fun main() {
    val player1: Player = Player(nameOfPlayer = "byDen", damage = 35)
    val player2: Player = Player(nameOfPlayer = "Sven")

        //player1.attack()
    player2.getDamage(player1.attack())
    Thread.sleep(500)
    player2.attack()
    player1.getDamage(player2.attack())
    Thread.sleep(500)
    player1.attack()
    player2.getDamage(player1.attack())
    Thread.sleep(500)
    player2.attack()
    player1.getDamage(player2.attack())
    Thread.sleep(500)
    player1.heal()
    Thread.sleep(500)
    player2.heal()
    Thread.sleep(500)
    player1.attack()
    player2.getDamage(player1.attack())
    Thread.sleep(500)
    player2.attack()
    player1.getDamage(player2.attack())
    Thread.sleep(500)
    player1.attack()
    player2.getDamage(player1.attack())

    player1.heal()
}