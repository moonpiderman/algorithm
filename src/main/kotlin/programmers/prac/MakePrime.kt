package programmers.prac

import kotlin.math.sqrt

fun main() {
    val nums = arrayOf(
        intArrayOf(1, 2, 3, 4), intArrayOf(1, 2, 7, 6, 4)
    )
    val sol = MakePrime()

    for (i in nums.indices) {
        println(sol.solution(nums[i]))
    }
}

class MakePrime {
    private fun checkPrime(chk: Int): Boolean {
        if (chk < 2) return false
        for (i in 2..sqrt(chk.toDouble()).toInt()) if (chk % i == 0) return false
        return true
    }

    fun solution(nums: IntArray): Int {
        var answer: Int = 0

        for (i in 0 until nums.size - 2) {
            for (j in i + 1 until nums.size - 1) {
                for (k in j + 1 until nums.size) {
                    if (checkPrime(nums[i] + nums[j] + nums[k])) answer++
                }
            }
        }
        return answer
    }
}