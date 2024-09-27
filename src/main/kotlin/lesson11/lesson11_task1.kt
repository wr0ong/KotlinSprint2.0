package org.example.lesson11

class Users (
    val uniqueIdentifier: String,
    val loginOfUser: String,
    val passwordOfUser: String,
){}

fun main() {
    val user1 = Users("iASDfsdfafnNJASDP-asdadAS21", "User1", "123",)
    val user2 = Users(
        uniqueIdentifier = "dasdasdsadsa24141das-asdasrqw",
        loginOfUser = "User2",
        passwordOfUser = "321",
    )
    val user3 = Users(
        passwordOfUser = "456",
        uniqueIdentifier = "dasdasdsdsadas3rqwf-bdfojimkl",
        loginOfUser = "User3",
    )
    println("${user1.loginOfUser + " " + user1.passwordOfUser + " " + user1.uniqueIdentifier} " +
            "\n${user2.loginOfUser + " " + user2.passwordOfUser + " " + user2.uniqueIdentifier}" +
            " \n${user3.loginOfUser + " " + user3.passwordOfUser + " " + user3.uniqueIdentifier}")
}