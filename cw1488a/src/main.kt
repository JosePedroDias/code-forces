import kotlin.math.pow

fun zeroToY(x: Int, y: Int): Int {
    var i = 0
    var kPrev = mutableSetOf(0)

    while (true) {
        ++i
        val k = mutableSetOf<Int>()
        for (kP in kPrev) {
            // op 1
            var kN = kP + 1
            if (kN == y) {
                return i
            } else if (kN < y) {
                k.add(kN)
            }

            // op2
            var p = 0
            while (true) {
                kN = kP + x * (10.0).pow(p).toInt()
                if (kN == y) {
                    return i
                } else if (kN < y) {
                    k.add(kN)
                    ++p
                } else {
                    break
                }
            }

            kPrev = k
        }
    }
}

fun readStr() = readln()
fun readInt() = readStr().toInt()
fun readStrings() = readStr().split(" ")
fun readInts() = readStrings().map { it.toInt() }

fun main() {
    try {
        val testCases = readInt()
        for (tc in 1..testCases) {
            val (x, y) = readInts()
            println(zeroToY(x, y))
        }
    } catch (_: Throwable) {}
}
