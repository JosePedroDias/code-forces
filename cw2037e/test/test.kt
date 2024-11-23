import kotlin.test.Test
import kotlin.test.assertEquals

class Tests {
    @Test fun candidates() {
        val a = BooleanArray(2)

        val b = BooleanArray(2)
        b[0] = true

        val c = BooleanArray(2)
        b[1] = true

        val d = BooleanArray(2)
        b[0] = true
        b[1] = true

        assertEquals(listOf(a, b, c, d), computeCandidates(2))
    }
}
