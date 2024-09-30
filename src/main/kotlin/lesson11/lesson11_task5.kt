package org.example.lesson11

class Forum(
    val mapOfUsers: MutableMap<Int, String>,
    val messageOfUser: String,
) {
    fun createNewUser(userName: String) : String {
        val newId: Int = (11111111..99999999).random()
        mapOfUsers.put(newId, userName)
        return userName
    }
    fun createNewMessage (userId: Int) {
        val newMessage: String
        if (userId in mapOfUsers.keys) {
            newMessage = readln()
        }
    }
    fun printThread() {
        for ((key,value) in mapOfUsers) {
            println("$value: ${createNewMessage(key)}" )
        }
    }
}

class MemberOfForum (
    val userId: Int,
    val userName: String,
)

class MessageOfForum (
    val authorId: String,
    val message: String,
)

