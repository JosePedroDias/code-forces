package org.cw1157a

import kotlin.test.Test
import kotlin.test.assertEquals

class Tests {
    @Test fun a1157r() {
        assertEquals(6, reachable(599))
        assertEquals(8, reachable(7))
        assertEquals(1, reachable(9))
        assertEquals(101, reachable(10099))
    }
    
    @Test fun a1157nr() {
        assertEquals(20, numReachable(1098))
        assertEquals(19, numReachable(10))
    }
}
