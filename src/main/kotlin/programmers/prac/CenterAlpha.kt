package programmers.prac

fun main() {
    val ss: Array<String> = arrayOf(
        "abcde", "qwer"
    )

    val sol = CenterAlpha()

    println(sol.solution(ss[0]))
    println(sol.solution(ss[1]))
}

class CenterAlpha {
    fun solution(s: String): String {
        val answer: String
        val len = s.length
        if (len % 2 != 0) {
            answer = s[len / 2].toString()
        } else {
            answer = s[(len / 2) - 1].toString() + s[len / 2].toString()
        }
        return answer
    }
}