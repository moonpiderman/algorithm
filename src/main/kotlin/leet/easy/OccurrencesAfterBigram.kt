package leet.easy

fun main() {
    val occurrencesAfterBigram = OccurrencesAfterBigram()
    val examples = listOf<List<String>>(listOf("alice is a good girl she is a good student", "a", "good"),
        listOf("we will we will rock you", "we", "will")
    )
    examples.forEach { println(occurrencesAfterBigram.findOcurrences(it[0], it[1], it[2])) }
}

class OccurrencesAfterBigram {
    fun findOcurrences(text: String, first: String, second: String): Array<String> {
        val array = mutableListOf<String>()
        val words = text.split(" ")

        for (i in 0 until words.size - 2) {
            if (words[i] == first && words[i + 1] == second) {
                array.add(words[i + 2])
            }
        }

        return array.toTypedArray()
    }
}