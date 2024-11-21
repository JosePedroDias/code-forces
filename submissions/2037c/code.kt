fun sieveOfEratosthenes(limit: Int): BooleanArray {
    val isPrime = BooleanArray(limit + 1) { true }
    isPrime[0] = false
    isPrime[1] = false
    for (i in 2..limit) {
        if (isPrime[i]) {
            for (j in i * 2..limit step i) {
                isPrime[j] = false
            }
        }
    }
    return isPrime
}

fun findValidSequence(n: Int, isPrime: BooleanArray): List<Int>? {
    val sequence = mutableListOf<Int>()
    val used = BooleanArray(n + 1) { false }

    fun backtrack(): Boolean {
        if (sequence.size == n) return true // Valid sequence found

        for (next in 1..n) {
            if (!used[next] && (sequence.isEmpty() || !isPrime[sequence.last() + next])) {
                sequence.add(next)
                used[next] = true
                if (backtrack()) return true
                // Backtrack
                sequence.removeAt(sequence.size - 1)
                used[next] = false
            }
        }
        return false
    }

    return if (backtrack()) sequence else null
}

fun primogen(n: Int, isPrime: BooleanArray): String {
    val sequence = findValidSequence(n, isPrime)
    return sequence?.joinToString(" ") ?: "-1"
}

fun main() {
    val limit = 100 // Set a reasonable limit for precomputed primes
    val isPrime = sieveOfEratosthenes(limit)

    try {
        val testCases = readln().toInt()
        repeat(testCases) {
            val n = readln().toInt()
            println(primogen(n, isPrime))
        }
    } catch (_: Throwable) {
    }
}

// DISCLAIMER: I had chatgpt help to optimize this iteration of the code
