package org.cw1157a

fun numReachable(n_: Int): Int {
    var n = n_
    val unique = mutableSetOf<Int>()
    while (unique.add(n)) n = reachable(n)
    return unique.size
}

fun reachable(n: Int): Int {
    var o = n + 1
    while (o % 10 == 0) {
        o = o / 10
    }
    return o
}