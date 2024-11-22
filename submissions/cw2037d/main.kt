fun readStr() = readln()
fun readInt() = readStr().toInt()

fun f(n: Int): Int {
    return n + 2
}

fun main() {
    try {
        val testCases = readInt()
        for (tc in 1..testCases) {
            val n = readInt()
            println("${f(n)}")
        }
    } catch (_: Throwable) {}
}
