package programmers.prac

fun main() {
    val nSquareTrim = NSquareTrim()

    val n1 = 3
    val left1= 2L
    val right1 = 5L

    val n2 = 4
    val left2 = 7L
    val right2 = 14L

    nSquareTrim.solution(n1, left1, right1).forEach { print("$it ") }
    println()
    nSquareTrim.solution(n2, left2, right2).forEach { print("$it ") }
}

class NSquareTrim {
    fun solution(n: Int, left: Long, right: Long): IntArray {
        val answer = IntArray((right - left + 1).toInt())

        for (i in left..right) {
            val div = i / n
            val mod = i % n

            val value = if (div < mod) {
                mod
            } else {
                div
            }

            answer[(i - left).toInt()] = value.toInt() + 1
        }

        return answer
    }
}