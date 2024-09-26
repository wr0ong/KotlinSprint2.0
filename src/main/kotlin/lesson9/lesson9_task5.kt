package org.example.lesson9

fun main() {
    val listOfIngredients: MutableList<String> = mutableListOf()
    var newList: MutableList<String> = mutableListOf()
    var readyText: String
    var count = 1

    do {
        if (count > 5) println("Вы ввели какой-то ингредиент несколько раз, введите другой ингредиент")

        println("Введите ингредиент №$count")
        listOfIngredients.add(readln())
        newList = listOfIngredients.distinct().toMutableList()
        count++

    } while (newList.size != 5)
    newList.sort()

    readyText = newList.joinToString().capitalize()
    println(readyText)
}