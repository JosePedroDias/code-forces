package org

fun readStr() = readln()

fun readInt() = readStr().toInt()

fun readStrings() = readStr().split(" ")

fun readInts() = readStrings().map { it.toInt() }

////

fun combination2(n: Int): List<Pair<Int, Int>> {
    val res = mutableListOf<Pair<Int, Int>>()
    for (j in 1 until n) {
        for (i in 0 until j) {
            if (i != j) {
                res.add(Pair(i, j))
            }
        }
    }
    return res
}