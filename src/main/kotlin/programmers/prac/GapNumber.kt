package programmers.prac

fun main() {
    val sol = GapNumber()

    val xs = intArrayOf(2, 4, -4)
    val ns = intArrayOf(5, 3, 2)

    val len = xs.size

    for (i in 0 until len) {
        val result = sol.solution(xs[i], ns[i])

        for (j in result.indices) {
            print(result[j])
            print(" ")
        }
        println()
    }
}

class GapNumber {
    fun solution(x: Int, n: Int) = LongArray(n) { x.toLong() * (it + 1) }
}

//class GapNumber {
//    fun solution(x: Int, n: Int): LongArray {
//        var answer = longArrayOf()
//
//        for (i in 1..n) {
//            answer = answer.plus((x.toLong() * i))
//        }
//        return answer
//    }
//}