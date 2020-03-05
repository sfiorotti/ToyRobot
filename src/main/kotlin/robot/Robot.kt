package robot

class Robot(val board: Board) {
    val moves: Array<Movement> = arrayOf<Movement>()

    fun place(move: Movement): Boolean {
        moves
        return true
    }

    fun walk(): Boolean {
        return true
    }
    
    fun turnRight(): Boolean {
        return true
    }

    fun turnLeft(): Boolean {
        return true
    }
}