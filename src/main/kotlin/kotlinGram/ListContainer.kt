package kotlinGram

fun main() {
    val colorList = listOf("#000000", "#000001", "#000002", "#000003", "#000004", "#000005")
    val testList = listOf("#000000", "#000001")

    testList.forEach {
        if (!colorList.contains(it)) println("$it is not contained.")
    }
}

class ListContainer {
}