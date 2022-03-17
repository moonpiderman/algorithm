package programmers.prac

import java.lang.Integer.min
import java.lang.Integer.max

fun main() {
    val n1 = 3
    val n2 = 2

    val m1 = 12
    val m2 = 5

    val sol1 = GcdLcm().solution(n1, m1)
    val sol2 = GcdLcm().solution(n2, m2)

    for (i in sol1) {
        println("$i ")
    }

    for (j in sol2) {
        println("$j ")
    }
}

class GcdLcm {
    fun gcd(n: Int, m: Int): Int {
        var maxi = max(n, m)
        var mini = min(n, m)

        return if (mini == 0) {
            max(n, m)
        } else {
            gcd(mini, maxi % mini)
        }
    }

    fun solution(n: Int, m: Int): IntArray {
        var answer = intArrayOf()

        answer = answer.plus(gcd(n, m))
        answer = answer.plus(n * m / gcd(n, m))

        return answer
    }
}