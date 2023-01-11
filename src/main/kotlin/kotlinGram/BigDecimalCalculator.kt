package kotlinGram

fun main() {
    val basicPlan = 100.0
    val recentToNext = 30
    val term = 26

    val pricePerDay = basicPlan / recentToNext
    val ceilingPricePerDay = Math.ceil(pricePerDay)

    println("하루 당 요금 : $pricePerDay")
    println("하루 요금 올림 : $ceilingPricePerDay")
    println("총량 단순 계산 : ${ceilingPricePerDay * term}")
}
class BigDecimalCalculator {
}