package programmers.prac

fun main() {
    val s = arrayOf("a234", "1234")
    val sol = BasicString()

    for (value in s) {
        println(sol.solution(value).toString())
    }
}

class BasicString {
    fun solution2(s: String): Boolean {
        val len = s.length
        if (len != 4 && len != 6) return false

        for (idx in 0 until (len/2)) {
            return !(!s[idx].isDigit() || !s[len - 1 - idx].isDigit())
        }
        return true
    }

    fun solution(s: String): Boolean {
        return s.all {
            it.isDigit()
        } && ((s.length == 4 || s.length == 6))
    }
}