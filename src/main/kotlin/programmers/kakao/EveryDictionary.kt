package programmers.kakao

fun main() {
    val dictionary = EveryDictionary()

    val word1 = "AAAAE"
    val word2 = "AAAE"
    val word3 = "I"
    val word4 = "EIO"

    println(dictionary.solution(word1))
    println(dictionary.solution(word2))
    println(dictionary.solution(word3))
    println(dictionary.solution(word4))
}

class EveryDictionary {
    val alphabet = arrayOf('A', 'E', 'I', 'O', 'U')
    lateinit var list: MutableList<String>

    fun dfs(result: String) {
        list.add(result)

        if (result.length == 5) {
            return
        }

        for (element in alphabet) {
            dfs(result + element)
        }
    }

    fun solution(word: String): Int {
        var answer = 0

        list = mutableListOf()
        dfs("")

        for (idx in list.indices) {
            if (list[idx] == word) {
                answer = idx
                break
            }
        }

        return answer
    }
}