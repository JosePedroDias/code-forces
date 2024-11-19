fun interceptedInputs(k: Int, nums: List<Int>): Pair<Int, Int> {
    val numCells = k - 2
    val uniqueValues = nums.toSet()
    for (i in 1..numCells) {
        val a = i
        val b = numCells / i
        if (numCells == a * b && uniqueValues.contains(a) && uniqueValues.contains(b)) {
            if (a != b || nums.filter { it == a }.size > 1) {
                return Pair(a, b)
            }
        }
    }
    throw Error("never happens")
}

fun readStr() = readln() // string line
fun readInt() = readStr().toInt() // single int
fun readStrings() = readStr().split(" ") // list of strings
fun readInts() = readStrings().map { it.toInt() } // list of ints

fun main() {
    try {
        val testCases = readInt()
        for (tc in 0..testCases) {
            val k = readInt()
            val nums = readInts()
            val (a, b) = interceptedInputs(k, nums)
            println("$a $b")
        }
    } catch (_: Throwable) {}
}

