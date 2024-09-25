package org.example.lesson8

fun main() {
    val arrayOfIngredientsForOmelet: Array<String> =
        arrayOf("Соль", "Перец", "Яйцо", "Бекон", "Помидор", "Масло", "Молоко")
    val ingredientOfUser: String

    println("Какой ингредиент вас интересует?")
    ingredientOfUser = readln()
    for (i in arrayOfIngredientsForOmelet) {
        if (i == ingredientOfUser) {
            println("Ингредиент $ingredientOfUser есть в блюде")
            return
        }
    }
    println("Такого ингридиента в рецепте нет")
}