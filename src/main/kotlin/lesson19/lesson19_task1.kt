package org.example.lesson19

fun main() {
    println(
        "Вы можете добавить в свой аквариум: ${FishOfAquarium.GUPPY.typeOfFist}, ${FishOfAquarium.GOLDFISH.typeOfFist}, " +
                "${FishOfAquarium.ANGELFISH.typeOfFist}, ${FishOfAquarium.SIAMESE_FIGHTING_FISH.typeOfFist}"
    )
}

enum class FishOfAquarium(val typeOfFist: String) {
    GUPPY("Guppy"),
    ANGELFISH("Angelfish"),
    GOLDFISH("Goldfish"),
    SIAMESE_FIGHTING_FISH("Siamese fighting fish")
}