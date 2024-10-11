package org.example.lesson15

open class Forum() {
    val mListOfMessages: MutableList<String> = mutableListOf()
    val mListOfAdmins: MutableList<Admin> = mutableListOf()
    val mListOfUsers: MutableList<User> = mutableListOf()

    fun createNewUser() {
        println("Введите имя пользователя")
        val userName: User = User(readln())
        mListOfUsers.add(userName)
    }

    fun giveAdminAbility(user: User) {
        if (mListOfUsers.contains(user)){
            val admin: Admin = Admin(user.nameOfUser)
            mListOfAdmins.add(admin)
            println("${user.nameOfUser} стал администарором")
        } else println("Пользователь с именем ${user.nameOfUser} не зарегестрирован")

    }

}

abstract class UserAbility(val nameOfUser: String) {
    open fun read() {
        println("${nameOfUser} прочитал сообщение")
    }

    open fun write() {
        println("${nameOfUser} написал сообщение")
    }

}

abstract class AdminAbility(nameOfUser: String) : UserAbility(nameOfUser) {
    override fun read() {}
    override fun write() {}
    fun removeUser() {
        println("$nameOfUser удалил пользователя")
    }

    fun removeMessage() {
        println("$nameOfUser удалил сообщение")
    }
}

class User(nameOfUser: String) : UserAbility(nameOfUser) {}
class Admin(nameOfUser: String) : AdminAbility(nameOfUser) {}

fun main() {
    val forum: Forum = Forum()

    forum.createNewUser()
    forum.createNewUser()

    forum.mListOfUsers.first().write()


    forum.giveAdminAbility(forum.mListOfUsers[0])
    val checkUser: User = User("asdsda")
    forum.giveAdminAbility(checkUser)

    forum.mListOfAdmins[0].removeMessage()


}