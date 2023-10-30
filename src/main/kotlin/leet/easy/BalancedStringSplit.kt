package leet.easy

fun main() {
    val sol = BalancedStringSplit()

    val inputStr1 = "RLRRLLRLRL"
    val inputStr2 = "RLRRRLLRLL"
    val inputStr3 = "LLLLRRRR"

    println("INPUT 1 : ${ sol.balancedStringSplit(inputStr1) }")
    println("INPUT 2 : ${ sol.balancedStringSplit(inputStr2) }")
    println("INPUT 3 : ${ sol.balancedStringSplit(inputStr3) }")
}
class BalancedStringSplit {
    fun balancedStringSplit(s: String): Int {
        var sum = 0
        var answer = 0

        s.forEach {
            if (it == 'R') sum += 1
            else sum -= 1

            if (sum == 0) answer += 1
        }

        return answer
    }
}