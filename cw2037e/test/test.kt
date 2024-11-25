import kotlin.test.Test
import kotlin.test.assertEquals

class Tests {
    @Test fun candidates2() {
        val expect = listOf(
            boolArrFromList(listOf(0)),
            boolArrFromList(listOf(1)),
        )
        val got = computeCandidates(1)
        assertEquals(2, got.size)
        expect.forEach {
            el -> assertEquals(true, got.any { el.contentEquals(it) })
        }
    }

    @Test fun candidates3() {
        val expect = listOf(
            boolArrFromList(listOf(0, 0)),
            boolArrFromList(listOf(0, 1)),
            boolArrFromList(listOf(1, 0)),
            boolArrFromList(listOf(1, 1)),
        )
        val got = computeCandidates(2)
        assertEquals(4, got.size)
        expect.forEach {
            el -> assertEquals(true, got.any { el.contentEquals(it) })
        }
    }

    @Test fun c01s() {
        assertEquals(0, count01s(boolArrFromList(listOf(0))))
        assertEquals(0, count01s(boolArrFromList(listOf(0, 0, 0, 0))))
        assertEquals(0, count01s(boolArrFromList(listOf(1, 0, 0, 0))))
        assertEquals(1, count01s(boolArrFromList(listOf(0, 1, 0, 0))))
        assertEquals(1, count01s(boolArrFromList(listOf(0, 1, 1, 0))))
        assertEquals(2, count01s(boolArrFromList(listOf(0, 1, 0, 1))))
    }
}
