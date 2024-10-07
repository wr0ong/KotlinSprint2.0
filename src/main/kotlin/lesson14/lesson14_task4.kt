package org.example.lesson14

abstract class CelestialsBodies(
    val isPresenceOfAtmosphere: Boolean,
    val isSuitableToBoarding: Boolean,
    val name: String,
    val radius: Double,
    val inclinationOfOrbit: Double,
    val mass: ULong,
)

open class Planet(
    isPresenceOfAtmosphere: Boolean,
    isSuitableToBoarding: Boolean,
    name: String,
    radius: Double,
    inclinationOfOrbit: Double,
    mass: ULong,
    open val sputnikOfPlanet: MutableList<Sputnik> = mutableListOf(),
) : CelestialsBodies(isPresenceOfAtmosphere, isSuitableToBoarding, name, radius, inclinationOfOrbit, mass) {
    fun outputSputniks() {
        println(name)
        sputnikOfPlanet.groupBy { it.sputnikOfPlanet }
            .forEach { it.value.forEach { println("   Название - ${it.name}, спутник искусственный - ${it.isArtificial}") } }
    }
}

class Sputnik(
    isPresenceOfAtmosphere: Boolean,
    isSuitableToBoarding: Boolean,
    name: String,
    radius: Double,
    inclinationOfOrbit: Double,
    mass: ULong,
    val isArtificial: Boolean,
    val apogee: Int,
    val perigee: Int,
    override val sputnikOfPlanet: MutableList<Sputnik> = mutableListOf()
) : Planet(isPresenceOfAtmosphere, isSuitableToBoarding, name, radius, inclinationOfOrbit, mass)

fun main() {
    val sputnik1: Sputnik = Sputnik(
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
    val planet1: Planet = Planet(
        true,
        true,
        "Earth",
        6357.0,
        0.0,
        59800000000000000u,
    )
    val sputnik2: Sputnik = Sputnik(
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
    planet1.sputnikOfPlanet.add(sputnik1)
    planet1.sputnikOfPlanet.add(sputnik2)

    planet1.outputSputniks()
}

const val PERMANENT_OF_GRAVITY: Double = 6.67 * 0.00000000001