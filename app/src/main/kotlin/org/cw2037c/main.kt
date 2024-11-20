package org.cw2037c

import org.permutations
import org.readInt

fun main() {
    try {
        val testCases = readInt()
        println("testCases: $testCases")
        for (tc in 0..testCases) {
            val n = readInt()
            println("---\nn: $n")
            println("> ${primogen(n)}")
        }
    } catch (_: Throwable) {}
}
