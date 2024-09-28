package org.example.lesson11

class User2(
    val uniqueIdentifier: String,
    val loginOfUser: String,
    var passwordOfUser: String,
    var bio: String = "",
) {}

fun outputInformation() {
    println("${user2.uniqueIdentifier + " " + user2.loginOfUser + " " + user2.passwordOfUser + " " + user2.bio}")
}

fun inputBioInformation() {
    val bioInfo: String
    println("Введите био информацию о пользователе")
    bioInfo = readln()
    user2.bio = bioInfo
}

fun changeOfPassword() {
    val checkOfPassword: String
    val newPassword: String
    println("Введите старый пароль")
    checkOfPassword = readln()
    if (checkOfPassword == user2.passwordOfUser) {
        println("Введите новый пароль")
        newPassword = readln()
        user2.passwordOfUser = newPassword
        println("Пароль изменен!")
    } else println("Пароль неверный!")
}

val user2 = User2(
    "dasdasdsadsa24141das-asdasrqw",
    "User2",
    "321",
)

fun main() {
    inputBioInformation()
    changeOfPassword()
    outputInformation()
}