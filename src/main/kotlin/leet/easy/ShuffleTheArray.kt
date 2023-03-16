package leet.easy

fun main() {
    val nums1 = intArrayOf(2, 5, 1, 3, 4, 7)
    val n1 = 3
    val nums2 = intArrayOf(1, 2, 3, 4, 4, 3, 2, 1)
    val n2 = 4
    val nums3 = intArrayOf(1, 1, 2, 2)
    val n3 = 2

    val sol = ShuffleTheArray()

    println("nums1 Answer : ")
    sol.shuffle(nums1, n1).forEach { print("$it ") }
    println()
    println("nums2 Answer : ")
    sol.shuffle(nums2, n2).forEach { print("$it ") }
    println()
    println("nums3 Answer : ")
    sol.shuffle(nums3, n3).forEach { print("$it ") }
    println()
}
class ShuffleTheArray {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        val mutableMap = mutableMapOf<Int, IntArray>()
        val answer = IntArray(nums.size)

        for (i in 0 until n) {
            mutableMap[i] = intArrayOf(nums[i], nums[i + n])
        }



        return answer
    }
}