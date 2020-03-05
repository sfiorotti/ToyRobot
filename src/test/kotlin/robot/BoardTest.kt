package robot

import kotlin.test.Test
import kotlin.test.*

class BoardTest {
    private val board = Board(5, 5)

    @Test fun `should be on board bound`() {
        assertTrue(board.isBound(4, 4))
    }

    @Test fun `should not be on board bound`() {
        assertFalse(board.isBound(4, 5))
        assertFalse(board.isBound(5, 4))
        assertFalse(board.isBound(-1, 4))
    }

}