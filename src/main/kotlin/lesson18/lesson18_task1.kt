package org.example.lesson18

class Order() {

    fun orderInformation(
        numberOfOrder: Int,
        product: String
    ) {
        println("Заказан товар: $product")
    }

    fun orderInformation(
        numberOfOrder: Int,
        product: List<String>
    ) {
        println("Заказаны следующие товары: $product")
    }
}

fun main() {
    val order1: Order = Order()
    val order2: Order = Order()

    order1.orderInformation(1, "Сметана")

    order2.orderInformation(2, listOf("Сметана", "Лук"))
}