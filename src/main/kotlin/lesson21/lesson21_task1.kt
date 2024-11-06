package org.example.lesson21

fun String.vowelCount() {
    var count: Int = 0
    val listOfVowels: List<Char> = listOf('A', 'E', 'I', 'O', 'U', 'Y', 'a', 'e', 'i', 'o', 'u', 'y')
    for (i in this) {
        if (i in listOfVowels) count++
    }
    println(count)
}

fun main() {
    val newMessage = "hello"
    val newMessage1 = "AeoO"
    newMessage.vowelCount()
    newMessage1.vowelCount()
}