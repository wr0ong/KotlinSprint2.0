package org.example.lesson22

class RegularBook(val title: String, val author: String) {}

data class DataBook(val title: String, val author: String) {}

fun main() {
    val regularBook1 = RegularBook("Рецепты", "Сергей Петров")
    val regularBook2 = RegularBook("Рецепты", "Сергей Петров")
    val regularBook1_1 = regularBook1
    val dataBook1 = DataBook("Рецепты", "Сергей Петров")
    val dataBook2 = DataBook("Рецепты", "Сергей Петров")


    println(regularBook1 == regularBook2)
    println(regularBook1.equals(regularBook2)) // Тоже самое, что и "=="
    // Оператор сравнения вернет false, так как ссылаются на разные объекты (regularBook1 и regularBook2)

    println(regularBook1 == regularBook1_1)
    // Оператор сравнения вернет true, так как переменные ссылаются на один объект

    println(regularBook1 === regularBook2)
    // Оператор ссылочного сравнения вернет false, так как ссылки отличаются

    println(regularBook1.author == regularBook2.author)
    println(regularBook1.title == regularBook2.title)
    // Сравнивая свойства класса, мы сравниваем значения переменных, так как они равны, возвращается true

    println(regularBook1.hashCode() == regularBook2.hashCode())
    // Метод hashCode() возвращает значение Int, они отличаются, так как два объекта класса считаются различными

    println(regularBook1.toString() == regularBook2.toString())
    /* Метод toString() возвращает сообщение String, содержит ссылку на файл, имя класса и числовое значение,
    отличаются числовые значения, поэтому false */


    println(dataBook1 == dataBook2)
    println(dataBook1.equals(dataBook2)) // Тоже самое, что и "=="
    /* Так как в классах данных переопределены методы equals, toString, hashCode. Если объекты определены
    с одинаковыми свойствами в конструкторе класса (или ссылки указывают на 1 объект), оператор сравнения вернет true */

    println(dataBook1 === dataBook2)
    // Оператор ссылочного сравнения вернет false, так как ссылки отличаются, хоть и объекты считаются равными

    println(dataBook1.title == dataBook2.title)
    println(dataBook1.author == dataBook2.author)
    // Переменные свойств класса равны, соответственно, возвращается true

    println(dataBook1.hashCode() == dataBook2.hashCode())
    // Метод hashCode() возвращает одинаковые значения, т.к. объекты класса считаются равными (свойства одинаковые)ъ

    println(dataBook1.toString() == dataBook2.toString())
    /* Метод toString() теперь возвращает имя класса и все свойства класса, определенные в конструкторе, так как имя класса
    и свойства в конструкторе совпадают (считаются равными), возвращается true. */
}