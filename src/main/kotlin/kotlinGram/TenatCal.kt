package kotlinGram

import java.math.BigDecimal
import kotlin.math.sqrt

fun main() {
    val ownerPrice = BigDecimal.valueOf(285.25)
    val bp = BigDecimal.valueOf(21544.044505589492)
    val validConstant = BigDecimal.valueOf(0.01635)

    val rate = ownerPrice / (bp * validConstant)

    val dominator = (BigDecimal.valueOf(7 * sqrt(5.0)) * BigDecimal.valueOf(sqrt(rate.toDouble()))) - BigDecimal.valueOf(12)

    println("Rate : $rate")
    println("Domi : $dominator")
    println("Result : ${BigDecimal.valueOf(2.0) / dominator}")

    println("${(BigDecimal.valueOf(2.0) / dominator) == BigDecimal.valueOf(1.0)}")

}

class TenantCal {
}