package org.example.lesson22

data class GalacticGuide(
    val nameOfEventOrPlace: String,
    val descriptionOfEventOrPlace: String,
    val dateAndTimeOfEvent: String = "не запланировано",
    val distanceFromEarth: Double,
) {
    fun printInfo() {
        println(
            "Название месте: ${this.component1()}\nОписание места: ${this.component2()} \nДата и время событи: ${this.component3()}\n" +
                    "Расстояние от Земли до ${this.component1()}: ${this.component4()}"
        )
    }
}

fun main() {
    val alphaCentauri = GalacticGuide(
        nameOfEventOrPlace = "Альфа Центавра",
        descriptionOfEventOrPlace = "тройная звёздная система в созвездии Центавра. \nДва компонента, солнцеподобные α Центавра А и α Центавра B, " +
                "невооружённому глазу видны как одна звезда −0,27m, \nблагодаря чему α Центавра является третьей по яркости звездой ночного неба.",
        distanceFromEarth = 4.37
    )
    alphaCentauri.printInfo()
}