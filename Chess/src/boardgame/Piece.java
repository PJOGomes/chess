package boardgame;

public class Piece {
	protected Position position;
	private Board board;
	
	//Constructor
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	//Only the classes of this package can access the board
	protected Board getBoard() {
		return board;
	}
	
}
