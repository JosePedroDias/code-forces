package org.cw2037d

import org.readInt

fun main() {
    try {
        val testCases = readInt()
        for (tc in 1..testCases) {
            val n = readInt()
            println("${f(n)}")
        }
    } catch (_: Throwable) {}
}
