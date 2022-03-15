package programmers.prac

fun main() {
    val arr1 = intArrayOf(4, 3, 2, 1)
    val arr2 = intArrayOf(10)

    val sol = RemoveMinimum()

    val sol1 = sol.solution(arr1)
    val sol2 = sol.solution(arr2)

    for (i in sol1) {
        print(i)
        print(" ")
    }
    println()

    for (i in sol2) {
        print(i)
        print(" ")
    }
}

class RemoveMinimum {
    fun solution(arr: IntArray) : IntArray {

        return if (arr.size == 1) {
            intArrayOf(-1)
        } else {
            val result = arr.toMutableList()
            val mini = arr.minOrNull()
            result.remove(mini)
            result.toIntArray()
        }
    }
}