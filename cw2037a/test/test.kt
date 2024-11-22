import kotlin.test.Test
import kotlin.test.assertEquals

class Tests {
    @Test fun go() {
        assertEquals(0, twice(listOf(1)))
        assertEquals(1, twice(listOf(2, 2)))
        assertEquals(0, twice(listOf(1, 2)))
        assertEquals(3, twice(listOf(1, 2, 3, 1, 2, 3)))
    }

    @Test fun go2() {
        assertEquals(0, twice(listOf(1)), "#1")
        assertEquals(1, twice(listOf(1, 1)), "#2")
        assertEquals(0, twice(listOf(1, 2)), "#3")
        assertEquals(0, twice(listOf(2, 1)), "#4")
        assertEquals(1, twice(listOf(2, 2)), "#5")
        assertEquals(1, twice(listOf(1, 1, 1)), "#6")
        assertEquals(1, twice(listOf(1, 1, 2)), "#7")
        assertEquals(1, twice(listOf(1, 1, 3)), "#8")
    }
}
