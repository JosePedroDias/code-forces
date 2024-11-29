import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class Tests {
    @Test fun c3() {
        assertEquals(
            listOf(
                Pair(0, 1),
                Pair(0, 2),
                Pair(1, 2),
            ),
            comb2(3).toList()
        )
    }

    @Test fun pn() {
        assertEquals(1, pow2(0))
        assertEquals(2, pow2(1))
        assertEquals(4, pow2(2))
        assertEquals(8, pow2(3))
    }

    @Test fun horno() {
        assertEquals(
            listOf(
                listOf(false, false),
                listOf(true, false),
                listOf(false, true),
                listOf(true, true),

            ),
            hasOrNo(2).toList()
        )
    }

    @Test fun tEdges() {
        assertContentEquals(
            setOf<Edge>(
                Edge(0, 1),
                Edge(1, 2),
                Edge(0, 3),
                Edge(1, 3),
                Edge(0, 4),
                Edge(1, 4),
                Edge(2, 4),
                Edge(3, 4),
            ).asIterable(),
            computeEdges(listOf(2, 6, 3, 4, 6)).asIterable()
        )
    }

    @Test fun setContainsEdge() {
        val s = setOf(
            Edge(2, 4),
            Edge(3, 7),
        )
        assertEquals(true, s.contains(Edge(2, 4)))
        assertEquals(false, s.contains(Edge(1, 4)))
    }

    @Test fun np() {
        assertEquals(5, numPaths(5, listOf(2, 6, 3, 4, 6)))
    }
}
