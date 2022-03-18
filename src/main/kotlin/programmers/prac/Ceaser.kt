package programmers.prac

fun main() {
    val S: Array<String> = arrayOf("AB", "z", "a B z")
    val N = intArrayOf(1, 1, 4)

    val len = S.size
    val sol = Ceaser()

    for (i in 0 until len) {
        println(sol.solution(S[i], N[i]))
    }
}

//class Ceaser {
//    fun changeCodeFromUpper(value: Int) : Char {
//        return if (value > 90) {
//            (value - 26).toChar()
//        } else value.toChar()
//    }
//
//    fun changeCodeFromLower(value: Int) : Char {
//        return if (value > 122) {
//            (value - 26).toChar()
//        } else value.toChar()
//    }
//
//    fun solution(s: String, n: Int): String {
//        var answer = ""
//
//        for (v in s) {
//            var tmp = v
//            if (tmp.isUpperCase()) {
//                tmp = changeCodeFromUpper(tmp.code + n)
//            } else if (tmp.isLowerCase()) {
//                tmp = changeCodeFromLower(tmp.code + n)
//            }
//            answer += tmp
//        }
//        return answer
//    }
//}

// More Koltinic
class Ceaser {
    fun solution(s: String, n: Int): String {
        return s.toCharArray().map {
            when (it) {
                in 'A'..'Z' -> {
                    if (it + n > 'Z') it + n - 26 else it + n
                } in 'a'..'z' -> {
                    if (it + n > 'z') it + n - 26 else it + n
                } else -> {
                    it
                }
            }
        }.joinToString("")
    }
}