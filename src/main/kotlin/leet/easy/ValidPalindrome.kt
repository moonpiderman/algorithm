package leet.easy

fun main() {
    val validPalindrome = ValidPalindrome()
    val examples = listOf<String>("A man, a plan, a canal: Panama", "race a car", " ", "0P")
    examples.map { println(validPalindrome.isPalindrome(it)) }
}

class ValidPalindrome {
    fun isPalindrome(s: String): Boolean {
        var answer = ""
        s.forEach { if (it.isLetterOrDigit()) answer += it }
        answer = answer.toLowerCase()
        return answer == answer.reversed()
    }
}