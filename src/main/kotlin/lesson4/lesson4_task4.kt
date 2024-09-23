package org.example.lesson4

fun main() {
    val dayOfTraining: Int = 5
    val isEvenDay: Boolean = dayOfTraining % 2 == 0
    var isHandExercise: Boolean = isEvenDay
    var isFoodExercise: Boolean = !isEvenDay
    var isBackExercise: Boolean = !isEvenDay
    var isPressExercise: Boolean = isEvenDay

    println(
        """
        Упражнения для рук:    $isHandExercise
        Упражнения для ног:    $isFoodExercise
        Упражнения для спины:  $isBackExercise
        Упражнения для пресса: $isPressExercise
    """.trimIndent()
    )
}