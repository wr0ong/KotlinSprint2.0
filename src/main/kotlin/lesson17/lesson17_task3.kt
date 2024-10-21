package org.example.lesson17

class Directory(name: String, quantityOfFiles: Int) {
    private var isSecret: Boolean = true

    val name = name
        get() {
            if (!isSecret) return field
            else return "Скрытая папка"
        }
    val quantityOfFiles = quantityOfFiles
        get() {
            if (!isSecret) return field
            else return 0
        }

    fun changeStatus() {
        isSecret = false
    }

    fun printInfo() {
        println("Имя папки: ${name}, количество файлов в папке: ${quantityOfFiles}")
    }
}

fun main() {
    val directory1: Directory = Directory("Directory1", 12)

    directory1.printInfo()
    directory1.changeStatus()
    directory1.printInfo()
}