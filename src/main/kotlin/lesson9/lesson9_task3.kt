package org.example.lesson9

fun main() {
    val quantityOfPortions: Int
    val mutableListOfQuantity: MutableList<Int> = mutableListOf(2, 50, 15)

    println("Сколько порций необходимо?")
    quantityOfPortions = readln().toInt()
    mutableListOfQuantity.replaceAll { it * quantityOfPortions }

    val mutableListOfIngredients: MutableList<String> = mutableListOf(
        "Яиц - ${mutableListOfQuantity[0]}шт.", "Молока - ${mutableListOfQuantity[1]}мл.",
        "Сливочного масла - ${mutableListOfQuantity[2]}г."
    )

    println(
        "На $quantityOfPortions порций вам понадобится: ${mutableListOfIngredients[0]}, " +
                "${mutableListOfIngredients[1]}, ${mutableListOfIngredients[2]}"
    )
}