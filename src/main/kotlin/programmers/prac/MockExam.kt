package programmers.prac

fun main() {
    val mockExam = MockExam()

    val answer1 = intArrayOf(1, 2, 3, 4, 5)
    val answer2 = intArrayOf(1, 3, 2, 4, 2)

    println(mockExam.solution(answer1).contentToString())
    println(mockExam.solution(answer2).contentToString())
}

class MockExam {
    fun solution(answers: IntArray): IntArray {
        val userAnswers = arrayOf(
            intArrayOf(1, 2, 3, 4, 5),
            intArrayOf(2, 1, 2, 3, 2, 4, 2, 5),
            intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
        )

        val cnt = IntArray(3)
        val answer = mutableListOf<Int>()

        userAnswers.forEachIndexed { i, userAns ->
            cnt[i] = answers.filterIndexed { j, ans -> ans == userAns[j % userAns.size] }.count()
        }
        cnt.forEachIndexed{ idx, i -> if(cnt.maxOrNull() == i) answer.add(idx + 1) }

        return answer.toIntArray()
    }
}