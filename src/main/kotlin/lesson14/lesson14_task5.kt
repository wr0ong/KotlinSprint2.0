package org.example.lesson14

open class Chat() {
    open val listOfUsers: MutableList<String> = mutableListOf()
    open var userName: String = ""
    val listOfMessage: MutableList<Message> = mutableListOf()
    val listOfChildMessage: MutableList<ChildMessage> = mutableListOf()

    fun addMessage(text: Message, userName: String) {
        if (userName in listOfUsers)
            listOfMessage.add(text)
    }

    fun addThreadMessage(text: ChildMessage, userName: String, messageId: Int?) {
        if ((userName in listOfUsers) && (messageId != null)) {
            listOfChildMessage.add(text)
        }
    }

    fun printChat() {
        listOfMessage.groupBy { it.message }
            .forEach {
                println("$userName : ${it.key}\n")
                listOfChildMessage.forEach { println("       $userName: ${it.childMessage}") }
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
    val mutableListOfId: MutableList<Int> = mutableListOf()
) {
    var id: Int = 1
    var message: String = ""
    fun createMessage() {
        println("Введите сообщение")
        message = readln()
        id += mutableListOfId.size
        mutableListOfId.add(id)
        println("id вашего сообщения: $id")
    }
}

class ChildMessage(mutableListOfId: MutableList<Int>) : Message(mutableListOfId) {
    var childMessage: String = ""
    fun createThreadMessage() {
        println(mutableListOfId)
        println("Введите ID сообщения для обсуждения")
        id = readln().toInt()
        if ((mutableListOfId.contains(id))) {
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

    var isAddMessage: Boolean
    val name: String
    println("Введите имя пользователя для проверки")
    name = readln()
    if (name in chat.listOfUsers) {
        println("$name, хотите добавить сообщение в чат?")
        isAddMessage = readln().toBoolean()
        while (isAddMessage == true) {
            var message: Message = Message()
            message.createMessage()
            chat.addMessage(message, name)
            println("$name, хотите добавить сообщение?")
            isAddMessage = readln().toBoolean()
        }
        var isAddChildMessage: Boolean
        println("Хотите добавить сообщение для обсуждения?")
        isAddChildMessage = readln().toBoolean()
        while (isAddChildMessage) {
            var id: Int?
            println("Введите ID сообщения для начала обсуждения")
            id = readln().toInt()
            var childMessage: ChildMessage = ChildMessage(mutableListOfId = mutableListOf(id))
            childMessage.createMessage()
            chat.addThreadMessage(childMessage, name,id)
            println("$name, хотите добавить сообщение для обсуждения?")
            isAddChildMessage = readln().toBoolean()
        }
    } else println("Неверное имя пользователя, невозможно добавить сообщение")

    chat.printChat()
}