package org.cw2037c

import org.permutationSeq

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