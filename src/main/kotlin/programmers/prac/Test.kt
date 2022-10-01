package programmers.prac

import java.util.*

fun main() {
    val price = listOf(89856, 103, 57, 34, 21, 15, 10, 7, 5, 4, 0)
    val num = listOf(17753, 5, 3, 2, 1, 1, 1, 1, 1, 1, 0)
    val auction = listOf(152, 10, 4, 3, 2, 2, 1, 1, 1, 1)

    val priceSize = 104
    val numSize = 1
    val auctionSize = 11

    val sol = Test()
    println(sol.solution(num, numSize))
}

class Test {
    fun solution(boundary: List<Int>, score: Int) : Any {
        val upStair: Int
        val downStair: Int
        var answer: Double = 0.0

        for (idx in boundary.indices) {
            val baseScore = ((idx - 1) * 10).toDouble()
            if (boundary[idx] == boundary[9]) return 0.0

            if (score > boundary[idx] || score == boundary[idx]) {
                if (score == boundary[idx]) {
                    return baseScore + 10
                }
                upStair = boundary[idx - 1]
                downStair = boundary[idx]
                answer = baseScore + ((upStair - score.toDouble()) / (upStair - downStair)) * 10
                break
            }
        }
        return answer
    }
}