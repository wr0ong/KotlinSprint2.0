package org.example.lesson19

enum class Category(val id: Int) {
    CLOTHES(1) {
        override fun printCategory(): String {
            return "Одежда"
        }
    },
    OFFICE_SUPPLIES(2) {
        override fun printCategory(): String {
            return "Канцелярские товары"
        }
    },
    DIFFERENT(3) {
        override fun printCategory(): String {
            return "Разные товары"
        }
    },
    ERROR(4) {
        override fun printCategory(): String {
            return "Неизвестный товар"
        }
    };

    abstract fun printCategory(): String
}

class Product(val nameOfProduct: String, val id: Int, val category: Category) {

    fun printInfo() {
        println("Название - $nameOfProduct, id - $id, категория - ${category.printCategory()}")
    }
}

fun main() {
    val product1: Product = Product("Дубленка", 1, Category.CLOTHES)
    val product2: Product = Product("Шариковая ручка Pilot", 2, Category.OFFICE_SUPPLIES)
    val product3: Product = Product("Аспирин", 3, Category.DIFFERENT)

    product1.printInfo()
    product2.printInfo()
    product3.printInfo()
}


