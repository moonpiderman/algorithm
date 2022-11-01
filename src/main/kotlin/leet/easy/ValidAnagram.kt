package leet.easy

fun main() {
    val validAnagram = ValidAnagram()
    val examples = listOf<Array<String>>(arrayOf("anagram", "nagaram"), arrayOf("rat", "car"))
    examples.forEach { println(validAnagram.isAnagram(it[0], it[1])) }
}

class ValidAnagram {
    fun isAnagram(s: String, t: String): Boolean {
        val sArray = s.toCharArray().sorted().joinToString("")
        val tArray = t.toCharArray().sorted().joinToString("")

        return sArray == tArray
    }
}