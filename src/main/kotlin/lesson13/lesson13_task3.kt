package org.example.lesson13

class PhoneDirectory3(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {
    fun printInstance() {
        println("-Имя: $name\n-Номер: $phoneNumber\n-Компания: ${company ?: "<не указано>"}")
    }

    fun printCompany() {
        println("-Компания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val mutableListOfContacts: MutableList<PhoneDirectory3> = mutableListOf()

    val contact1: PhoneDirectory3 = PhoneDirectory3("Иван", 89057245325)
    val contact2: PhoneDirectory3 = PhoneDirectory3("Степан", 89992450427)
    val contact3: PhoneDirectory3 = PhoneDirectory3("Ростислав", 89151250505, "null")
    val contact4: PhoneDirectory3 = PhoneDirectory3("Сергей", 89158050809, "Ростелеком")
    val contact5: PhoneDirectory3 = PhoneDirectory3("Ибрагим", 88005353535, "Микрозайм")

    mutableListOfContacts.add(contact1)
    mutableListOfContacts.add(contact2)
    mutableListOfContacts.add(contact3)
    mutableListOfContacts.add(contact4)
    mutableListOfContacts.add(contact5)

    mutableListOfContacts.filter { it.company != null }
        .forEach { it.printCompany() }
}