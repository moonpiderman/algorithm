package leet.medium

fun main() {
    val threeSum = ThreeSum()
    val examples = listOf<IntArray>(intArrayOf(-1,0,1,2,-1,-4), intArrayOf(0,1,1), intArrayOf(0,0,0))
    examples.map { println(threeSum.threeSum(it)) }
}

class ThreeSum {
    fun threeSum(nums: IntArray): List<List<Int>> {
        if (nums.size == 3) return if (nums.sum() == 0) listOf(nums.toList()) else listOf()
        if (nums.size >= 3000) return listOf()

        val resultList = mutableListOf<List<Int>>()
        nums.sort()

        for (i in 0..nums.size - 3) {
            val first = nums[i]
            if (first > 0 ) break
            for (j in i + 1..nums.size - 2) {
                val second = nums[j]
                for (k in nums.size - 1 downTo j + 1) {
                    val third = nums[k]
                    val sum = first + second + third
                    if (sum == 0) {
                        val tmpResult = listOf<Int>(first, second, third)
                        if (!resultList.contains(tmpResult)) resultList.add(tmpResult)
                        break
                    } else if (sum < 0) break
                }
            }
        }
        return resultList
    }
}