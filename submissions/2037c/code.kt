fun isPrime(number: Int): Boolean {
    if (number <= 1) return false
    if (number == 2) return true
    if (number % 2 == 0) return false
    val limit = kotlin.math.sqrt(number.toDouble()).toInt()
    for (i in 3..limit step 2) {
        if (number % i == 0) return false
    }
    return true
}

fun isComposite(n: Int): Boolean {
    return !isPrime(n)
}

fun <T> permutations0(list: List<T>): List<List<T>> {
    if (list.isEmpty()) return listOf(emptyList())
    val result = mutableListOf<List<T>>()
    for (i in list.indices) {
        val item = list[i]
        val remaining = list.take(i) + list.drop(i + 1)
        for (perm in permutations0(remaining)) {
            result.add(listOf(item) + perm)
        }
    }
    return result
}

fun permutations(n: Int): List<List<Int>> {
    val l = List(n) { it + 1 }
    return permutations0(l)
}

fun primogen(n: Int): String {
    for (candidate in permutations(n)) {
        val results = candidate.zipWithNext {
                a, b -> isComposite(a + b)
        }
        if (results.all { it }) {
            return candidate.joinToString(" ")
        }
    }
    return "-1"
}


fun readStr() = readln()

fun readInt() = readStr().toInt()

fun main() {
    try {
        val testCases = readInt()
        for (tc in 0..testCases) {
            val n = readInt()
            println(primogen(n))
        }
    } catch (_: Throwable) {}
}