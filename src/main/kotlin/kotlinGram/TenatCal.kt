package kotlinGram

import java.math.BigDecimal
import kotlin.math.sqrt

fun main() {
    val ownerPrice = BigDecimal.valueOf(9.90)
    val bp = BigDecimal.valueOf(743.314449111246)
    val validConstant = BigDecimal.valueOf(0.01635)

    // X
    val validValue = bp * validConstant

    // beta
    val rate = ownerPrice / validValue

    // 분모
    val dominator = (BigDecimal.valueOf(7 * sqrt(5.0)) * BigDecimal.valueOf(sqrt(rate.toDouble()))) - BigDecimal.valueOf(12.0)
    val domi23 = (BigDecimal.valueOf(7 * sqrt(5.0)) * sqrt(rate.toDouble()).toBigDecimal()) - BigDecimal.valueOf(12.0)

//    val result = BigDecimal.valueOf(2.0) / dominator
//    val result2 = BigDecimal.valueOf(2.0) / domi23
//
//    println("Rate : $rate")
//    println("Domi : $dominator")
//    println("Result : $result")
//    println("res2 : $result2")
//
//    println("${result == BigDecimal.valueOf(1.0)}")
//    println("${result2 == BigDecimal.valueOf(1.0)}")
//
//    println(result.toDouble())
//    println(result2.toDouble())

    val rand = Math.random()
    println(rand < 1.0)

}

class TenantCal {
}