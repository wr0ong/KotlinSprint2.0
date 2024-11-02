package org.example.lesson20

fun main() {
    val listOfElements: List<String> = listOf("Element1", "Element2", "Element3", "Element4", "Element5", "Element6")
    val newLambda: List<() -> Unit> = listOfElements.map { str: String -> { println("Нажат элемент $str") } }
    val filteredLambda = newLambda.filterIndexed { index, _ -> index % 2 != 0 }
        .forEach { it.invoke() }
}




