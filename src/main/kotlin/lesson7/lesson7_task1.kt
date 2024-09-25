package org.example.lesson7

fun main() {
    val longOfChain: Int = 2
    val mutableListOfPassword: MutableList<String> = mutableListOf()
    var randomString: String
    var randomInt: String

    for (i in 1 .. LONG_OF_PASSWORD/longOfChain) {
        randomString = ('a'..'z').random().toString()
        randomInt = (1..9).random().toString()
        mutableListOfPassword.add(randomString)
        mutableListOfPassword.add(randomInt)
    }
mutableListOfPassword.forEach{ print(it) }
}

const val LONG_OF_PASSWORD = 6