package kotlinGram

fun main() {
    var b = 100.00
    val v = 20.00

    val current = b
    b -= v
    b -= v
    b -= v

    println(current)
    println(b)
}

enum class EnumCheck(val code: Int) {
    SOLD_BUILDING(1),

    RENT_BUILDING(2),

    SUCCESS_WITHDRAW(3),

    SUCCESS_DEPOSIT(4),
}