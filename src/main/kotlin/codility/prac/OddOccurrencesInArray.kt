package codility.prac

fun main() {
    val A = intArrayOf(9, 3, 9, 3, 9, 7, 9)
    val sol = OddOccurrencesInArray()

    println(sol.solution(A))
}

class OddOccurrencesInArray {
    fun solution(A: IntArray): Int {
        var answer = 0
        for (i in A.indices) {
            answer = answer xor A[i]
            // xor : 같은 숫자면 0, 다르면 1
        }
        return answer
    }
}