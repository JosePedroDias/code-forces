package org.cw2037a

import org.readInt
import org.readInts

fun main() {
    try {
        val testCases = readInt()
        //println("testCases: $testCases")
        for (tc in 0..testCases) {
            val n = readInt()
            //println("n: $n")
            val nums = readInts()
            //println("nums: $nums")
            val score = twice(nums)
            println("$score")
            //println("---")
        }
    } catch (_: Throwable) {}
}
