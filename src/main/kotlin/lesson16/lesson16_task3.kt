package org.example.lesson16

class User(
    val login: String,
    private val password: String,
) {
    fun validate(checkPassword: String): Boolean {
        val isPasswordTrue: Boolean = password == checkPassword
        return isPasswordTrue
    }
}

fun main() {
    val user: User = User(
        login = "User",
        password = "123456",
    )
    user.validate("123456")
    user.validate("654321")
}