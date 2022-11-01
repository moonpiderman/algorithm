package leet.medium

fun main() {
    val topKFrequent = TopKFrequent()
    val examples = mapOf<IntArray, Int>(intArrayOf(1, 1, 1, 2, 2, 3) to 2, intArrayOf(1) to 1)
    examples.map { println(topKFrequent.topKFrequent(it.key, it.value)) }
}

class TopKFrequent {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        if (nums.size == k) return nums

        val sortedNums = nums.sortedArray()
        val mutableMap = mutableMapOf<Int, Int>()
        val returnMutable = mutableListOf<Int>()

        sortedNums.map {
            if (!mutableMap.containsKey(it)) {
                mutableMap[it] = 1
            } else {
                mutableMap[it] = mutableMap[it]!! + 1
            }
        }

        if (k == 1) {
            val result = mutableMap.values.sortedByDescending { it }[0]
            return intArrayOf(mutableMap.filter { it.value == result }.keys.first())
        }

        mutableMap.map { if (it.value >= k) returnMutable.add(it.key) }

        return returnMutable.toIntArray()
    }
}