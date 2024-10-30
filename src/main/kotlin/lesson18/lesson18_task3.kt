package org.example.lesson18

abstract class Animals() {
    open fun eat() {}
    open fun sleep() {
        println("спит. Zzz")
    }
}

class Fox(val name: String) : Animals() {
    private val food: String = "ягоды"
    override fun eat() {
        println("$name ест $food")
    }
}

class Dog(val name: String) : Animals() {
    private val food: String = "кости"
    override fun eat() {
        println("$name ест $food")
    }
}

class Cat(val name: String) : Animals() {
    private val food: String = "рыбу"
    override fun eat() {
        println("$name ест $food")
    }
}

fun main() {
    val fox: Fox = Fox("Foxy")
    val dog: Dog = Dog("Bobik")
    val cat: Cat = Cat("Boris")
    val mListOfAnimals: MutableList<Animals> = mutableListOf()

    mListOfAnimals.add(fox)
    mListOfAnimals.add(dog)
    mListOfAnimals.add(cat)

    for (i in mListOfAnimals) {
        i.eat()
    }
}

