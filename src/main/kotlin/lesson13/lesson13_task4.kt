package org.example.lesson13

class PhoneDirectory4(
    var name: String,
    var phoneNumber: Long?,
    var company: String? = null,
) {
    fun printInstance() {
        println("\nСписок всех добавленных контактов:\n")
        println("Имя: ${name}\nНомер: ${phoneNumber}\nКомпания: ${company}\n")
    }
}

fun main() {
    var name: String
    var phoneNumber: Long?
    var company: String?
    var addToBook: String
    var contact: PhoneDirectory4
    val bookOfContacts: MutableList<PhoneDirectory4> = mutableListOf()

    println("Хотите добавить контакт в книгу?")
    addToBook = readln()
    if (addToBook == "да") {
        do {
            println("Введите имя контакта")
            name = readln()
            println("Введите номер контакта")
            phoneNumber = readln().toLongOrNull()
            println("Введите компанию")
            company = readln()
            if (company == "") company = null
            contact = PhoneDirectory4(name, phoneNumber, company ?: "<не указано>")
            if (phoneNumber == null) println("Вы не ввели номер телефона, запись не будет добавлена")
            else bookOfContacts.add(contact)
            println("Хотите добавить еще контакт?")
            addToBook = readln()
        } while (addToBook == "да")
        bookOfContacts.forEach { println("\n${it.name}\n${it.phoneNumber}\n${it.company}\n") }
    }
}