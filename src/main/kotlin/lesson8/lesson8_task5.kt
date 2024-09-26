package org.example.lesson8

fun main() {
    val sizeArray: Int
    var ingredientToAdd: String
    val separator: String = ", "

    println("Введите количество ингредиентов")
    sizeArray = readln().toInt()
    val arrayOfIngredients: Array<String> = Array(sizeArray, {""})
    for (i in 0..sizeArray-1) {
        println("Введите ингредиент")
        ingredientToAdd = readln()
        arrayOfIngredients.set(i, ingredientToAdd)
    }
    val readyStringOfIngredients = arrayOfIngredients.joinToString(separator)
    println(readyStringOfIngredients)
}