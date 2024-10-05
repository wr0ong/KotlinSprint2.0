package org.example.lesson13

class PhoneDirectory(
    val name: String,
    val phoneNumber: Long,
    var company: String?
) {
}

fun main() {
    val name: String
    val phoneNumber: Long
    var company: String?

    println("Введите имя")
    name = readln()
    println("Введите номер телефона")
    phoneNumber = readln().toLong()
    println("Введите компанию")
    company = readlnOrNull()
    if (company == "") company = null

    val firstOfPhoneDirectory: PhoneDirectory = PhoneDirectory(
        name = name,
        phoneNumber = phoneNumber,
        company = company
    )

    println("${firstOfPhoneDirectory.name}\n${firstOfPhoneDirectory.phoneNumber}\n${firstOfPhoneDirectory.company ?: "Поле company не заполнено"}")
}