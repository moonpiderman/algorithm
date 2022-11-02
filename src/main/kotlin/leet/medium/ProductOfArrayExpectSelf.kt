package leet.medium

fun main() {
    val examples = listOf<IntArray>(intArrayOf(1, 2, 3, 4), intArrayOf(-1, 1, 0, -3, 3))
    val productOfArrayExpectSelf = ProductOfArrayExpectSelf()

    examples.forEach { println(productOfArrayExpectSelf.productExceptSelf(it)) }
}

class ProductOfArrayExpectSelf {
    fun productExceptSelf(nums: IntArray): IntArray {
        val returnArray = IntArray(nums.size)

        returnArray[0] = 1
        for (i in 1 until nums.size) {
            returnArray[i] = returnArray[i - 1] * nums[i - 1]
        }

        var postMultiple = 1
        for (i in nums.size - 2 downTo 0) {
            postMultiple *= nums[i + 1]
            returnArray[i] *= postMultiple
        }

        return returnArray
    }
}