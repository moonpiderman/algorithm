package kotlinGram

fun main() {
    val str = "https://amber-polonium-13a.notion.site/Dotover-mobile-c1302b1dd88f4b02ae4742acd87d16bd," +
            "https://amber-polonium-13a.notion.site/Dotover-mobile-c1302b1dd88f4b02ae4742acd87d16bd," +
            "https://amber-polonium-13a.notion.site/Dotover-mobile-c1302b1dd88f4b02ae4742acd87d16bd," +
            "https://amber-polonium-13a.notion.site/Dotover-mobile-c1302b1dd88f4b02ae4742acd87d16bd"
    val split = str.split(",")
    split.map { println(it) }
}
class TakeOnTheCar {
}