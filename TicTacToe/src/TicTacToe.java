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
		return false;
	}
}
//public static class MyList {
//String[] store = new String[10];
//int size = 0;
//// adds string to the list
//public void add (String s) {
//	if (s == null) {
//		return;
//	}
//	if (size < store.length) {
//		store[size + 1] = s;
//	} else {
//	// make a new array one bigger than the old array
//	String[] resize = new String[size*2];
//	// add the values from the old array into the new one
//	for (int i = 0; i < resize.length - 1; i++) {
//		resize[i] = store[i];
//	}
//	// make the last element the new string we are adding
//	resize[size + 1] = s;
//	// point store to the new array in memory
//	store = resize;
//	}
//	size++;
//}
//
//// returns the size of the list
//public int size() {
//	return size;
//}
//
//// gets an element of the list
//public String get(int p ) {
//	if (0 < p < size -1) {
//		return null;
//	}
//	return store[p];
//}
//
//// removes an element from the list
//public void remove (int i) {
//	// make a new array with size one less
//	String[] buff = new String[size - 1];
//	if (0 <= i && i < size) {
//		// walk through the array and copy, skipping over the index to remove
//		for (int q = 0; q < size; q++) {
//			if (q != i) {
//				buff[q] = store[q];
//			}
//		}
//	}
//	// reassign the array
//	store = buff;
//	size--;
//}