package leet.easy

fun main() {

}
class GetConcatenation {
    fun getConcatenation(nums: IntArray): IntArray {
        val answer = IntArray(nums.size * 2)

        for (idx in nums.indices) {
            answer[idx] = nums[idx]
            answer[idx + nums.size] = nums[idx]
        }

        return answer
    }
}