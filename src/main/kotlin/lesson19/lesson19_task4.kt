package org.example.lesson19

enum class Missile(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20)
}

class Tank(private val model: String) {
    private var missileOnTank: Missile? = null
    fun charge(missile: Missile) {
        missileOnTank = missile
        println("Танк $model заряжен снарядом типа ${missile.name} с уроном ${missile.damage}")
    }

    fun shoot() {
        if (missileOnTank == null) println("Танк не заряжен! Невозможно вести огонь!")
        else {
            val percentage: Int = (0..100).random()

            if (percentage <= 20) println("Танк $model не попал в цель!")
            else println("Попадание! Танк $model нанес врагу ${missileOnTank!!.damage} урона!")
        }
    }
}

    fun main() {
        val tank1 = Tank("T-90")
        val tank2 = Tank("T-80")

        tank1.shoot()

        tank1.charge(Missile.RED)
        tank2.charge(Missile.GREEN)
        tank1.shoot()
        Thread.sleep(400)
        tank2.shoot()
        Thread.sleep(400)
        println("Перезарядка...")
        Thread.sleep(500)
        tank1.charge(Missile.GREEN)
        tank2.charge(Missile.BLUE)
        tank1.shoot()
        Thread.sleep(400)
        tank2.shoot()
    }