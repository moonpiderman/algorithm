package kotlinGram

fun main() {
    val uri = "https://server.coolestnerds.com/api/v1/project/domain/xenics-showroom.dotover.io"

    println(uri.split("/").last())
}
class RequestUri {
}