package leet.easy.sortalgo

fun main() {
    val sol = InsertionSort()
    val example = intArrayOf(2, 31, 29, 17, 1, 35, 22, 16)

    val res = sol.insertionSort(example)
    res.forEach { print("$it ") }
}
class InsertionSort {
    // index를 기준으로 해당 Index의 값을 그 앞 index와 비교하여 더 작을 경우 swap
    fun insertionSort(arr: IntArray): IntArray {
        var array = arr
        for (i in 1 until array.size) {
            var index = i
            while (index > 0 && array[index - 1] > array[index]) {
                array = swap(array, index, index - 1)
                index--
            }
        }

        return array
    }

    private fun swap(array: IntArray, i1: Int, i2: Int): IntArray {
        val temp = array[i1]
        array[i1] = array[i2]
        array[i2] = temp
        return array
    }
}