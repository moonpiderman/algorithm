package programmers.prac

fun main() {
    val N = intArrayOf(123, 987)
    val sol = SumSeat()

    for (value in N) println(sol.solution(value))
    for (value in N) println(sol.solution2(value))
}

class SumSeat {
    fun solution(n: Int): Int {
        var answer: Int = 0
        val strN = n.toString()
        for (value in strN) {
            answer += value.code - 48
        }
        return answer
    }

    fun solution2(n: Int): Int {
        return n.toString().map { it.toInt() - '0'.toInt() }.sum()
    }
}