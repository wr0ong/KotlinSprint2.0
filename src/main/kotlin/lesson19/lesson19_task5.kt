package org.example.lesson19

enum class Gender() {
    MAN,
    WOMAN
}

class People(val name: String = readln(), val gender: Gender = Gender.valueOf(readln()))

fun main() {
    val mListOfPeoples: MutableList<People> = mutableListOf()
    println(
        "Для добавления в картотеку вам необходимо: \n1) Ввести имя человека, нажать Enter\n" +
                "2) Ввести пол человека (MAN или WOMAN), нажать Enter"
    )
    while (mListOfPeoples.size < 5) {
        val people: People = People(readln())
        mListOfPeoples.add(people)
    }
    println("Вы добавили в картотеку ${mListOfPeoples.size} человек: ")
    mListOfPeoples.forEach { println("${it.name} - ${it.gender}") }
}