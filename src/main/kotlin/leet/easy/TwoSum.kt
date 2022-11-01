package leet.easy

fun main() {

}

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val visited = mutableMapOf<Int, Int>()
        nums.forEachIndexed { index, num ->
            if (visited.containsKey(num)) {
                return intArrayOf(visited[num]!!, index)
            }
            visited[target - num] = index
        }
        return intArrayOf()
    }
}