package leet.medium

fun main() {
    val examples = listOf<Array<String>>(
        arrayOf("eat", "tea", "tan", "ate", "nat", "bat"),
        arrayOf(""),
        arrayOf("a")
    )
    val groupAnagram = GroupAnagram()
    examples.forEach { println(groupAnagram.groupAnagrams(it)) }
}

class GroupAnagram {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val mutableMap = mutableMapOf<String, MutableList<String>>()
        strs.map {
            val sortedString = it.toCharArray().sorted().joinToString("")
            if (!mutableMap.containsKey(sortedString)) {
                mutableMap[sortedString] = mutableListOf(it)
            } else {
                mutableMap[sortedString]!!.add(it)
            }
        }

        return mutableMap.values.sortedBy { it.size }
    }
}