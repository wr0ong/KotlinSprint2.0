package org.example.lesson13

class PhoneDirectory2(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {
    fun printInstance() {
        println("-Имя: $name\n-Номер: $phoneNumber\n-Компания: ${company ?: "<не указано>"}")
    }
}