package org.cw2037b

import kotlin.test.Test
import kotlin.test.assertEquals

class Tests {
    @Test fun a() {
        assertEquals(Pair(1, 1), interceptedInputs(3, listOf(1, 1, 2)))
    }
}
