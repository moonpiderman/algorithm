package leet.easy

fun main() {
    val examples = listOf<IntArray>(intArrayOf(1, 2, 3, 1), intArrayOf(1, 2, 3, 4), intArrayOf(1,1,1,3,3,4,3,2,4,2))
    val containsDuplicate = ContainsDuplicate()
    examples.forEach { println(containsDuplicate.containsDuplicate(it)) }
}

class ContainsDuplicate {
    fun containsDuplicate(nums: IntArray): Boolean {
        val sortedArray = nums.sortedArray()
        var checkNumber = sortedArray[0]

        for (idx in 1 until sortedArray.size) {
            if (checkNumber == sortedArray[idx]) {
                return true
            } else {
                checkNumber = sortedArray[idx]
            }
        }
        return false
    }
}