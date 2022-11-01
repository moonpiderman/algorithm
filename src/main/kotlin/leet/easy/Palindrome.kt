package leet.easy

fun main() {
    val palindrome = Palindrome()
    val examples = intArrayOf(121, -121, 10, -10)
    examples.forEach { println(palindrome.isPalindrome(it)) }
}

class Palindrome {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false
        val toString = x.toString()
        val reversed = toString.reversed()

        return reversed == toString
    }
}