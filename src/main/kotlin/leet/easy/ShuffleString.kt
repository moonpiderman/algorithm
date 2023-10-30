package leet.easy

fun main() {
    val sol = ShuffleString()

    val s1 = "codeleet"
    val indices1 = intArrayOf(4,5,6,7,0,2,1,3)

    val s2 = "abc"
    val indices2 = intArrayOf(0,1,2)

    println(sol.restoreString(s1, indices1))
    println(sol.restoreString(s2, indices2))
}
class ShuffleString {
    fun restoreString(s: String, indices: IntArray): String {
        var result = ""
        val sList = s.toList()
        val pairList = mutableListOf<Pair<Char, Int>>()

        for (i in sList.indices) {
            val pair = Pair(first = sList[i], second = indices[i])
            pairList.add(pair)
        }

        val sorted = pairList.sortedBy { it.second }
        sorted.forEach { result += it.first }

        return result
    }
}