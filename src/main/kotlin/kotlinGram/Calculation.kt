package kotlinGram

import java.math.BigDecimal
import kotlin.math.*

fun main() {
    val a: Double = 1000000010.05
    val b: Double = 100000001.05
    val aa = BigDecimal.valueOf(a)
    val bb = BigDecimal.valueOf(b)

    println("Double Cal : ${ a - b }")
    println("Big Cal : ${ aa - bb }.")
}

class Calculation {
}