package cw2037a

fun twice(nums0: List<Int>): Int {
    val nums = nums0.toMutableList()
    val set = nums.toSet()
    var score = 0
    for (n in set) {
        var indices = mutableListOf<Int>()
        nums.forEachIndexed { idx, it ->
            if (it == n) { indices.add(idx) }
        }
        while (indices.size > 1) {
            val (i0, i1) = indices
            nums[i0] = 0
            nums[i1] = 0
            score += 1
            indices = indices.drop(2).toMutableList()
        }
    }
    return score
}

fun readStr() = readln()
fun readInt() = readStr().toInt()
fun readStrings() = readStr().split(" ")
fun readInts() = readStrings().map { it.toInt() }

fun main() {
    try {
        val testCases: Int = readInt()
        for (tc in 1..testCases) {
            val n: Int = readInt()
            val nums = readInts()
            val score = twice(nums)
            println("$score")
        }
    } catch (_: Throwable) {}
}
