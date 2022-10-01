package kotlinGram

import java.time.LocalDate
import java.time.ZoneId

fun main() {
    val today = LocalDate.now(ZoneId.of("Asia/Seoul"))
    val dueDay = today.plusDays(30)
    println(dueDay)
}

class DateTime {
}