package org.cw2037c

import org.permutations

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

// not prime, divisible for positive integers other than 1
fun isComposite(n: Int): Boolean {
    return !isPrimeMemoized(n)
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