package org.example.lesson9

fun main() {
    println("Введите 5 ингредиентов рецепта")
    var listOfIngredients = readln().split(", ").toList()
    while (listOfIngredients.size != 5) {
        println("Введите 5 ингредиентов")
        listOfIngredients = readln().split(", ").toList()
    }
    println(listOfIngredients.sorted())
}