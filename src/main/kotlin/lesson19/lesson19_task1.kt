package org.example.lesson19

fun main() {
    var result: String = ""
    print("Вы можете добавить в свой аквариум: ")
    for (i in FishOfAquarium.entries) result += ("${i.typeOfFish}, ")
    print(result.dropLast(2))
}

enum class FishOfAquarium(val typeOfFish: String) {
    GUPPY("Guppy"),
    ANGELFISH("Angelfish"),
    GOLDFISH("Goldfish"),
    SIAMESE_FIGHTING_FISH("Siamese fighting fish")
}