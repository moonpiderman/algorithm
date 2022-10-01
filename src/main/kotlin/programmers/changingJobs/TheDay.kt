package programmers.changingJobs

import java.time.LocalDate

fun main() {
    val theDay = TheDay()
    val sol = theDay.solution(5, 24)
    println(sol)
}

class TheDay {
    fun solution(a: Int, b: Int): String {
        val dayMap = hashMapOf<Int, String>(1 to "MON", 2 to "TUE", 3 to "WED", 4 to "THU", 5 to "FRI", 6 to "SAT", 7 to "SUN")

        val date = LocalDate.of(2016, a, b)
        val day = date.dayOfWeek.value

        return dayMap[day]!!
    }
}