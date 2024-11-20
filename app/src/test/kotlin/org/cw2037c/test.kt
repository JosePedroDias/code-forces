package org.cw2037c

import org.permutations
import kotlin.test.Test
import kotlin.test.assertEquals

class Tests {
    @Test fun prime() {
        assertEquals(true, isPrime(2))
        assertEquals(false, isPrime(4))
    }

    @Test fun perms() {
        assertEquals(listOf(
            listOf(1, 2, 3),
            listOf(1, 3, 2),
            listOf(2, 1, 3),
            listOf(2, 3, 1),
            listOf(3, 1, 2),
            listOf(3, 2, 1)
        ), permutations(3))
    }

    @Test fun primo() {
        assertEquals("-1", primogen(3))
        assertEquals("1 3 5 4 2 6 8 7", primogen(8)) // 1 8 7 3 6 2 4 5
    }
}
