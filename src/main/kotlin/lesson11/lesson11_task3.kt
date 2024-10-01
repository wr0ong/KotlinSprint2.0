package org.example.lesson11

class UsersFromApp(
    val userID: Int,
    val userNickName: String,
    var passwordOfUser: String,
    var avatar: String = "Standard avatar",
    var statusOfUser: String = "разговаривает",
) {
    fun changeAvatar() {
        val changeOfAvatarAnswer: String
        println("${userNickName}, хотите изменить аватар?")
        changeOfAvatarAnswer = readln()
        if (changeOfAvatarAnswer == "да") {
            println("Введите название аватара")
            avatar = readln()
            println("Пользователь $userNickName сменил аватар на $avatar")
        }
    }

    fun changeOfPassword(): Boolean {
        val checkOfPassword: String
        println("Введите старый пароль")
        checkOfPassword = readln()
        if (checkOfPassword == passwordOfUser) {
            println("Введите новый пароль")
            passwordOfUser = readln()
            println("Пароль изменен!")
            return true
        } else {
            println("Пароль неверный!")
            return false
        }
    }
}

class RoomOfApp(
    val theme: String,
    val nameOfRoom: String,
    val maxUsersInRoom: Int = 16,
    var coverOfRoom: String = "Стандартная обложка комнаты",
    val mutableListOfUsersInRoom: MutableList<String> = mutableListOf(),
    var openSlotsInRoom: Int = 16,
    val statusOfUsers: MutableMap<String, String> = mutableMapOf(),
) {
    fun addToRoom(userToAdd: UsersFromApp) {
        mutableListOfUsersInRoom.add(userToAdd.userNickName)
        statusOfUsers.put(userToAdd.userNickName, userToAdd.statusOfUser)
        openSlotsInRoom--
        println("Пользователь ${userToAdd.userNickName} - Статус: ${userToAdd.statusOfUser} добавлен в комнату")
        println("Сейчас в комнате: $mutableListOfUsersInRoom, свободных мест: $openSlotsInRoom")
    }

    fun removeFromRoom(userToRemove: UsersFromApp) {
        mutableListOfUsersInRoom.remove(userToRemove.userNickName)
        statusOfUsers.remove(userToRemove.userNickName)
        openSlotsInRoom++
        println("${userToRemove.userNickName} покинул комнату")
        println("Сейчас в комнате :$mutableListOfUsersInRoom, свободных мест: $openSlotsInRoom")
    }

    fun changeStatusOfUserInRoom(userToChange: UsersFromApp) {
        val changeWord: String
        val newStatus: String
        println("${userToChange.userNickName}, хотите изменить статус?")
        changeWord = readln()
        if (changeWord == "да") {
            println("Введите новый статус")
            newStatus = readln()
            if (newStatus == "разговаривает" || newStatus == "микрофон выключен") {
                userToChange.statusOfUser = newStatus
                println("Статус ${userToChange.userNickName} изменен на ${userToChange.statusOfUser}")
            } else println("На ${userToChange.statusOfUser} изменить статус невозможно")
        }
        statusOfUsers.remove(userToChange.userNickName)
        statusOfUsers.put(userToChange.userNickName, userToChange.statusOfUser)
    }

    fun muteUser(userToMute: UsersFromApp) {
        userToMute.statusOfUser = "пользователь заглушен"
        println("Статус ${userToMute.userNickName} изменен на ${userToMute.statusOfUser}")
    }

    fun outputInformation() {
        println(
            """
            Тема комнаты: $theme 
            Название комнаты: $nameOfRoom 
            Обложка комнаты: $coverOfRoom 
            Список пользователей в комнате: $mutableListOfUsersInRoom,  
            Мест осталось: $openSlotsInRoom""".trimIndent()
        )
        print("Статусы пользователей: ")
        for ((key, value) in statusOfUsers) {
            println("$key - $value")
        }
    }
}

fun main() {
    val firstUser: UsersFromApp = UsersFromApp(
        11111111,
        "Adam",
        "123",
    )
    val secondUser: UsersFromApp = UsersFromApp(
        11111112,
        "Eva",
        "12345",
    )

    val firstRoom: RoomOfApp = RoomOfApp(
        theme = "Древние времена",
        nameOfRoom = "Первые люди",
        coverOfRoom = "Яблоня",
    )
    firstRoom.outputInformation()
    firstRoom.addToRoom(firstUser)
    firstRoom.addToRoom(secondUser)
    secondUser.changeAvatar()
    firstRoom.changeStatusOfUserInRoom(firstUser)
    firstRoom.outputInformation()
    firstRoom.muteUser(secondUser)
    firstRoom.removeFromRoom(secondUser)
}