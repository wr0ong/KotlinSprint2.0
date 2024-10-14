package org.example.lesson14

open class Chat() {
    open val listOfUsers: MutableList<String> = mutableListOf()
    open var userName: String = ""
    val listOfMessage: MutableList<Message> = mutableListOf()
    val listOfChildMessage: MutableList<ChildMessage> = mutableListOf()

    fun addMessage(text: Message, userName: String, id: Int) {
        if (userName in listOfUsers) {
            listOfMessage.add(id, text)
        }
    }

    fun addThreadMessage(text: ChildMessage, userName: String, messageId: Int?) {
        if ((userName in listOfUsers) && (messageId != null)) {
            listOfChildMessage.add(text)
        }
    }

    fun printChat(name: String) {
        listOfMessage.groupBy { it.message }
            .forEach {
                println("$name: ${it.key}")
                listOfChildMessage.forEach { println("\t$name: ${it.childMessage}") }
            }
    }

    fun addUser() {
        println("Введите имя пользователя")
        userName = readln()
        if ((userName !in listOfUsers))
            listOfUsers.add(userName)
    }
}

open class Message(
    open val mutableListOfId: MutableList<Int> = mutableListOf(),
    var id: Int = 0,
) {
    var message: String = ""
    fun createMessage() {
        id += mutableListOfId.size
        mutableListOfId.add(id)
        println("Введите сообщение")
        message = readln()
        println("id вашего сообщения: $id")
        println(mutableListOfId)
    }
}

class ChildMessage(mutableListOfId: MutableList<Int>, id: Int) : Message(mutableListOfId, id) {
    var childMessage: String = ""
    var checkId = id
    fun createThreadMessage() {
        if ((mutableListOfId.contains(checkId))) {
            println("Введите сообщение обсуждения")
            childMessage = readln()
        } else println("Нельзя добавить сообщение для обсуждения, указан неверный ID")
    }
}

fun main() {
    val chat: Chat = Chat()
    chat.addUser()
    chat.addUser()
    println(chat.listOfUsers)

    println("Введите имя пользователя для проверки")
    val name: String = readln()
    if (name in chat.listOfUsers) {
        println("$name, добавьте сообщение в чат")
        val message: Message = Message()
        message.createMessage()
        chat.addMessage(message, name, message.id)

        var isAddChildMessage: Boolean
        println("Хотите добавить сообщение для обсуждения?")
        isAddChildMessage = readln().toBoolean()

        while (isAddChildMessage) {
            var id: Int?
            println("Введите ID сообщения для начала обсуждения")
            id = readln().toInt()
            val childMessage: ChildMessage = ChildMessage(message.mutableListOfId, id)
            childMessage.createThreadMessage()
            if (message.mutableListOfId.contains(id)) chat.addThreadMessage(childMessage, name, id)
            println("$name, хотите добавить сообщение для обсуждения?")
            isAddChildMessage = readln().toBoolean()
        }

    } else println("Неверное имя пользователя, невозможно добавить сообщение")

    chat.printChat(name)
}