package leet.easy

fun main() {
    val a1 = arrayOf(intArrayOf(1, 2, 3,), intArrayOf(3, 2, 1))
    val a2 = arrayOf(intArrayOf(1, 5), intArrayOf(7, 3), intArrayOf(3, 5))
    val a3 = arrayOf(intArrayOf(2, 8, 7), intArrayOf(7, 1, 3), intArrayOf(1, 9, 5))

    val maxima = RichestCustomerWealth()

    println("First: ${maxima.maximumWealth(a1)}")
    println("Second: ${maxima.maximumWealth(a2)}")
    println("Third: ${maxima.maximumWealth(a3)}")
}
class RichestCustomerWealth {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        val answerArray = IntArray(accounts.size)

        accounts.forEachIndexed { index, ints ->
            answerArray[index] = ints.sum()
        }

        return answerArray.maxOrNull()!!
    }
}