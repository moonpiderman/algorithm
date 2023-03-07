package leet.easy

fun main() {
    val b = BuildArrayFromPermutation()

    val inputA = intArrayOf(0, 2, 1, 5, 3, 4)
    val inputB = intArrayOf(5, 0, 1, 2, 3, 4)

    println("input A : ")
    b.buildArray(inputA).forEach { print("$it ") }
    println()
    println("input B : ")
    b.buildArray(inputB).forEach { print("$it ") }
}
class BuildArrayFromPermutation {
    fun buildArray(nums: IntArray): IntArray {
        val ans = IntArray(nums.size)
        for (i in nums.indices) {
            ans[i] = nums[nums[i]]
        }
        return ans
    }
}