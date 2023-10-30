package leet.easy

class NumberOfSteps {
    fun numberOfSteps(num: Int): Int {
        var n = num
        var step = 0

        while (n != 0) {
            if (n % 2 == 0) {
                n /= 2
            } else {
                n -= 1
            }
            step += 1
        }

        return step
    }
}