import java.lang.OutOfMemoryError

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

val primeCache = mutableMapOf<Int, Boolean>()
fun isPrimeMemoized(number: Int): Boolean {
    return primeCache.getOrPut(number) {
        isPrime(number)
    }
}

private fun <T> permutationsSequence(list: List<T>): Sequence<List<T>> = sequence {
    if (list.isEmpty()) {
        yield(emptyList())
    } else {
        for (i in list.indices) {
            val item = list[i]
            val remaining = list.take(i) + list.drop(i + 1)
            for (perm in permutationsSequence(remaining)) {
                yield(listOf(item) + perm)
            }
        }
    }
}

fun permutationSeq(n: Int): Sequence<List<Int>> = sequence {
    require(n >= 0) { "n must be a non-negative integer" }
    val list = (1..n).toList() // Generate numbers from 1 to n
    yieldAll(permutationsSequence(list))
}

fun primogen(n: Int): String {
    label@ for (candidate in permutationSeq(n)) {
        for (i in 0 until n - 1) {
            if (isPrimeMemoized(candidate[i] + candidate[i + 1])) {
                continue@label
            }
        }
        return candidate.joinToString(" ")
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
    } catch (_: OutOfMemoryError) {
        println("OOM")
    } catch (_: Throwable) {}
}
