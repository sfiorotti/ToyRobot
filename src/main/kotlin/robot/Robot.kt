package robot

class Robot(val board: Board) {
    var moves: MutableList<Movement> = mutableListOf()

    fun place(move: Movement) {
        this.moves.add(move)
    }

    fun walk(): Movement {
        var lastMove = lastMove()
        var newYPositon = lastMove.y + 1
        var newMove = Movement(lastMove.x, newYPositon, lastMove.guidance)
        this.moves.add(newMove)

        return lastMove()
    }

    private fun lastMove(): Movement {
        return this.moves.last()
    }

    fun turnRight(): Movement {
        var lastMove = lastMove()
        var newGuidance = guidance(lastMove.guidance, 1)
        var newMove = Movement(lastMove.x, lastMove.y, newGuidance)
        this.moves.add(newMove)

        return lastMove()
    }

    private fun guidance(guidanceActual: String, orientation: Int): String {
        // if (guidanceActual == "NORTH") {
        //     return "EAST"
        // } else if (guidanceActual == "EAST") {
        //     return "SOUTH"
        // } else if (guidanceActual == "SOUTH") {
        //     return "WEST"
        // } else {
        //     return "NORTH"
        // }

        val guidance = listOf<String>("NORTH", "EAST", "SOUTH", "WEST")
        val guidanceIndex = guidance.indexOf(guidanceActual)
        val next = guidanceIndex + orientation % guidance.size
        return guidance[next]
    }

    fun turnLeft(): Boolean {
        return true
    }
}