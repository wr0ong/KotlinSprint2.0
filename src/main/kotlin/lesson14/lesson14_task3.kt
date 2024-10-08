package org.example.lesson14

import kotlin.math.PI
import kotlin.math.pow

abstract class Figure(val color: String) {
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double
}

class Circle(val radius: Double, color: String) : Figure(color) {
    override fun calculateArea(): Double {
        val areaOfCircle = PI * radius.pow(2.0)
        println(String.format("Радиус круга = %.3f", areaOfCircle))
        return areaOfCircle
    }

    override fun calculatePerimeter(): Double {
        val perimeterOfCircle = PI * radius * 2
        println(String.format("Периметр круга = %.3f", perimeterOfCircle))
        return perimeterOfCircle
    }
}

class Rectangle(val length: Double, val height: Double, color: String) : Figure(color) {
    override fun calculateArea(): Double {
        val areaOfRectangle = length * height
        println(String.format("Площадь прямоугольника = %.3f", areaOfRectangle))
        return areaOfRectangle
    }

    override fun calculatePerimeter(): Double {
        val perimeterOfRectangle = (length + height) * 2
        println(String.format("Периметр прямоугольника = %.3f", perimeterOfRectangle))
        return perimeterOfRectangle
    }
}

fun main() {
    val circle1: Circle = Circle(
        radius = 5.6,
        color = FIRST_COLOR_OF_FIGURES
    )
    val circle2: Circle = Circle(
        radius = 8.5,
        color = SECOND_COLOR_OF_FIGURES
    )
    val rectangle1: Rectangle = Rectangle(
        length = 2.2,
        height = 3.8,
        color = SECOND_COLOR_OF_FIGURES
    )
    val rectangle2: Rectangle = Rectangle(
        length = 2.2,
        height = 3.8,
        color = FIRST_COLOR_OF_FIGURES
    )
    val circle3: Circle = Circle(
        radius = 2.5,
        color = "Зеленый"
    )
    val listOfFigure = listOf(circle1, circle2, rectangle1, rectangle2)

    var sumOfWhite = 0.0
    listOfFigure.filter { it.color == FIRST_COLOR_OF_FIGURES }
        .forEach { sumOfWhite += it.calculateArea() }
    println(String.format("Сумма площадей белых %.3f", sumOfWhite))

    var sumOfBlacks = 0.0
    listOfFigure.filter { it.color == SECOND_COLOR_OF_FIGURES }
        .forEach { sumOfBlacks += it.calculatePerimeter() }
    println(String.format("Сумма периметров черных %.3f", sumOfBlacks))


}

const val FIRST_COLOR_OF_FIGURES = "Белый"
const val SECOND_COLOR_OF_FIGURES = "Черный"