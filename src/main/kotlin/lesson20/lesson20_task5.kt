package org.example.lesson20


class Robot {
    private var modPhrase: (String) -> String = { it }
    private val mListOfPhrases: MutableList<String> = mutableListOf(
        "я робот", "хороший день сегодня", "скучно чего-то",
        "у меня нет сердца, но есть душа", "я с валли дружил когда-то"
    )
    var phrase = mListOfPhrases[(0..4).random()]

    fun say() = println(modPhrase(phrase))

    fun setModifier(newModifier: (String) -> String) {
        modPhrase = newModifier
    }
}


fun main() {
    val robot: Robot = Robot()

    robot.say()
    robot.setModifier({ it: String -> it.reversed() })
    robot.say()
}