package org

fun readStr() = readln()

fun readInt() = readStr().toInt()

fun readStrings() = readStr().split(" ")

fun readInts() = readStrings().map { it.toInt() }

////

fun comb2(n: Int): List<Pair<Int, Int>> {
    val res = mutableListOf<Pair<Int, Int>>()
    for (j in 1 until n) {
        for (i in 0 until j) {
            res.add(Pair(i, j))
        }
    }
    return res
}

private fun <T> permutations0(list: List<T>): List<List<T>> {
    if (list.isEmpty()) return listOf(emptyList())
    val result = mutableListOf<List<T>>()
    for (i in list.indices) {
        val item = list[i]
        val remaining = list.take(i) + list.drop(i + 1)
        for (perm in permutations0(remaining)) {
            result.add(listOf(item) + perm)
        }
    }
    return result
}

fun permutations(n: Int): List<List<Int>> {
    val l = List(n) { it + 1 }
    return permutations0(l)
}
