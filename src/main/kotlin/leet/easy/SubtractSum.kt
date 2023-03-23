package leet.easy

fun main() {
    val ex1 = 234
    val ex2 = 4421

    val sol = SubtractSum()
    println("Answer 1 : ${sol.subtractProductAndSum(ex1)}")
    println("Answer 2 : ${sol.subtractProductAndSum(ex2)}")
}
class SubtractSum {
    fun subtractProductAndSum(n: Int): Int {
        var nearN = n
        var multi = 1
        val mutableList = mutableListOf<Int>()

        while (nearN > 0) {
            val rest = nearN % 10
            mutableList.add(rest)
            multi *= rest
            nearN /= 10
        }

        return multi - mutableList.sum()
    }
}