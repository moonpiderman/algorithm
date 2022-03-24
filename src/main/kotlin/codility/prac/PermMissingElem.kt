package codility.prac

fun main() {
    val a = intArrayOf(2, 3, 1, 5)
    val sol = PermMissingElem()
    println(sol.solution(a))
}

class PermMissingElem {
    fun solution(A: IntArray): Int {
        val n = (A.size + 1).toLong()
        val sequence = n * (1 + n) / 2L
        val sum = A.sum().toLong()

        return (sequence - sum).toInt()
    }
}