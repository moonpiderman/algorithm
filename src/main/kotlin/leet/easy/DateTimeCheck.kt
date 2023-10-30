package leet.easy

import java.time.LocalDate

fun main() {
    val today = LocalDate.of(2023, 1, 31)
    println("TODAY : $today")
    println("NEXT : ${today.plusMonths(1L)}")
}
class DateTimeCheck {
}