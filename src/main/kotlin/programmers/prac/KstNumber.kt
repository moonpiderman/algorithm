package programmers.prac

fun main() {
    val array = intArrayOf(1, 5, 2, 6, 3, 7, 4)
    val commands = arrayOf(
        intArrayOf(2, 5, 3), intArrayOf(4, 4, 1), intArrayOf(1, 7, 3)
    )

    val sol = KstNumber().solution(array, commands)

    for (i in sol) {
        print("$i ")
    }
}

class KstNumber {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        val answer = IntArray(commands.size)

        for (i in answer.indices) {
            var tempArray = array.slice(commands[i][0]-1 until commands[i][1])
            tempArray = tempArray.sorted()
            answer[i] = tempArray[commands[i][2] - 1]
        }

        return answer
    }
}