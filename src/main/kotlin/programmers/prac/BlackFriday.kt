package programmers.prac

fun main() {
    val sol = BlackFriday()

    val want1 = arrayOf("banana", "apple", "rice", "pork", "pot")
    val want2 = arrayOf("apple")

    val number1 = intArrayOf(3, 2, 2, 2, 1)
    val number2 = intArrayOf(10)

    val discount1 = arrayOf("chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana")
    val discount2 = arrayOf("banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana")

    println(sol.solution(want1, number1, discount1))
    println(sol.solution(want2, number2, discount2))
}

class BlackFriday {
    fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {
        var answer = 0

        val numberSum = number.sum()

        val wannerList = mutableListOf<String>()
        want.forEachIndexed { index, s ->
            for (n in 0 until number[index]) {
                wannerList.add(s)
            }
        }

        val sortedWannerList = wannerList.sortedBy { it }

        for (dis in 0 .. (discount.size - numberSum)) {
            val subList = discount.slice(dis until dis + numberSum).sortedBy { it }

            if (subList == sortedWannerList) {
                answer++
            }
        }

        return answer
    }
}