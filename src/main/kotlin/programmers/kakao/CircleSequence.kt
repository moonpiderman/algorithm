package programmers.kakao

fun main() {
    val circleSequence = CircleSequence()
    val elements = intArrayOf(7,9,1,1,4)
    val result = circleSequence.solution(elements)

    println(result)
}

class CircleSequence {
    fun solution(elements: IntArray): Int {
        val doubling = elements + elements
        val result = HashSet<Int>()

        for (i in 1..elements.size) {
            result.addAll((elements.indices).map {
                doubling.slice(it until it + i).sum()
            })
        }
        return result.size
    }
}