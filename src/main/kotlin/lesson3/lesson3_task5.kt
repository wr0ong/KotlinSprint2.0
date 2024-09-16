package org.example.lesson3

fun main() {
    val cheesHorizontal = charArrayOf('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H')
    val cheesVertical = charArrayOf('1', '2', '3', '4', '5', '6', '7', '8')
    val moveHorizontal = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8) // + вправо, - влево
    val moveVertical = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8) // + вперед, - назад

    var numberOfMoves: Int = 0
    var moveStartArray: CharArray = charArrayOf(cheesHorizontal[3], cheesVertical[1])
    var moveFinishArray: CharArray = charArrayOf(cheesHorizontal[3], cheesVertical[3])
    var moveNow: String = "${moveStartArray[0]}${moveStartArray[1]}-" +
            "${moveFinishArray[0]}${moveFinishArray[1]};$numberOfMoves"
    var positionArray = moveNow.split('-', ';')
    var fromPosition: String = positionArray[0]

    println(fromPosition)
    var toPosition: String = positionArray[1]

    println(toPosition)
    var numberOfMove: String = positionArray[2]

    println(numberOfMove)

}