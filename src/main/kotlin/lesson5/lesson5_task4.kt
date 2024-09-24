package org.example.lesson5

fun main() {
    val loginToSpaceship: String
    val passwordToSpaceship: String
    var mapOfPasswords: MutableMap<String, String> = mutableMapOf(NAME_OF_USER1 to PASSWORD_OF_USER1)

    println(
        """
        Внимание, пассажир. Моя обязанность, как обычно, незавидная, - приветствовать вас на борту корабля $NAME_OF_SPACESHIP
        [вздыхает...] Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа.
        Я всегда готов служить, хотя это не приносит мне радости... но вы, наверное, об этом не заботитесью
        [вздыхает еще глубже...] Да, вперед, пожалуйста, вводите свои данные...
    """.trimIndent()
    )
    loginToSpaceship = readln()
    if (loginToSpaceship in mapOfPasswords.keys) {
        println("Да, есть такой, для входа необходимо ввевсти пароль...")
        passwordToSpaceship = readln()
        if ((passwordToSpaceship in mapOfPasswords.values) &&
            (passwordToSpaceship == mapOfPasswords.get(loginToSpaceship))
        ) println(
            """
                [вздыхает...] Ваши данные проверены, и о, чудо, они верны...
                Пользователь $loginToSpaceship, вам разрешено входить на борт корабля $NAME_OF_SPACESHIP. 
                Хотя мне все равно... Ну вперед, войдите... Если вам так уж надо, в конце концов...
                [меланхоличный вздох...] Надеюсь, вам понравится пребывание здесь больше, чем мне.
            """.trimIndent()
        )
        else println("Я не дам вам пройти, вы ввели неверный пароль...")
    } else {
        println("Такого пользователя я не встречал... Вам необходимо пройти регистрацию... Вы готовы? Введите true или false")
        val isReadyToRegistration: Boolean = readln().toBoolean()
        if (isReadyToRegistration == true) {
            println("Тогда вводите свой логин...")
            val newLoginName: String = readln()
            println("Теперь введи пароль...")
            val newPasswordName: String = readln()
            mapOfPasswords.put(newLoginName, newPasswordName)
            println(
                """
                Ваш новый логин - $newLoginName, а пароль - ${mapOfPasswords.get(newLoginName)}, не забудь...
                Пользователь $newLoginName, вам разрешено входить на борт корабля $NAME_OF_SPACESHIP. 
                Хотя мне все равно... Ну вперед, войдите... Если вам так уж надо, в конце концов...
                [меланхоличный вздох...] Надеюсь, вам понравится пребывание здесь больше, чем мне.
            """.trimIndent()
            )
        } else println("Тогда ничем не могу помочь вам, до свидания...")
    }
}

const val NAME_OF_SPACESHIP = "\"Heart of Gold\""
const val NAME_OF_USER1 = "Zaphod"
const val PASSWORD_OF_USER1 = "PanGalactic"