package codility.prac

fun main() {
    val As = arrayOf(
        intArrayOf(3, 8, 9, 7, 6), intArrayOf(0, 0, 0), intArrayOf(1, 2, 3, 4)
    )
    val Ks = intArrayOf(
        3, 1, 4
    )

    val sol = CyclicRotation()

    for (i in As.indices) {
        val pr = sol.solution(As[i], Ks[i])
        for (j in pr) print("$j ")
        println()
    }
}

class CyclicRotation {
    fun solution(A: IntArray, K: Int): IntArray {
        val len = A.size

        val answer: IntArray = IntArray(len)

        if (len == 1) return A
        if (K == len) return A
        if (A.isEmpty()) return answer

        for (i in A.indices) {
            val idx: Int = (i + K) % A.size
            answer[idx] = A[i]
        }

        return answer
    }
}