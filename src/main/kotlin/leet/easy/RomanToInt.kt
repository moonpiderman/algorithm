package leet.easy

fun main() {
    val romanToInt = RomanToInt()

    val s1 = "III"
    val s2 = "LVIII"
    val s3 = "MCMXCIV"

    println("S1 : ${romanToInt.romanToInt(s1)}")
    println("S2 : ${romanToInt.romanToInt(s2)}")
    println("S3 : ${romanToInt.romanToInt(s3)}")
}

class RomanToInt {
    fun romanToInt(s: String): Int {
        val map = mapOf<String, Int>(
            "I" to 1,
            "V" to 5,
            "X" to 10,
            "L" to 50,
            "C" to 100,
            "D" to 500,
            "M" to 1000
        )

        val arr = s.split("").toTypedArray()

        var result = 0
        for (i in (arr.indices)) {
            if ((arr[i] != arr[i + 1]) && (map[arr[i]]!! < map[arr[i + 1]]!!)) {
                result += (map[arr[i + 1]]!! - map[arr[i]]!!)
                i += 1
            } else {
                result += map[arr[i]]!!
            }
        }
    }
}