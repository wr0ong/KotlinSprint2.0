package org.example.lesson8

fun main() {
    val arrayOfIngredientsForOmelet: Array<String> =
        arrayOf("Соль", "Перец", "Яйцо", "Бекон", "Помидор", "Масло", "Молоко")
    val ingredientOfUser: String

    println("Какой ингредиент вас интересует?")
    ingredientOfUser = readln()
    if (arrayOfIngredientsForOmelet.contains(ingredientOfUser)) println("Ингредиент $ingredientOfUser есть в блюде")
    else println("Такого ингредиента в рецепте нет")
}