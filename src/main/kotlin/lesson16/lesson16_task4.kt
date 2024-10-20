package org.example.lesson16

private class Order(
    private val numberOfOrder: Int,
    val listOfStatuses: List<String> = listOf(
        "Заказ в обработке",
        "Заказ подтвержден, начинаем собирать...", "Заказ передан курьеру",
        "Заказ доставлен! Просим Вас оставить отзыв в комментариях к заказу",
        "Заказ отменен"
    ),
    private var status: String = listOfStatuses[0],
) {
    fun readNumberOfOrder() = numberOfOrder

    fun changeStatus(position: String, newStatus: String) {
        if ((newStatus in listOfStatuses) && (position == "manager")) {
            status = newStatus
            println("Менеджер изменил статус заказа №$numberOfOrder на \"$status\"")
        } else println("Статус заказа не будет изменен...")
    }

    fun checkInfo() {
        println("На данный момент заказ №$numberOfOrder имеет статус \"$status\"")
    }
}


fun sendRequest(numberOfOrder: Int): String {
    println("Номер заказа $numberOfOrder, хотите изменить статус заказа?")
    val isChangeStatus: Boolean = readln().toBoolean()
    if (isChangeStatus) {
        val newStatus: String
        println("Введите статус, на который бы хотели поменять заказ")
        newStatus = readln()
        val order = Order(numberOfOrder)
        if (order.listOfStatuses.contains(newStatus)) {
            println("Заявка на изменение статуса отправлена")
            return newStatus
        } else {
            println("На указанный статус изменить заказ невозможно")
            return ""
        }
    } else return ""
}

fun main() {
    val order1 = Order(1)
    val order2 = Order(2)

    order1.checkInfo()
    order2.checkInfo()

    val messageOfChangeStatus1 = sendRequest(order1.readNumberOfOrder())
    order1.changeStatus("manager", messageOfChangeStatus1)

    order2.changeStatus("manager", "Заказ передан курьеру")
    order1.checkInfo()
    order2.checkInfo()

}
