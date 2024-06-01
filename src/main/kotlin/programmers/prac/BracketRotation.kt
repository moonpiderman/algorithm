package programmers.prac

fun main() {
    val sol = BracketRotation()

    println(sol.solution("[](){}"))
    println(sol.solution("}]()[{"))
    println(sol.solution("[)(]"))
    println(sol.solution("}}}"))
}

class BracketRotation {
    fun solution(s: String): Int {
        var answer = 0
        val doubling = s.toList() + s.toList()

        for (i in s.indices) {
            val brackets = doubling.slice(i until i + s.length)
            if (checkCorrectBrackets(brackets)) {
                answer++
            }
        }

        return answer
    }

    private fun checkCorrectBrackets(bracket: List<Char>): Boolean {
        val stack = mutableListOf<Char>()
        val bracketMap = mapOf(')' to '(', ']' to '[', '}' to '{')

        for (char in bracket) {
            if (char in bracketMap.values) {
                stack.add(char)
            } else if (char in bracketMap.keys) {
                if (stack.isEmpty() || stack.last() != bracketMap[char]) {
                    return false
                }
                stack.removeAt(stack.size - 1)
            }
        }

        return stack.isEmpty()
    }
}