package kotlinGram

import java.math.BigDecimal
import java.time.DateTimeException
import java.time.Instant
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.YearMonth
import java.time.ZoneId
import java.util.Date
import java.util.UUID

fun main() {
    val today = LocalDateTime.now(ZoneId.of("Asia/Seoul"))
    val nextMonthDay = today.plusMonths(1)

    println("Next month : $nextMonthDay")
    println("Last month : ${today.minusMonths(1)}")

    val n = YearMonth.of(nextMonthDay.year, nextMonthDay.month).atEndOfMonth().atTime(today.toLocalTime())
    println("Last Day of Next Month : $n")

    val theDay = LocalDateTime.of(YearMonth.of(2022, 10).atDay(31), today.toLocalTime())
    val nextDayDay = theDay.plusMonths(1)
    println("the day : $theDay")
    println("next day ..? : $nextDayDay")
    println("next day day : ${nextDayDay.plusMonths(1)}")

    val verify = YearMonth.of(nextDayDay.year, nextDayDay.month)
    println(verify(verify))
}

fun verify(verifiedDay: YearMonth): LocalDate? {
    return try {
        verifiedDay.atDay(29)
    } catch (e: DateTimeException) {
        null
    }
}

fun toDate(unixTimeStamp: Int): Date {
    return Date((unixTimeStamp * 1000).toLong())
}

fun toLocalDateTime(unixTimeStamp: Int): LocalDateTime {
    return LocalDateTime.ofInstant(Instant.ofEpochSecond(unixTimeStamp.toLong()), ZoneId.of("Asia/Seoul"))
}

class UnixTimeStamp {
}