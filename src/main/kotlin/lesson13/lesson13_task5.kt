package org.example.lesson13

class PhoneDirectory5(
    var name: String,
    var phoneNumber: Long?,
    var company: String? = null
) {
    fun printInstance() {
        println("\nКонтакт:\n$name\n$phoneNumber\n$company")
    }
}

fun main() {
    val name: String
    var phoneNumber: String
    val company: String?
    val addToBook: String
    var contact: PhoneDirectory5

    println("Хотите добавить контакт?")
    addToBook = readln()
    if (addToBook == "да") {
        println("Введите имя контакта")
        name = readln()
        println("Введите номер контакта")
        phoneNumber = readln()
        println("Введите компанию")
        company = readln()
        try {
            contact = PhoneDirectory5(name, phoneNumber.toLong(), company)
            contact.printInstance()
        } catch (e: Exception) {
            e.printStackTrace()
            println("Вы ввели некорректный номер телефона, его невозможно внести в книгу")
        }
    }
}