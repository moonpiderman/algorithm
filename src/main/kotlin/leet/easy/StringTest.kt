package leet.easy

import java.time.LocalDate
import java.time.ZoneId

fun main() {
    val test = 15
    val t = LocalDate.now(ZoneId.of("Asia/Seoul")).dayOfMonth
    println(test == t)
}
class StringTest {
}