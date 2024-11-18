package org

import org.cw1157a.numReachable

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
