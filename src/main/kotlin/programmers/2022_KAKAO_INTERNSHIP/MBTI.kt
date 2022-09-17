package programmers.`2022_KAKAO_INTERNSHIP`

import kotlin.math.min

fun main() {
    val mbti = MBTI()
    val surveyOne = arrayOf("AN", "CF", "MJ", "RT", "NA")
    val choiceOne = intArrayOf(5, 3, 2, 7, 5)

    val surveyTwo = arrayOf("TR", "RT", "TR")
    val choiceTwo = intArrayOf(7, 1, 3)


}

class MBTI {
    fun solution(survey: Array<String>, choices: IntArray): String {
        var answer = ""
        val negative = arrayOf("T", "F", "M", "N")
        val positive = arrayOf("R", "C", "J", "A")

        val negativeNumeric = intArrayOf(1, 2, 3)
        val positiveNumeric = intArrayOf(5, 6, 7)

        for (index in survey.indices) {
            if (negativeNumeric.contains(choices[index])) {
                answer += survey[index][0]
            } else if (positiveNumeric.contains(choices[index])) {
                answer += survey[index][1]
            } else {
                answer += min(survey[index][0].toLong(), survey[index][1].toLong())
            }
        }
        return answer
    }
}