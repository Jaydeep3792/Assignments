package com.tictactoe.service;

public class XOJudgeServiceImpl implements XOJudgeService {

	/**
	 * Play method for respective player will allocate value in the two dimensional
	 * array which is board here.
	 */
	public  void play(int number, char[][] board, char palyer) {
		int pos1 = 0;
		int pos2 = 0;
		if (number <= 2) {
			pos1 = 0;
			pos2 = number;
		} else if (number >= 3 && number <= 5) {
			pos1 = 1;
			pos2 = number - 3;
		} else if (number >= 6 && number <= 8) {
			pos1 = 2;
			pos2 = number - 6;
		}
		board[pos1][pos2] = palyer;
	}

	/**
	 * checkVictory method will check player allocated value vertically,
	 * horizontally and diagonally.
	 */
	public  boolean checkVictory(char[][] board, char player) {
		// Checks player row victory
		for (int i = 0; i < board.length; i++) {
			if ((board[i][0] == player) && (board[i][1] == player) && (board[i][2] == player)) {
				return true;
			}
		}
		// Checks Player verticle victory
		for (int j = 0; j < board.length; j++) {
			if ((board[0][j] == player) && (board[1][j] == player) && (board[2][j] == player)) {
				return true;
			}
		}
		// Checks Player diagonal victory(left to right)
		if ((board[0][0] == player) && (board[1][1] == player) && (board[2][2] == player)) {
			return true;
		}
		// Checks Player diagonal victory(right to left)
		if ((board[0][2] == player) && (board[1][1] == player) && (board[2][0] == player)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * checkDraw method will count allocations for each player if allocations are 9
	 * and there is no victory means match draw.
	 */
	public  boolean checkDraw(char palyerX, char palyerO, char[][] board) {
		int count = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == palyerX || board[i][j] == palyerO) {
					count++;
					if (count == 9) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
