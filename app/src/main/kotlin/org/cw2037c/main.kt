package org.cw2037c

import org.readInt

fun f(n: Int): Int { return 42 }

fun main() {
    try {
        val testCases = readInt()
        for (tc in 1..testCases) {
            val n = readInt()
            println("${f(n)}")
        }
    } catch (_: Throwable) {}
}
