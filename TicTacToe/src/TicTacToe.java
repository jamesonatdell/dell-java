import java.util.*;

public class TicTacToe {
	// making the board a char array to accommodate X and O
	static char[][] board = new char[3][3];
	// player tracker
	static char player = 'X';
	static boolean gameOver = false;
	static boolean staleMate = false;
	public static void main (String[] args) {
		
		while (!gameOver) {
			printBoard();
		}
		boardToString();
		if (staleMate) {
			System.out.println("It's a tie!");
		} else {
			player = (player == 'X') ? 'O' : 'X';
			System.out.println(player + " won!!!");
		}
	}
	
	private static boolean move (int x, int y) {
		if (board[x][y] == 0) {
			
			board[x][y] = player;
			// ternary operator = if player == 'X' is true, assign it to O, otherwise assign it to X
			player = (player == 'X') ? 'O' : 'X';
			if (checkWin()) {
				return true;
			}
		}
		return false;
	}
	
	private static void printBoard() {

		Scanner scn = new Scanner(System.in);
		boardToString();
		System.out.println("Please input your move as X, Y");
		String toParse = scn.nextLine();
		
		String[] moves = toParse.split(", ");
		gameOver = move(Integer.parseInt(moves[0]), Integer.parseInt(moves[1]));
		
	}
	
	private static void boardToString() {
		String toPrint = "";
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if ((board[i][j] == 'X') || (board[i][j] == 'O')) {
					toPrint += (board[i][j] + " ");
				} else {
					toPrint += "_ ";
				}
				if (j == 2) {
					toPrint += "\n";
				}
			}
			
		}
		System.out.println(toPrint);
		
	}
	
	private static boolean checkWin() {
		// check across
		if ((board[0][0] == board[0][1] && board[0][1]== board[0][2] && board[0][0] != 0) || 
				(board[1][0] == board[1][1] && board[1][1]== board[1][2] && board[1][0] != 0) || 
				(board[2][0] == board[2][1] && board[2][1]== board[2][2] && board[2][0] != 0)) {
			return true;
		}
		
		// check down
		if ((board[0][0] == board[1][0] && board[1][0]== board[2][0] && board[0][0] != 0) || 
				(board[1][0] == board[1][1] && board[1][1]== board[1][2] && board[1][0] != 0) || 
				(board[2][0] == board[2][1] && board[2][1]== board[2][2] && board[2][0] != 0)) {
			return true;
		}
		
		// check diagonal
		if ((board[0][0] == board[1][1] && board[1][1]== board[2][2] && board[0][0] != 0) || 
				(board[0][2] == board[1][1] && board[1][1]== board[2][0] && board[1][1] != 0) ) {
			return true;
		}
		staleMate = true;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == 0) {
					staleMate = false;
				}
			}
		}
		if (staleMate) {
			return true;
		}
		return false;
	}
}
