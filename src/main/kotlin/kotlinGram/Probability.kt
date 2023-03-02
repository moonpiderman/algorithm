package kotlinGram

fun main() {
    val rate = 0.16
    val rand = Math.random()

    println("random : $rand")

    val randomBoolean = rand < rate

    println("return : $randomBoolean")
}
class Probability {
}