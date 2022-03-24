package codility.prac
import kotlin.math.abs

fun main() {
    val a = intArrayOf(3, 1, 2, 4, 3)
    val sol = TapeEquilibrium()
    println(sol.solution(a))
}

class TapeEquilibrium {
    fun solution(A: IntArray): Int {
        var after = 0
        for (i in A.indices) {
            after = after + A[i]
        }
        var min = Integer.MAX_VALUE
        var before = 0
        for (i in 1 until A.size) {
            before += A[i - 1]
            after -= A[i - 1]
            val answer = abs(before - after)

            if (min > answer) {
                min = answer
            }
        }
        return min
    }
}