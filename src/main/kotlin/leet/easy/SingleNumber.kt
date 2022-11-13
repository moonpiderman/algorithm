package leet.easy

fun main() {
    val singleNumber = SingleNumber()
    val examples = listOf<IntArray>(intArrayOf(2, 2, 1), intArrayOf(4, 1, 2, 1, 2,), intArrayOf(1))
    examples.map { println(singleNumber.singleNumber(it)) }
}

class SingleNumber {
    fun singleNumber(nums: IntArray): Int {
        return nums.reduce { acc, i -> acc.xor(i) }
    }
}