package programmers.prac

fun main() {

}

class SmallerSquare {

    fun solution(sizes: Array<IntArray>): Int {
        val bigger = IntArray(sizes.size)
        val smaller = IntArray(sizes.size)

        for (i in sizes.indices) {
            bigger[i] = maxOf(sizes[i][0], sizes[i][1])
            smaller[i] = minOf(sizes[i][0], sizes[i][1])
        }

        return bigger.maxOrNull()!! * smaller.maxOrNull()!!
    }
}