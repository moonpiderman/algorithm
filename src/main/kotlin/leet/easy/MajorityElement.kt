package leet.easy

fun main() {
    val majorityElement = MajorityElement()
    val examples = listOf<IntArray>(intArrayOf(3, 2, 3), intArrayOf(2, 2, 1, 1, 1, 2, 2))
    examples.forEach { println(majorityElement.majorityElement(it)) }
}

class MajorityElement {
    fun majorityElement(nums: IntArray): Int {
        return nums.groupBy { it }
            .filterValues { it.size > (nums.size / 2) }
            .keys
            .first()
    }
}