package org.example.lesson13

class PhoneDirectory2(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null ?: "<не указано>"
) {
    fun printInstance() {
        println("-Имя: $name\n-Номер: $phoneNumber\n-Компания: $company")
    }
}