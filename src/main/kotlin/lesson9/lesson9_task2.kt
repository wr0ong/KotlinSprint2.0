package org.example.lesson9

fun main() {
    val mutableListOfIngredients: MutableList<String> = mutableListOf("Хлеб", "Масло", "Колбаса")
    val choiceOfUser: String
    val ingredientOfUser: String

    println("В рецепте есть базовые ингредиенты: \n${mutableListOfIngredients}")

    println("Желаете добавить свой ингредиент?")
    choiceOfUser = readln()
    if (choiceOfUser == "да") {
        println("Какой ингредиент хотите добавить?")
        ingredientOfUser = readln()
        mutableListOfIngredients.add(ingredientOfUser)
        println("Теперь в рецепте есть следующие ингредиенты: \n${mutableListOfIngredients}")
    } else return
}