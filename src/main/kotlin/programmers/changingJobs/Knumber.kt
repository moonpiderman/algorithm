package programmers.changingJobs

fun main() {
    val knumber = Knumber()

    val exampleArray = intArrayOf(1, 5, 2, 6, 3, 7, 4)
    val exampleIntArrayOfArray = arrayOf(intArrayOf(2, 5, 3), intArrayOf(4, 4, 1), intArrayOf(1, 7, 3))

    val sol = knumber.solution(exampleArray, exampleIntArrayOfArray)
    println(sol)
}

class Knumber {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        val resultArray = IntArray(commands.size)

        for (i in commands.indices) {
            var temp = array.slice((commands[i][0] - 1) until (commands[i][1]))
            temp = temp.sorted()
            resultArray[i] = temp[commands[i][2] - 1]
        }
        return resultArray
    }
}