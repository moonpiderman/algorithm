package kotlinGram

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val stack = arrayListOf<Int>()

    print("얼마를 넣으실 건가요? (1,000원 기준): ")
    val paper = sc.nextLine().toInt()

    for (i in 0 until paper) {
        var count = 0
        while (count < 6) {
            val lottoNumber = (1..45).random()
            if (!stack.contains(lottoNumber)) {
                stack.add(lottoNumber)
                count += 1
            }
        }
        print("${i + 1}번째 : ")
        stack.forEach { print("$it ") }
        println()
        stack.clear()
    }
}

class Lotto() {
}