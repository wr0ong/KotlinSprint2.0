package org.example.lesson13

val bookOfContacts: MutableList<PhoneDirectory4> = mutableListOf()

class PhoneDirectory4(
    var name: String,
    var phoneNumber: Long?,
    var company: String? = null
) {
    fun printInstance() {
        println("\nСписок всех добавленных контактов:\n")
        bookOfContacts.forEach { println ("Имя: ${it.name}\nНомер: ${it.phoneNumber}\nКомпания: ${it.company}\n") }
    }

    init {
        if (company == "") company = null
        if (phoneNumber == null) println("Вы не ввели номер телефона, запись не будет добавлена")
        else {
            bookOfContacts.add(this)
        }
    }
}

fun main() {
    var name: String
    var phoneNumber: Long?
    var company: String?
    var addToBook: String
    var contact: PhoneDirectory4

    println("Хотите добавить контакт в книгу?")
    addToBook = readln()
    if(addToBook == "да") {
        do {
            println("Введите имя контакта")
            name = readln()
            println("Введите номер контакта")
            phoneNumber = readln().toLongOrNull()
            println("Введите компанию")
            company = readln()
            contact = PhoneDirectory4(name, phoneNumber, company)
            println("Хотите добавить еще контакт?")
            addToBook = readln()
        } while (addToBook == "да")
        contact.printInstance()
    }
}