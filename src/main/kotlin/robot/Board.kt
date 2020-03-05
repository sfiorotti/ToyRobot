package robot

class Board( val rows: Int, val columns: Int) {
    private val chessBoard: Array<IntArray> = Array(rows) { IntArray(columns) }

    fun isBound(rows: Int, columns: Int): Boolean {
        return (chessBoard.elementAtOrNull(rows)?.elementAtOrNull(columns) != null) 
    }
}