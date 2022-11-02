package leet.medium

fun main() {
    val examples = listOf<IntArray>(intArrayOf(100,4,200,1,3,2), intArrayOf(0,3,7,2,5,8,4,6,0,1))

    val longestConsecutive = LongestConsecutive()
    examples.forEach { println(longestConsecutive.longestConsecutive(it)) }
}

class LongestConsecutive {
    fun longestConsecutive(nums: IntArray): Int {
        if (nums.isEmpty()) return 0



        val sortedNums = nums.sortedArray()
        var result = 1
        for (i in 0 until nums.size - 1) {
            if (sortedNums[i] + 1 == sortedNums[i + 1]) result++ else result = 1
        }
        return result
    }
}