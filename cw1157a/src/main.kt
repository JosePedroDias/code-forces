fun numReachable(n_: Int): Int {
    var n = n_
    val unique = mutableSetOf<Int>()
    while (unique.add(n)) n = reachable(n)
    return unique.size
}

fun reachable(n: Int): Int {
    var o = n + 1
    while (o % 10 == 0) {
        o /= 10
    }
    return o
}

fun main() {
    try {
        while (true) {
            val n = readln().toInt()
            println(numReachable(n))
        }
    } catch (_: Throwable) {
        return
    }
}
