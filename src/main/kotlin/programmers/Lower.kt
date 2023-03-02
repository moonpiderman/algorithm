package programmers

import java.lang.Math.ceil
import java.time.Year

fun main() {
    val myString = "Bcad"
    val lower = myString.lowercase().toCharArray().apply { sort() }.joinToString("")
    println(lower)

    val year = Year.of(2022).minusYears(40)
    println(year.value)

    val vv = 10.245
    kotlin.math.ceil(vv)
}
class Lower {
}