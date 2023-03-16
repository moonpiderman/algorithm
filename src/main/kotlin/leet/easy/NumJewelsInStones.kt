package leet.easy

fun main() {
    val jewels1 = "aA"
    val stones1 = "aAAbbbb"
    val jewels2 = "z"
    val stones2 = "ZZ"

    val numJewelsInStones = NumJewelsInStones()

    println("First Answer : ${numJewelsInStones.numJewelsInStones(jewels1, stones1)}")
    println("Second Answer : ${numJewelsInStones.numJewelsInStones(jewels2, stones2)}")
}
class NumJewelsInStones {
    fun numJewelsInStones(jewels: String, stones: String): Int {
        var answer = 0
        val typedArray = jewels.toCharArray().toTypedArray()

        for (character in typedArray) {
            if (stones.contains(character)) {
                answer += stones.count { it == character }
            }
        }

        return answer
    }
}