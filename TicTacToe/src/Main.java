import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int playerStarting = rand.nextInt(2);

		char board[][] = { 
				{ ' ', '|', ' ', '|', ' ' }, 
				{ '-', '+', '-', '+', '-' }, 
				{ ' ', '|', ' ', '|', ' ' },
				{ '-', '+', '-', '+', '-' }, 
				{ ' ', '|', ' ', '|', ' ' } };

		Scanner sc = new Scanner(System.in);

		boolean gameRunning = true;
		while (gameRunning) {

			printBoard(board);

			System.out.println("input 1-9 to make a move: ");

			int playerMove = sc.nextInt();

			boolean result = checkIfMoveIsOccupied(playerMove, board);

			while (!result) {
				System.out.println("Invalid move, try again");
				playerMove = sc.nextInt();
				result = checkIfMoveIsOccupied(playerMove, board);
			}

			char symbol = ' ';
			if (playerStarting % 2 == 1) {
				symbol = 'X';
			} else {
				symbol = 'O';
			}

			switch (playerMove) {

			case 1:
				board[0][0] = symbol;
				break;
			case 2:

				board[0][2] = symbol;
				break;
			case 3:

				board[0][4] = symbol;
				break;
			case 4:

				board[2][0] = symbol;
				break;
			case 5:

				board[2][2] = symbol;
				break;
			case 6:

				board[2][4] = symbol;
				break;
			case 7:

				board[4][0] = symbol;
				break;
			case 8:

				board[4][2] = symbol;
				break;
			case 9:

				board[4][4] = symbol;
				break;

			default:
				break;

			}

			playerStarting++;
			String winner = " ";

			if (board[0][0] == 'X' && board[0][2] == 'X' && board[0][4] == 'X')
				winner = "X";
			
			if (board[2][0] == 'X' && board[2][2] == 'X' && board[2][4] == 'X')
				winner = "X";
			
			if (board[4][0] == 'X' && board[4][2] == 'X' && board[4][4] == 'X')
				winner = "X";
			
			if (board[0][0] == 'X' && board[2][0] == 'X' && board[4][0] == 'X') 
				winner = "X";
			
			if (board[0][2] == 'X' && board[2][2] == 'X' && board[4][2] == 'X')
				winner = "X";
			
			if (board[0][4] == 'X' && board[2][4] == 'X' && board[4][4] == 'X')
				winner = "X";
			
			if (board[0][0] == 'X' && board[2][2] == 'X' && board[4][4] == 'X')
				winner = "X";
			
			if (board[4][0] == 'X' && board[2][2] == 'X' && board[0][4] == 'X')
				winner = "X";
			

			if (board[0][0] == 'O' && board[0][2] == 'O' && board[0][4] == 'O')
				winner = "O";
			
			if (board[2][0] == 'O' && board[2][2] == 'O' && board[2][4] == 'O')
				winner = "O";
			
			if (board[4][0] == 'O' && board[4][2] == 'O' && board[4][4] == 'O')
				winner = "O";
			
			if (board[0][0] == 'O' && board[2][0] == 'O' && board[4][0] == 'O')
				winner = "O";
			
			if (board[0][2] == 'O' && board[2][2] == 'O' && board[4][2] == 'O')
				winner = "O";
			
			if (board[0][4] == 'O' && board[2][4] == 'O' && board[4][4] == 'O')
				winner = "O";
			
			if (board[0][0] == 'O' && board[2][2] == 'O' && board[4][4] == 'O')
				winner = "O";
			
			if (board[4][0] == 'O' && board[2][2] == 'O' && board[0][4] == 'O')
				winner = "O";
			

			if (winner.equals("X")) {
				printBoard(board);
				System.out.println("Winner is player: " + winner);
				System.out.println("play again? y/n");
				String playAgain = sc.next();
				if (playAgain.equals("y")) {
					gameRunning = true;
					board[0][0] = ' ';
					board[0][2] = ' ';
					board[0][4] = ' ';
					board[2][0] = ' ';
					board[2][2] = ' ';
					board[2][4] = ' ';
					board[4][0] = ' ';
					board[4][2] = ' ';
					board[4][4] = ' ';

				} else if (playAgain.equals("n")) {
					gameRunning = false;
					System.out.println("thanks for playing");
				}

			} else if (winner.equals("O")) {
				printBoard(board);
				System.out.println("Winner is player: " + winner);
				System.out.println("play again? y/n");
				String playAgain = sc.next();

				if (playAgain.equals("y")) {
					gameRunning = true;
					board[0][0] = ' ';
					board[0][2] = ' ';
					board[0][4] = ' ';
					board[2][0] = ' ';
					board[2][2] = ' ';
					board[2][4] = ' ';
					board[4][0] = ' ';
					board[4][2] = ' ';
					board[4][4] = ' ';

				} else if (playAgain.equals("n")) {
					gameRunning = false;
					System.out.println("thanks for playing");
				}

			} else if (board[0][0] != ' ' && board[0][2] != ' ' && board[0][4] != ' ' && board[2][0] != ' '
					&& board[2][2] != ' ' && board[2][4] != ' ' && board[4][0] != ' ' && board[4][2] != ' '
					&& board[4][4] != ' ') {
				printBoard(board);
				System.out.println("its a tie");
				System.out.println("play again? y/n");
				String playAgain = sc.next();

				if (playAgain.equals("y")) {
					gameRunning = true;
					board[0][0] = ' ';
					board[0][2] = ' ';
					board[0][4] = ' ';
					board[2][0] = ' ';
					board[2][2] = ' ';
					board[2][4] = ' ';
					board[4][0] = ' ';
					board[4][2] = ' ';
					board[4][4] = ' ';

				} else if (playAgain.equals("n")) {
					gameRunning = false;
					System.out.println("thanks for playing");
				}
			}

		}
		sc.close();

	}
	public static void printBoard (char[][] board) {
		for (int i = 0; i < board.length; ++i) {
			for (int j = 0; j < board[i].length; ++j) {
				System.out.print(" " + board[i][j]);

			}
			System.out.print("\n");
		}
	}

	public static boolean checkIfMoveIsOccupied(int move, char[][] board) {

		switch (move) {
		case 1:
			if (board[0][0] == ' ') {
				return true;
			} else {
				return false;
			}
		case 2:
			if (board[0][2] == ' ') {
				return true;
			} else {
				return false;
			}
		case 3:
			if (board[0][4] == ' ') {
				return true;
			} else {
				return false;
			}

		case 4:
			if (board[2][0] == ' ') {
				return true;
			} else {
				return false;
			}
		case 5:
			if (board[2][2] == ' ') {
				return true;
			} else {
				return false;
			}
		case 6:
			if (board[2][4] == ' ') {
				return true;
			} else {
				return false;
			}
		case 7:
			if (board[4][0] == ' ') {
				return true;
			} else {
				return false;
			}
		case 8:
			if (board[4][2] == ' ') {
				return true;
			} else {
				return false;
			}
		case 9:
			if (board[4][4] == ' ') {
				return true;
			} else {
				return false;
			}

		default:
			return false;
		}
	}

}
