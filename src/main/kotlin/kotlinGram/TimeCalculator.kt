package kotlinGram

import java.time.LocalDate
import java.time.Month
import java.time.YearMonth

fun main() {
    // 2022-10-31
    val cardPaymentDay = LocalDate.of(2022, Month.JULY, 31)
    val paidAt = LocalDate.of(2022, Month.OCTOBER, 31)

    val yearMonthOfNextMonth = YearMonth.from(paidAt.plusMonths(1))
    val lastDayOfNextMonth = yearMonthOfNextMonth.lengthOfMonth()

    val expectedDay = if (cardPaymentDay.dayOfMonth < lastDayOfNextMonth || cardPaymentDay.dayOfMonth == lastDayOfNextMonth) {
        LocalDate.of(yearMonthOfNextMonth.year, yearMonthOfNextMonth.month, cardPaymentDay.dayOfMonth)
    } else {
        paidAt.plusMonths(1)
    }

    println("What is expected next month? : $expectedDay")
}

class TimeCalculator {
}