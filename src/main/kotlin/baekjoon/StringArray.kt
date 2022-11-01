package baekjoon

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.jvm.Throws

@Throws(IOException::class)
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val stringToken = StringTokenizer(br.readLine())
    val n = Integer.parseInt(stringToken.nextToken())
    val m = Integer.parseInt(stringToken.nextToken())
    var count = 0

    val map = HashMap<String, Int>()
    for (i in 0..n) {
        map[br.readLine()] = 0
    }

    for (i in 0..m) {
        if (map.containsKey(br.readLine())) count += 1
    }
    print(count)
}

class StringArray {
}