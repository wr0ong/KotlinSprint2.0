package org.example.lesson14

open class Chat(open val listOfUsers: MutableList<String> = mutableListOf()) {
    open var userName: String = ""
    val listOfMessage: MutableList<Message> = mutableListOf()
    val listOfChildMessage: MutableList<ChildMessage> = mutableListOf()

    //val listOfUsers: MutableList<String> = mutableListOf()
    open fun addMessage() {

    }

    open fun addThreadMessage() {}

    fun printChat() {
        listOfMessage.groupBy { it.message }
            .forEach {
                println("$userName: ${it.key}\n")
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
    var id: Int = 0
    var message: String = ""
    fun addMessage() {
        println("Введите сообщение")
        message = readln()
        id += mutableListOfId.size
        mutableListOfId.add(id)
        println("id вашего сообщения: $id")
    }
}

class ChildMessage(
    mutableListOfId: MutableList<Int>
) : Message(mutableListOfId) {
    var childId = 0
    var childMessage: String = ""
    override fun addThreadMessage() {
        println(mutableListOfId)
        println(listOfUsers)
        println("Введите ID сообщения для обсуждения")
        id = readln().toInt()
        println("Введите имя пользователя для проверки")
        userName = readln()
        if ((mutableListOfId.contains(id)) && (listOfUsers.contains(userName))) {
            println("Введите сообщение обсуждения")
            childMessage = readln()
            childId += listOfChildMessage.size
        } else println("Нельзя добавить сообщение для обсуждения")
    }

}

fun main() {
    val chat: Chat = Chat()
    chat.addUser()
    chat.addUser()
    println(chat.listOfUsers)

    val message: Message = Message(chat.listOfUsers)
    message.addMessage()
    message.addMessage()

    val childMessage: ChildMessage = ChildMessage(chat.listOfUsers, message.mutableListOfId)
    childMessage.addThreadMessage()
    childMessage.addThreadMessage()

    println(chat.listOfMessage)
    chat.printChat()
}