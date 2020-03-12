package robot

import kotlin.test.Test
import kotlin.test.*

class RobotTest {
    private val board = Board(5, 5)
    private val robot = Robot(board)

    @Test fun `should movements is null`() {
        assertEquals(0, robot.moves.size)
    }

    @Test fun `should increment movements count`(){
        val movement = Movement(2, 1, "NORTH")
        robot.place(movement)

        assertEquals(1, robot.moves.size)
    }

    @Test fun `should change position after walk`(){
        val movement = Movement(2, 1, "NORTH")
        robot.place(movement)

        assertEquals(2, robot.walk().y)
        assertEquals(2, robot.moves.size)
    }

    @Test fun `should turnRight return guidance`() {
        val movement = Movement(2, 1, "NORTH")
        robot.place(movement)

        assertEquals("EAST", robot.turnRight().guidance)
        assertEquals(2, robot.moves.size)
    }

    @Test fun `should turnLeft return true`() {
        assertTrue(robot.turnLeft())
    }
}