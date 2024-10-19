package org.example.lesson17

class Victorina(
    question: String,
    answer: String,
) {
    var question = question
        get() = "Сколько часов в неделе?"

    var answer = answer
        get() = field
        set(answer) {
            field = "168"
        }
    init {
        this.answer = answer
    }
}

fun main() {
    val victorina1: Victorina = Victorina("", "")

    println(victorina1.question)
    println(victorina1.answer)
}