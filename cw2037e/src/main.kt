private fun readStr() = readln()
fun readInt() = readStr().toInt()
fun readAnswerInt(): Int {
    val a = readInt()
    val tmp = readStr()
    //dbg("tmp: <$tmp>")
    return a
}

private fun write(s: String) {
    println(s)
    println()
    System.out.flush()
}

fun writeQuery(l: Int, r: Int) {
    write("? $l $r")
}

fun writeImp() {
    write("! IMPOSSIBLE")
}

fun writeAnswer(answer: BooleanArray) {
    val answer2 = answer.map { if (it) 1 else 0 }
    write("! ${answer2.joinToString("")}")
}

fun dbg(s: String) {
    //System.err.println(s)
}

fun computeCandidates(n: Int): List<BooleanArray> {
    // TODO
    return emptyList()
}

data class RunData(
    val n: Int,
    val answers: Map<Pair<Int, Int>, Int> = kotlin.collections.mutableMapOf()
)
//fun subAnswer()

fun main() {
    try {
        val testCases = readInt()
        dbg("testCases: $testCases")
        for (tc in 1..testCases) {
            val n = readAnswerInt()
            val d = RunData(n)
            dbg("tc #: $tc, n: $n")
            val answers = mutableMapOf<Pair<Int, Int>, Int>()
            var i = 0
            while (true) {
                if (tc == 1) {
                    if (i == 0) {
                        val l = 1
                        val r = 5
                        writeQuery(l, r)
                        val answer = readAnswerInt()
                        dbg("got $answer")
                        answers[Pair(l, r)] = answer
                    } else if (i == 1) {
                        val l = 2
                        val r = 4
                        writeQuery(l, r)
                        val answer = readAnswerInt()
                        dbg("got $answer")
                        answers[Pair(l, r)] = answer
                    } else if (i == 2) {
                        val l = 4
                        val r = 5
                        writeQuery(l, r)
                        val answer = readAnswerInt()
                        dbg("got $answer")
                        answers[Pair(l, r)] = answer
                    } else if (i == 3) {
                        val l = 3
                        val r = 5
                        writeQuery(l, r)
                        val answer = readAnswerInt()
                        dbg("got $answer")
                        answers[Pair(l, r)] = answer
                    } else if (i == 4) {
                        val guess = BooleanArray(n)
                        guess[1] = true
                        guess[4] = true
                        writeAnswer(guess)
                        dbg("answers: $answers")
                        break
                    } else if (i == 10) {
                        writeImp()
                        dbg("answers: $answers")
                        break
                    }
                } else if (tc == 2) {
                    if (i == 0) {
                        val l = 1
                        val r = 2
                        writeQuery(l, r)
                        val answer = readAnswerInt()
                        dbg("got $answer")
                        answers[Pair(l, r)] = answer
                    } else if (i == 1) {
                        writeImp()
                        dbg("answers: $answers")
                        break
                    }
                }
                ++i
            }
        }
        dbg("all done")
    } catch (err: Throwable) {
        dbg("oops")
        dbg("$err")
    }
}
