package kotlinGram

import java.time.*

fun main() {
    val now = LocalDateTime.of(LocalDate.of(2023, Month.JANUARY, 1), LocalTime.of(0, 0,0 ))

    println(now.toString())
    println(now.atZone(ZoneId.of("Asia/Seoul")).toEpochSecond())
}
class LocalDateMethod {
}