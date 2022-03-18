package programmers.prac

import kotlin.math.pow

fun main() {
    val n = intArrayOf(45, 125)
    val sol = BaseThree()

    for (i in n) {
        println(sol.solution(i))
        println(sol.solution2(i))
    }
}

class BaseThree {
    fun changeBaseThree(number: Int) : String {
        var div = number
        var base = ""
        val baseThree = intArrayOf(0, 1, 2)

        while (div > 0) {
            base += baseThree[div % 3].toString()
            div /= 3
        }

        return base
    }

    fun solution(n: Int): Int {
        var answer: Int = 0

        val change: String = changeBaseThree(n)
        val len = change.length

        for (i in 0 until (len)) {
            answer += (change[i].code.toInt() - 48) * (3.0).pow(len - 1 - i).toInt()
        }

        return answer
    }

    fun solution2(n: Int): Int {
        return n.toString(3).reversed().toInt(3)
    }
}