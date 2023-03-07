package leet.easy

import kotlin.math.abs

fun main() {
    val nums1 = intArrayOf(10, 4, 8, 3)
    val nums2 = intArrayOf(1)

    val sol = LeftRightDifference()
    println("Nums 1 Answer : ")
    sol.leftRightDifference(nums1).forEach {
        print("$it ")
    }
    println()
    sol.leftRightDifference(nums2).forEach {
        print("$it ")
    }
    println()
}

class LeftRightDifference {
    fun leftRightDifference(nums: IntArray): IntArray {
        val leftArray = IntArray(nums.size)
        val rightArray = IntArray(nums.size)

        leftArray[0] = 0
        rightArray[rightArray.size - 1] = 0

        for (i in 1 until nums.size) {
            leftArray[i] = leftArray[i - 1] + nums[i - 1]
        }

        for (i in nums.size - 2 downTo 0) {
            rightArray[i] = rightArray[i + 1] + nums[i + 1]
        }

        return sumOfLeftRight(leftArray, rightArray)
    }

    fun sumOfLeftRight(left: IntArray, right: IntArray): IntArray {
        val answer = IntArray(left.size)

        for (i in left.indices) {
            answer[i] = abs(left[i] - right[i])
        }
        return answer
    }
}