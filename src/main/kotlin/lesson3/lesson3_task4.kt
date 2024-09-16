package org.example.lesson3

fun main() {
    val cheesHorizontal = charArrayOf('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H')
    val cheesVertical = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    val moveHorizontal = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8) // + вправо, - влево
    val moveVertical = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8) // + вперед, - назад
    var moveNow: String

    var fromPosition: String = "${cheesHorizontal[4]}${cheesVertical[1]}"
    var toPosition: String = "${cheesHorizontal[4]}${cheesVertical[3]}"
    var moveNumber: Int = 1

    moveNow = "$fromPosition-$toPosition;$moveNumber"
    println(moveNow)

    fromPosition = "${cheesHorizontal[3]}${cheesVertical[1]}"
    toPosition = "${cheesHorizontal[3]}${cheesVertical[1] + moveVertical[0]}"
    moveNumber++
    moveNow = "$fromPosition-$toPosition;$moveNumber"
    println(moveNow)

}