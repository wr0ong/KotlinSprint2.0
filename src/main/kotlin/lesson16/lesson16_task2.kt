package org.example.lesson16

class Circle(private val radius: Double) {
    private val pi: Double = 3.14
    fun countArea() {
        val area: Double = pi * radius * radius
        println(String.format("Площадь окружности = %.3f", area))
    }

    fun countPerimeter() {
        val perimeter: Double = (radius + radius) * pi
        println(String.format("Периметр окружности = %.3f", perimeter))
        println()
    }
}

fun main() {
    val circle1: Circle = Circle(2.5)
    circle1.countArea()
    circle1.countPerimeter()

    val circle2: Circle = Circle(5.1)
    circle2.countArea()
    circle2.countPerimeter()
}