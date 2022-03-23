package codility.prac

fun main(){
    val Ns = intArrayOf(
        9, 529, 1041, 32
    )
    val sol = BinaryGap()

    for (i in Ns) {
        println(sol.solution(i))
    }
}

class BinaryGap {
    fun solution(N: Int): Int {
        val binary = N.toString(2)
        var array: Array<Int> = arrayOf()
        var count = 0

        for (bin in binary) {
            if (bin == '0') {
                count += 1
            }
            else {
                array = array.plus(count)
                count = 0
            }
        }
        return array.maxOrNull()!!
        // return array.max()!!
    }
}