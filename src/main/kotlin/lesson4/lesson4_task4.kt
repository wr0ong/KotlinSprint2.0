package org.example.lesson4

fun main() {
    var handExercise: Boolean
    var foodExercise: Boolean
    var backExercise: Boolean
    var pressExercise: Boolean
    var dayOfTraining: Int = 5

    if (dayOfTraining % 2 != 0) {
        handExercise = true
        foodExercise = false
        backExercise = false
        pressExercise = true
    } else {
        handExercise = false
        foodExercise = true
        backExercise = true
        pressExercise = false
    }
    println(
        """
        Упражнения для рук:    $handExercise
        Упражнения для ног:    $foodExercise
        Упражнения для спины:  $backExercise
        Упражнения для пресса: $pressExercise
    """.trimIndent()
    )
}