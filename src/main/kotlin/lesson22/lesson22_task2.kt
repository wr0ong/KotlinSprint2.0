package org.example.lesson22

class RegularBook1(val title: String, val author: String)

data class DataBook1(val title: String, val author: String)

fun main() {
    val regularBook = RegularBook1("Преступление и наказание", "Достоевский Ф.М.")
    val dataBook = DataBook1("Новогодние рецепты", "Игнатов В.С.")

    println(regularBook)
    // Метод класса toString() наследуется от класса Any и выводит ссылку, название класса и числовое значение

    println(dataBook)
    /* Метод класса данных toString() переопределен и выводит полезную информацию с названием класса и всеми
опредененными в контрукторе свойствами */
}