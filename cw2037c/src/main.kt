fun primogen(n: Int): String {
    if (n < 5) return "-1"

    val nums = (1..n).toList()

    val startingEvens = nums.filter { it != 4 && it % 2 == 0 }
    val middle45 = listOf(4, 5)
    val endingOdds = nums.filter { it != 5 && it % 2 == 1 }

    val seq = startingEvens + middle45 + endingOdds
    return seq.joinToString(" ")
}

fun readStr() = readln()
fun readInt() = readStr().toInt()

fun main() {
    try {
        val testCases = readInt()
        for (tc in 1..testCases) {
            println(primogen(readInt()))
        }
    } catch (_: Throwable) {}
}
