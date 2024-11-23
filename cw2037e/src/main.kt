private fun readStr() = readln()
fun readInt() = readStr().toInt()

private fun write(s: String) {
    println(s)
    System.out.flush()
}

fun writeQuery(l: Int, r: Int) {
    write("? $l $r")
}

fun writeImp() {
    write("IMPOSSIBLE")
}

fun writeAnswer(answer: BooleanArray) {
    val answer2 = answer.map { if (it) 1 else 0 }
    write("! ${answer2.joinToString("")}")
}

fun computeCandidates(n: Int): List<BooleanArray> {
    // TODO
    return emptyList()
}

//fun subAnswer()

fun main() {
    val answers = mutableMapOf<Pair<Int, Int>, Int>()
    var l = 0
    var r = 0

    l = 1
    r = 4
    writeQuery(l, r)
    answers[Pair(l, r)] = readInt()

    l = 2
    r = 3
    writeQuery(l, r)
    answers[Pair(l, r)] = readInt()

    //writeImp()

    val ans = BooleanArray(4)
    ans[1] = true
    writeAnswer(ans)
}
