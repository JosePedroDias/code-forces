package org.cw2037c

import org.naturals
import org.permutationSeq

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

val primeData = sieveOfEratosthenes(20000)

fun isPrime(n: Int): Boolean {
    return primeData[n]
}

fun computeValidTransitions(n: Int): Pair<List<Int>, MutableMap<Int, Set<Int>>> {
    val nums = naturals(n)
    val m = mutableMapOf<Int, Set<Int>>()
    for (a in nums) {
        val s = mutableSetOf<Int>()
        for (b in nums) {
            if (!isPrime(a + b)) {
                s.add(b)
            }
        }
        m[a] = s
    }
    return Pair(nums, m)
}

fun permutationsSeq(list: List<Int>, map: Map<Int, Set<Int>>): Sequence<List<Int>> = sequence {
    if (list.isEmpty()) {
        yield(emptyList())
    } else {
        for (i in list.indices) {
            val item = list[i]
            val nextValid = map[item]?.toList() ?: return@sequence
            for (item2 in nextValid) {
                var remaining = list.take(i) + list.drop(i + 2)
                val s = remaining.toMutableSet()
                s.remove(item2)
                remaining = s.toList()
                for (perm in permutationsSeq(remaining, map)) {
                    val candidate = listOf(item) + listOf(item2) + perm
                    if (candidate.size == list.size) {
                        yield(candidate)
                    }
                }
            }
        }
    }
}

fun primogen(n: Int): String {
    val (nums, m) = computeValidTransitions(n)
    for (candidate in permutationsSeq(nums, m)) {
        return candidate.joinToString(" ")
    }
    return "-1"
}

fun primogenOld(n: Int): String {
    label@ for (candidate in permutationSeq(n)) {
        for (i in 0 until n - 1) {
            if (isPrime(candidate[i] + candidate[i + 1])) {
                continue@label
            }
        }
        return candidate.joinToString(" ")
    }
    return "-1"
}