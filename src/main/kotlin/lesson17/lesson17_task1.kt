package org.example.lesson17

class Victorina(
    question: String,
    answer: String,
) {
    var question = question
        get() = field

    var answer = answer
        get() = field
        set(value) {
            field = value
        }

    init {
        this.answer = answer
    }
}

fun main() {
    val victorina1: Victorina = Victorina("Cколько часов в неделе?", "168")

    println(victorina1.question)
    println(victorina1.answer)
}