package org.example.lesson11

class Forum(
    val mapOfUsers: MutableMap<String, Int> = mutableMapOf(),
    var messageOfUser: String = "",
) {
    fun createNewUser(userName: String) {
        var newId: Int = 11111111 + mapOfUsers.size
        mapOfUsers.put(userName, newId)
    }

    fun createNewMessage(userId: Int): String {
        val newMessage: String
        if (userId in mapOfUsers.values) {
            println("${mapOfUsers.entries.find { it.value == userId }?.key}, введите сообщение")
            newMessage = readln()
            messageOfUser = newMessage
        }
        return messageOfUser
    }

    fun printThread(userName: String) {
        if (userName in mapOfUsers.keys) {
            println("${userName}: $messageOfUser")
        }
    }
}

fun main() {
    val firstForum: Forum = Forum()
    firstForum.createNewUser("Bool_from_Hell")
    firstForum.createNewUser("Ivan")
    try {
        firstForum.createNewMessage(firstForum.mapOfUsers.getValue("Bool_from_Hell"))
    } catch (e: NoSuchElementException) {
        println("пользователя не существует")
    }
    try {
        firstForum.createNewMessage(firstForum.mapOfUsers.getValue("Ignat"))
    } catch (e: NoSuchElementException) {
        println("пользователя не существует")
    }
    try {
        firstForum.createNewMessage(firstForum.mapOfUsers.getValue("Ivan"))
    } catch (e: NoSuchElementException) {
        println("пользователя не существует")
    }

    firstForum.printThread("Bool_from_Hell")
    firstForum.printThread("Ivan")
    firstForum.printThread("Ignat")

    println(firstForum.mapOfUsers.keys)
    println(firstForum.mapOfUsers.values)
}