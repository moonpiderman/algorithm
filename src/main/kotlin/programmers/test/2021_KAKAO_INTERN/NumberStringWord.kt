package programmers.test.`2021_KAKAO_INTERN`

fun main() {
    val ss = arrayOf(
        "one4seveneight", "23four5six7", "2three45sixseven", "123"
    )
    val sol = NumberStringWord()
    for (i in ss.indices) {
        println(sol.solution(ss[i]))
    }
}

class NumberStringWord {
    fun solution(s: String): Int {
        val numberSet = arrayOf(
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
        )
        var str = s

        for ((i, n) in numberSet.withIndex()) {
            str = str.replace(n, i.toString())
        }
        return str.toInt()
    }
}