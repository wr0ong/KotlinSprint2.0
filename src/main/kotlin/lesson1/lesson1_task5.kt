package org.example.lesson1

fun main() {
    val seconds: Int = GAGARINS_TIMING * SECONDS_IN_MINUTE
    var hours: Int = seconds / (SECONDS_IN_MINUTE * SECONDS_IN_MINUTE)
    //секунд в минутах столько же, сколько и минут в часах /\
    val minutes: Int = seconds / SECONDS_IN_MINUTE
    val ostMinutes: Int = (seconds % (SECONDS_IN_MINUTE * SECONDS_IN_MINUTE)) / SECONDS_IN_MINUTE
    val ostSeconds: Int = seconds % SECONDS_IN_MINUTE

    print(String.format("%02d:", hours))
    print(String.format("%02d:", ostMinutes))
    println(String.format("%02d", ostSeconds))
}

const val GAGARINS_TIMING = 108 //Минут провел Юрий Алексеевич в космосе
const val SECONDS_IN_MINUTE = 60 //Секунд в минуте