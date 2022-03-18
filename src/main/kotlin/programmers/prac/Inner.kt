package programmers.prac

fun main() {
    val A = arrayOf(
        intArrayOf(1, 2, 3, 4), intArrayOf(-1, 0, 1)
    )
    val B = arrayOf(
        intArrayOf(-3, -1, 0, 2), intArrayOf(1, 0, -1)
    )

    val sol = Inner()
    for (i in A.indices) {
        println(sol.solution(A[i], B[i]))
        println(sol.solution2(A[i], B[i]))
    }
}

class Inner {
    fun solution(a: IntArray, b: IntArray): Int {
        var answer = 0
        for (i in a.indices) {
            answer += a[i] * b[i]
        }
        return answer
    }

    fun solution2(a: IntArray, b: IntArray): Int {
        return a.zip(b).fold(0) {
            initial, i -> initial + i.first * i.second
        }
    }
}