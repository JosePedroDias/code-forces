package zp

import kotlin.test.Test
import kotlin.test.assertEquals

class Tests {
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

    @Test fun perms2() {
        assertEquals(listOf(
            listOf(1, 2, 3),
            listOf(1, 3, 2),
            listOf(2, 1, 3),
            listOf(2, 3, 1),
            listOf(3, 1, 2),
            listOf(3, 2, 1)
        ), permutationSeq(3).toList()
        )
    }
}
