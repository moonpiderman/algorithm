package programmers.prac

fun main() {
    val gyul = Gyul()
    val k1 = 6
    val k2 = 4
    val k3 = 2

    val tangerine1 = intArrayOf(1, 3, 2, 5, 4, 5, 2, 3)
    val tangerine2 = intArrayOf(1, 3, 2, 5, 4, 5, 2, 3)
    val tangerine3 = intArrayOf(1, 1, 1, 1, 2, 2, 2, 3)

    println(gyul.solution(k1, tangerine1))
    println(gyul.solution(k2, tangerine2))
    println(gyul.solution(k3, tangerine3))
}

class Gyul {
    fun solution(k: Int, tangerine: IntArray): Int {
        var kValue = k
        var answer = 0

        val map = hashMapOf<Int, Int>()

        for (t in tangerine) {
            map[t] = map.getOrDefault(t, 0) + 1
        }

        val keyList = map.entries
            .sortedByDescending { it.value }
            .map { it.key }

        for (key in keyList) {
            if (kValue <= 0) {
                break
            }

            answer++

            kValue -= map[key]!!
        }

        return answer
    }
}