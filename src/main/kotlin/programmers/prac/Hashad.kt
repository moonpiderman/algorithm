package programmers.prac

fun main(){
    val arr = intArrayOf(10, 12, 11, 13)
    val sol = Hashad()

    var result: String

    for (i in arr) {
        result = sol.solution(i).toString()
        println(result)
    }
}

class Hashad {
    fun solution(x: Int): Boolean {
        var sum = 0
        val temp: String = x.toString()

        for (i in temp) {
            sum += i.code.toInt() - 48
        }

        return x % sum == 0
    }
}

//class Hashad {
//    fun solution(x: Int): Boolean {
//        return 0 == x % (x.toString().chars().map { it - '0'.toInt() }.sum())
//    }
//}