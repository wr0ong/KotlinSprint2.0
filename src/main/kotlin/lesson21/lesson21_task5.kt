package org.example.lesson21

fun Map<String, Int>.maxCategory(): String {
    val maxExperience = this.values.max()
    val bestSkills: Set<String> = this.filterValues { it == maxExperience }.keys
    val bestSkill = bestSkills.first()
    return bestSkill
}

fun main(){
    val mapOfSkills: Map<String, Int> = mapOf("High Kick" to 10, "Shoot in head" to 14, "Lighting strike" to 15, "Aspen stake in the heart" to 15)

    println(mapOfSkills.maxCategory())
}