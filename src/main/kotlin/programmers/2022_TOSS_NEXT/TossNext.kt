package programmers.`2022_TOSS_NEXT`

fun solution(s: String): Int {
    val len = s.length
    var temp = 0

    for (i in 0..len-2) {
        if (s[i] == s[i+1] && s[i] == s[i+2]) {
            val numeric = Character.getNumericValue(s[i])
            if (temp < numeric) {
                temp = numeric
            }
        }
        else {
            temp = -1
        }
    }
    return if (temp == -1) temp else temp * 111
}

fun solution2(levels: IntArray): Int {
    val mutableList = mutableListOf<Int>()
    val len = levels.size
    val index = kotlin.math.floor(len * 0.25).toInt()

    for (i in 1..index) {
        mutableList.add(levels[len-i])
    }

    return mutableList.minOrNull()!!
}

fun solution3(k: Int, dungeons: Array<IntArray>): Int {
    var newK = k
    var result = 0
    dungeons.forEach {
        if (it[0] <= newK) {
            newK -= it[1]
            result += 1
        } else {
            return result
        }
    }

    return result
}

fun main() {
    val s1 = "12223"
    val s2 = "111999333"
    val s3 = "123"

    println(solution(s1))
    println("----- solution 2 -----")

    val array1 = intArrayOf(1, 2, 3, 4)
    val array2 = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    println(solution2(array1))
}

class TossNext {
}