package org.example.lesson8

fun main() {
    val arrayOfIngredientsForOmelet: Array<String> =
        arrayOf("Соль", "Перец", "Яйцо", "Бекон", "Помидор", "Масло", "Молоко")
    val ingredientToChange: String
    val ingredientOfUser: String

    for (i in arrayOfIngredientsForOmelet) {
        print("$i ")
    }
    println("\nКакой ингредиент вы хотите заменить?")
    ingredientOfUser = readln()
    val indexOfIngredient = arrayOfIngredientsForOmelet.indexOf(ingredientOfUser)
    if (indexOfIngredient != -1) {
        println("Какой бы вы хотели добавить ингредиент?")
        ingredientToChange = readln()
        arrayOfIngredientsForOmelet.set(indexOfIngredient, ingredientToChange)
        print("Готово! Вы сохранили следующий список: ")
        for (i in arrayOfIngredientsForOmelet) {
            print("$i ")
        }
    } else println("Такого ингредиента нет")
}