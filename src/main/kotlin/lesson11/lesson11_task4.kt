package org.example.lesson11

data class CategoryOfRecipe(
    val nameOfCategory: String,
    val imageOfCategory: String,
    val recipes: List<Recipe>,
)
data class Recipe(
    val nameOfDish: String,
    val quantityOfPortion: Int,
    val listOfIngredients: List<Ingredient>,
    val cookingMethod: String,
)
data class Ingredient(
    val nameOfIngredient: String,
    val unitOfCalculation: String,
)
