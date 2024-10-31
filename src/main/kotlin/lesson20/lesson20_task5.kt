package org.example.lesson20

class Robot {
    private val mListOfPhrases: MutableList<String> = mutableListOf(
        "я робот", "хороший день сегодня", "скучно чего-то",
        "у меня нет сердца, но есть душа", "я с валли дружил когда-то"
    )
    var phrase = mListOfPhrases[(0..4).random()]

    fun say(phrase: String) = println(phrase)

    fun setModifier(phrase_: String) {
        phrase = phrase.reversed()
    }
}

fun main() {
    val robot: Robot = Robot()
    robot.say(robot.phrase)
    robot.setModifier(robot.phrase)
    robot.say(robot.phrase)
}