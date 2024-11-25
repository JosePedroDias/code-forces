import kotlin.test.Test
import kotlin.test.assertEquals

class Tests {
    @Test fun z2y() {
        assertEquals(4, zeroToY(2, 7))
        assertEquals(5, zeroToY(3, 42))
        assertEquals(20, zeroToY(25, 1337))
    }
}
