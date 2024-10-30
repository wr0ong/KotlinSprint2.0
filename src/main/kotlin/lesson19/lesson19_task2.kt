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

class Product(val nameOfProduct: String, val id: Int) {
    fun getCategory(id: Int): Category {
        if (id == Category.CLOTHES.id) return Category.CLOTHES
        else if (id == Category.OFFICE_SUPPLIES.id) return Category.OFFICE_SUPPLIES
        else if (id == Category.DIFFERENT.id) return Category.DIFFERENT
        else return Category.ERROR
    }

    fun printInfo() {
        println("Название - $nameOfProduct, id - $id, категория - ${this.getCategory(id).printCategory()}")
    }
}

fun main() {
    val product1: Product = Product("Дубленка", 1)
    val product2: Product = Product("Шариковая ручка Pilot", 2)
    val product3: Product = Product("Аспирин", 3)

    product1.printInfo()
    product2.printInfo()
    product3.printInfo()
}


