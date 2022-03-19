package programmers.prac

fun main() {
    val abs = arrayOf(
        intArrayOf(4, 7, 12), intArrayOf(1, 2, 3)
    )
    val sgs = arrayOf(
        booleanArrayOf(true, false, true), booleanArrayOf(false, false, true)
    )
    val sol = YinYang()

    for (i in abs.indices) {
        println(sol.solution(abs[i], sgs[i]))
    }
}

class YinYang {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer = 0

        for (i in absolutes.indices) {
            answer += if (signs[i]) {
                absolutes[i]
            } else {
                absolutes[i] * -1
            }
        }

        return answer
    }
}