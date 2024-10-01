package org.example.lesson11

class User2(
    val uniqueIdentifier: String,
    val loginOfUser: String,
    var passwordOfUser: String,
    var bio: String = "",
) {
    fun outputInformation() {
        println("${uniqueIdentifier + " " + loginOfUser + " " + passwordOfUser + " " + bio}")
    }

    fun inputBioInformation() {
        val bioInfo: String
        println("Введите био информацию о пользователе")
        bioInfo = readln()
        bio = bioInfo
    }

    fun changeOfPassword(): Boolean {
        val checkOfPassword: String
        val newPassword: String
        println("Введите старый пароль")
        checkOfPassword = readln()
        if (checkOfPassword == passwordOfUser) {
            println("Введите новый пароль")
            newPassword = readln()
            passwordOfUser = newPassword
            println("Пароль изменен!")
            return true
        } else {
            println("Пароль неверный!")
            return false
        }
    }
}

    fun main() {
        val user2 = User2(
            "dasdasdsadsa24141das-asdasrqw",
            "User2",
            "321",
        )
        user2.inputBioInformation()
        user2.changeOfPassword()
        if (user2.changeOfPassword() != false) user2.outputInformation()
        else println()
    }