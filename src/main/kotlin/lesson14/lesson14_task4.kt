package org.example.lesson14

abstract class CelestialsBodies(
    val isPresenceOfAtmosphere: Boolean,
    val isSuitableToBoarding: Boolean,
    val name: String,
    val radius: Double,
    val inclinationOfOrbit: Double,
    val mass: ULong,
    ) {
}

open class Planets(
    isPresenceOfAtmosphere: Boolean,
    isSuitableToBoarding: Boolean,
    name: String,
    radius: Double,
    inclinationOfOrbit: Double,
    mass: ULong,
    val sputniksOfPlanet: MutableList<Sputniks> = mutableListOf()
    ): CelestialsBodies(isPresenceOfAtmosphere, isSuitableToBoarding,name, radius, inclinationOfOrbit,mass){
        fun outputSputniks(){
            println(name)
            sputniksOfPlanet.groupBy { it.sputniksOfPlanet }
                .forEach{ it.value.forEach{ println("   ${it.name}") } }
        }
    }

class Sputniks(
    isPresenceOfAtmosphere: Boolean,
    isSuitableToBoarding: Boolean,
    name: String,
    radius: Double,
    inclinationOfOrbit: Double,
    mass: ULong,
    val isArtificial: Boolean,
    val apogee: Int,
    val perigee: Int,
) : Planets (isPresenceOfAtmosphere, isSuitableToBoarding, name, radius, inclinationOfOrbit, mass) {
}

fun main() {
    val sputnik1: Sputniks = Sputniks(
        false,
        false,
        "Moon",
        1737.0,
        5.14,
        7350000000000u,
        false,
        405059,
        367047,
    )
    val planet1: Planets = Planets (
        true,
        true,
        "Earth",
        6357.0,
        0.0,
        59800000000000000u,
    )
    val sputnik2: Sputniks = Sputniks(
        false,
        false,
        "Artificial sputnik",
        19.5,
        13.4,
        49800000u,
        true,
        8495,
        7104,
    )
    planet1.sputniksOfPlanet.add(sputnik1)
    planet1.sputniksOfPlanet.add(sputnik2)

    planet1.outputSputniks()
}


const val PERMANENT_OF_GRAVITY: Double = 6.67 * 0.00000000001