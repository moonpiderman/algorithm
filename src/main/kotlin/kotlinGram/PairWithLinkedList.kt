package kotlinGram

import java.util.LinkedList

fun main() {
    val pairList = LinkedList<Pair<String, Int>>()

    pairList += Pair(first = "ninin", second = 5)
    pairList += Pair(first = "ninin", second = 2)

    pairList += listOf(Pair(first = "ninin", second = 1), Pair(first = "ninin", second = 20))

    pairList.forEach {
        println(it.second)
    }

    pairList.sortedByDescending { it.second }.forEach {
        println(it.second)
    }
}

class PairWithLinkedList {

}