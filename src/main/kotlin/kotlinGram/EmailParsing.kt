package kotlinGram

import java.util.*

fun main() {
    val form = "@planningo.io"
    val email = "moonhulk@planningo.iio"

    val charset = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    val r = (1..8)
        .map { charset.random() }
        .joinToString("")

    val random = (1..8)
        .map {
            Random().nextInt(10)
        }
        .joinToString("")

    println(random)
    println(r)
    println(email.contains(form))
}

class EmailParsing {
}