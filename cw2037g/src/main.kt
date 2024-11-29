fun readStr() = readln()
fun readInt() = readStr().toInt()
fun readStrings() = readStr().split(" ")
fun readInts() = readStrings().map { it.toInt() }

fun gcd(a_: Int, b_: Int): Int {
    var a = a_
    var b = b_
    while (b != 0) {
        val temp = b
        b = a % b
        a = temp
    }
    return a
}


class Edge(a: Int, b: Int) {
    val smaller: Int;
    val bigger: Int;

    init {
        if (a > b) {
            smaller = b
            bigger = a
        } else {
            smaller = a
            bigger = b
        }
    }

    fun isValid(): Boolean {
        return gcd(bigger, smaller) != 1
    }

    override fun toString(): String {
        return "<$smaller,$bigger>";
    }

    override fun equals(other: Any?): Boolean {
        if (other is Edge) {
            return other.smaller == smaller && other.bigger == bigger
        }
        return false
    }

    override fun hashCode(): Int {
        return smaller + bigger * 100000
    }
}

fun comb2(n: Int): Sequence<Pair<Int, Int>> = sequence {
    for (j in 1 until n) {
        for (i in 0 until j) {
            yield(Pair(i, j))
        }
    }
}

fun pow2(n_: Int): Int {
    var n = n_
    var res = 1
    while (n > 0) {
        res *= 2
        --n
    }
    return res
}

fun hasOrNo(n: Int): Sequence<List<Boolean>> = sequence {
    for (i in 0 until pow2(n)) {
        val l = mutableListOf<Boolean>()
        for (j in 0 until n) {
            l.add((i shr j) and 1 == 1)
        }
        yield(l)
    }
}

fun computeEdges(attractiveness: List<Int>): MutableSet<Edge> {
    val connected = mutableSetOf<Edge>()
    for ((iA, iB) in comb2(attractiveness.size)) {
        val attrA = attractiveness[iA]
        val attrB = attractiveness[iB]
        if (Edge(attrA, attrB).isValid()) {
            connected.add(Edge(iA, iB))
        }
    }
    return connected
}

fun numPaths(numCities: Int, attractiveness: List<Int>): Int {
    val connected = computeEdges(attractiveness)
    //println("connected: $connected")

    var pathsFound = 0
    for (has in hasOrNo(numCities - 2)) {
        val l = mutableListOf<Int>()
        l.add(0)
        has.forEachIndexed { idx, b ->
            if (b) {
                l.add(idx + 1)
            }
        }
        l.add(numCities-1)
        //println("_l: $l")

        if (l.zipWithNext().all {
                //(a, b) -> val v = connected.contains(Edge(a, b)); println("$a,$b > $v"); v
                    (a, b) -> connected.contains(Edge(a, b))
            }) {
            //val l2 = l.map { it + 1}
            //println("l: $l2")
            ++pathsFound
        }
    }
    return pathsFound
}

fun main() {
    try {
        val numCities = readInt()
        val attractiveness = readInts()
        println(numPaths(numCities, attractiveness))
    } catch (_: Throwable) {}
}
