package leet.easy.sortalgo

fun main() {
    val sol = BubbleSort()
    val example = intArrayOf(2, 31, 29, 17, 1, 35, 22, 16)

    sol.bubbleSort(example).forEach { print("$it ") }
}
class BubbleSort {
    // 연속된 두 값을 비교해 더 큰 값이 뒤로 가도록 수행하는 정렬
    fun bubbleSort(array: IntArray): IntArray {
        var arr = array
        for (i in 0 until arr.lastIndex) {
            for (j in 0 until arr.lastIndex - i) {
                if (arr[j] > arr[j + 1]) {
                    arr = swap(arr, j, j + 1)
                }
            }
        }
        return arr
    }

    private fun swap(array: IntArray, i1: Int, i2: Int): IntArray {
        val temp = array[i1]
        array[i1] = array[i2]
        array[i2] = temp
        return array
    }
}