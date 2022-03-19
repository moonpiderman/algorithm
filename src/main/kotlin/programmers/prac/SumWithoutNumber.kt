package programmers.prac

fun main() {
    val numbers = arrayOf(
        intArrayOf(1, 2, 3, 4, 6, 7, 8, 0),
        intArrayOf(5, 8, 4, 0, 6, 7, 9)
    )
    val sol = SumWithoutNumber()

    for (i in numbers.indices) {
        println(sol.solution(numbers[i]))
    }
}

class SumWithoutNumber {
    // Same Runtime

    fun solution(numbers: IntArray): Int = 45 - numbers.sum()

    fun solution2(numbers: IntArray): Int {
        return 45 - numbers.sum()
    }
}