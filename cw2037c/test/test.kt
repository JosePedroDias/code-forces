import kotlin.test.Test
import kotlin.test.assertEquals

class Tests {
    @Test fun primo() {
        assertEquals("-1", primogen(2))
        assertEquals("-1", primogen(3))
        assertEquals("-1", primogen(4))
        assertEquals("2 4 5 1 3", primogen(5))
        assertEquals("2 6 4 5 1 3", primogen(6))
        assertEquals("2 6 8 10 12 14 16 18 20 4 5 1 3 7 9 11 13 15 17 19", primogen(20))
    }
}
