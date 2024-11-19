package org.cw2037b

fun interceptedInputs(k: Int, nums: List<Int>): Pair<Int, Int> {
    val numCells = k - 2
    //println("numCells: $numCells")
    val uniqueValues = nums.toSet()
    //println("uniqueValues: $uniqueValues")
    for (i in 1..numCells) {
        val a = i
        val b = numCells / i
        //println("* $i ~> $a $b *")
        if (numCells == a * b && uniqueValues.contains(a) && uniqueValues.contains(b)) {
            if (a != b || nums.filter { it == a }.size > 1) {
                return Pair(a, b)
            }
        }
    }
    throw Error("never happens")
}
