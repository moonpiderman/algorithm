package leet.easy

import java.math.BigDecimal
import java.util.concurrent.ConcurrentHashMap

fun main() {
    val sol = Concurrent()

    val players = arrayOf("mumu", "soe", "poe", "kai", "mine")
    val callings = arrayOf("kai", "kai", "mine", "mine")

    val res = sol.solution(players, callings)
    res.forEach { println(it) }
}


class Concurrent {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        callings.forEach {
            val targetIdx = players.indexOf(it)
            val targetFront = targetIdx - 1

            val temp = players[targetFront]
            players[targetFront] = players[targetIdx]
            players[targetIdx] = temp
        }

        return players
    }
}