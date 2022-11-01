package kotlinGram

import java.time.LocalDateTime

fun main() {
    val createdAt = listOf<Int>(2022, 9, 5, 16, 40, 8, 723000000)
    val time = LocalDateTime.of(createdAt[0], createdAt[1], createdAt[2], createdAt[3], createdAt[4], createdAt[5], createdAt[6])
    println(time)
}

class IntegerListConverter {
}