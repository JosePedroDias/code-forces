package org.cw2037b

import org.readInt
import org.readInts

fun main() {
    try {
        val testCases = readInt()
        //println("testCases: $testCases")
        for (tc in 0..testCases) {
            val k = readInt()
            println("k: $k")
            val nums = readInts()
            println("nums: $nums")
            val (a, b) = interceptedInputs(k, nums)
            println("-> $a $b")
            println("---")
        }
    } catch (_: Throwable) {}
}
