package robot

import kotlin.test.Test
import kotlin.test.*

class RobotTest {
    private val board = Board(5, 5)
    private val robot = Robot(board)

    @Test fun `should movements is null`() {
        assertEquals(robot.moves.size, 0)
    }

    @Test fun `should walk return true`() {
        assertTrue(robot.walk())
    }

    @Test fun `should turnRight return true`() {
        assertTrue(robot.turnRight())
    }

    @Test fun `should turnLeft return true`() {
        assertTrue(robot.turnLeft())
    }
}