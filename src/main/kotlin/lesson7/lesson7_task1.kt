package org.example.lesson7

fun main() {
    val longOfChain: Int = 2
    val longOfPassword: Int = 6
    val mutableListOfPassword: MutableList<String> = mutableListOf()
    var randomString: String
    var randomInt: String

    for (i in 1..longOfPassword / longOfChain) {
        randomString = ('a'..'z').random().toString()
        randomInt = (1..9).random().toString()
        mutableListOfPassword.add(randomString)
        mutableListOfPassword.add(randomInt)
    }
    if (longOfPassword % longOfChain != 0) {
        randomString = ('a'..'z').random().toString()
        mutableListOfPassword.add(randomString)
    }
    mutableListOfPassword.forEach { print(it) }
}
