package org.example.lesson18

open class Figure() {
    open fun printInfo() : String {return ""}
}

class Circle(val radius: Int) : Figure() {
    override fun printInfo() : String{
        return "\"круг с радиусом $radius\""
    }
}

class Square(val length: Int) : Figure() {
    override fun printInfo() : String{
        return "\"квадрат с длиной $length\""
    }
}

class Point(val point: String = ".") : Figure() {
    override fun printInfo() : String{
        return "\"точка\""
    }
}

class Screen() {
    fun draw(x: Int, y: Int, figure: Figure) {
        println("Фигура ${figure.printInfo()} нарисована, центр в координатах [$x][$y]")
    }

    fun draw(x: Float, y: Float, figure: Figure) {
        println("Фигура ${figure.printInfo()} нарисована, центр в координатах [$x][$y]")
    }
}

fun main() {
    val circle: Circle = Circle(4)
    val square: Square = Square(2)
    val point: Point = Point()

    val screen: Screen = Screen()
    screen.draw(1, 2, circle)
    screen.draw(2.1f, 3.2f, square)
    screen.draw(5, 5, point)
}