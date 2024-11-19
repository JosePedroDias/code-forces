package org.cw1157a

import org.readInt

fun main() {
    while (true) {
        try {
            val n = readInt()
            println(numReachable(n))
        } catch (_: Throwable) {
            return
        }
    }
}
