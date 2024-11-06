package org.example.lesson21

import java.io.File

fun File.writeInFile(text: String) {
    val newText = text.toLowerCase()
    writeText(newText)
}

fun main(){
    val textFile = File("testFile.txt")
    textFile.createNewFile()
    textFile.writeInFile("AAAAAAAAAAAaadsddasdaDDDDDDDDDDDDDD")
    textFile.appendText("11111")
}
