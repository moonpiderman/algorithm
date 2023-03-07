package leet.easy

fun main() {
    val op1 = arrayOf("--X", "X++", "X++")
    val op2 = arrayOf("++X", "++X", "X++")
    val op3 = arrayOf("X++", "++X", "--X", "X--")

    val sol = FinalValue()

    println("Answer Of OP 1 : ${sol.finalValueAfterOperations(op1)}")
    println("Answer Of OP 2 : ${sol.finalValueAfterOperations(op2)}")
    println("Answer Of OP 3 : ${sol.finalValueAfterOperations(op3)}")
}
class FinalValue {
    fun finalValueAfterOperations(operations: Array<String>): Int {
        val map = mapOf<String, Int>(
            "++" to 1,
            "--" to -1
        )

        var initX = 0

        operations.forEach {
            initX += map[it.replace("X", "")]!!
        }

        return initX
    }
}