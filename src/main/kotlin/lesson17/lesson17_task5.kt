package org.example.lesson17

class User(login: String, password: String) {
    var login = login
        get() = field
        set(value) {
            field = value
            println("Вы успешно изменили логин! Теперь Вас зовут $field!")
        }
    var password = password
        get() {
            field = ("*".repeat(field.length))
            return field
        }
        set(value) {
            println("Вы не можете изменить пароль")
        }
}

fun main() {
    val user1: User = User("Reborn", "1234567890")

    println(user1.login)
    println(user1.password)

    user1.password = "123"
    user1.login = "QWERTY"

    println(user1.login)
    println(user1.password)
}