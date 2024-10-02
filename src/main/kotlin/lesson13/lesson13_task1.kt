package org.example.lesson13

class PhoneDirectory(
    val name: String,
    val phoneNumber: Long,
    var company: String?
) {
    init {
        if (company == null) company = "поле Company не заполнено"
    }
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
    company = readlnOrNull()?:"Поле company не заполнено"
    if (company == "") company = null

    val firstOfPhoneDirectory: PhoneDirectory = PhoneDirectory(
        name = name,
        phoneNumber = phoneNumber,
        company = company
    )

    println("${firstOfPhoneDirectory.name},\n${firstOfPhoneDirectory.phoneNumber},\n${firstOfPhoneDirectory.company}")
}