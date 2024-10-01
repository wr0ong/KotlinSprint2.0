package org.example.lesson11

data class CategoryOfRecipe(
    val nameOfCategory: String,
    val imageOfCategory: String,
    val recipes: String,
)
data class Recipe(
    val nameOfDish: String,
    val quantityOfPortion: Int,
    val listOfRecipe: List<String>,
    val cookingMethod: String,
)
data class Ingredient(
    val nameOfIngredient: String,
    val unitOfCalculation: String,
)
