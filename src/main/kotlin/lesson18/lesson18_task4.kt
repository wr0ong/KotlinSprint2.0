package org.example.lesson18

abstract class Package() {
    val mListOfPackage: MutableList<Package> = mutableListOf()
    open var area: Int = 0
    open fun countArea() {}
}

class PackageParallelepiped(val length: Int, val width: Int, val height: Int) : Package() {
    override fun countArea() {
        area = (length * width + width * height + height * length) * 2
        println("Площадь посылки = $area")
    }
}

class PackageCube(val length: Int) : Package() {
    override fun countArea() {
        area = length * length * 6
        println("Площадь посылки = $area")
    }
}


fun main() {
    val package1: Package = PackageParallelepiped(4, 2, 3)
    val package2: Package = PackageCube(5)

    package1.countArea()
    package2.countArea()

}