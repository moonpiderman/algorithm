package programmers.prac

fun main() {
    val ns = intArrayOf(12, 5)
    val sol = SumGcd()

    for (i in ns) println(sol.solution(i))
    for (i in ns) println(sol.solution2(i))
}

class SumGcd {
    fun solution2(n: Int): Int {
        return (1..n).filter { n % it == 0 }.sum()
    }

    fun solution(n: Int): Int {
        var answer: Int = 0
        for (i in 1..n) {
            if (n % i == 0) answer += i
        }
        return answer
    }
}