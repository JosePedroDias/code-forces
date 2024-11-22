package zp

fun readStr() = readln()
fun readInt() = readStr().toInt()
fun readStrings() = readStr().split(" ")
fun readInts() = readStrings().map { it.toInt() }

////

// returns array with responses up to the limit
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

fun comb2(n: Int): List<Pair<Int, Int>> {
    val res = mutableListOf<Pair<Int, Int>>()
    for (j in 1 until n) {
        for (i in 0 until j) {
            res.add(Pair(i, j))
        }
    }
    return res
}

fun naturals(n: Int): List<Int> {
    return List(n) { it + 1 }
}

private fun <T> permutations0(list: List<T>): List<List<T>> {
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
    return permutations0(naturals(n))
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
    val list = (1..n).toList()
    yieldAll(permutationsSequence(list))
}
