package codility.prac

fun main() {
    val x = 10
    val y = 85
    val d = 30

    val sol = FrogJmp()

    println(sol.solution(x, y, d))
}

class FrogJmp {
    fun solution(X: Int, Y: Int, D: Int): Int {
        if (X > Y || X == Y) return 0

        val k = Y - X
        val answer = k / D

        return if ((k % D) > 0) answer + 1
        else answer
    }
}