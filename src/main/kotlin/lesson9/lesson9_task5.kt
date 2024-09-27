package org.example.lesson9

fun main() {
    val setOfIngredients: MutableSet<String> = sortedSetOf()
    var readyText: String
    var count = 1

    do {
        if (count > SIZE_OF_SET_OF_INGREDIENTS) println("Вы ввели какой-то ингредиент несколько раз, введите другой ингредиент")
        println("Введите ингредиент №$count")
        setOfIngredients.add(readln())
        count++

    } while (setOfIngredients.size != SIZE_OF_SET_OF_INGREDIENTS)

    readyText = setOfIngredients.joinToString().capitalize()
    println(readyText)
}

const val SIZE_OF_SET_OF_INGREDIENTS = 5