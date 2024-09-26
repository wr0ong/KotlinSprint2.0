package org.example.lesson9

fun main() {
    val listOfIngredients: List<String> = listOf("Соль", "Перец", "Лосось", "Салат", "Масло")

    println("В рецепте есть следующие ингредиенты: ")
    listOfIngredients.forEach{ println(it) }
}