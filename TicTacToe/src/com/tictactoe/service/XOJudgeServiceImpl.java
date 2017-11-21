package com.tictactoe.service;

public class XOJudgeServiceImpl implements XOJudgeService {

	public static final int BOARD_SIZE = 9;
	private char[] board = new char[BOARD_SIZE];;

	/**
	 * setValue() method is used to set value on board
	 */
	@Override
	public boolean setValueOnBoard(char value, Integer location) {
		board[location] = value;
		return true;
	}

	/**
	 * playerWon() method is used to determine winner
	 */
	@Override
	public boolean playerWon(char value) {

		// Horizontal Check
		if (board[0] == value && board[1] == value && board[2] == value
				|| board[3] == value && board[4] == value && board[5] == value
				|| board[6] == value && board[7] == value && board[8] == value) {
			return true;
		}

		// Vertical Check
		if (board[0] == value && board[3] == value && board[6] == value
				|| board[1] == value && board[4] == value && board[7] == value
				|| board[2] == value && board[5] == value && board[8] == value) {
			return true;
		}

		// Diagonal Check
		if (board[0] == value && board[4] == value && board[8] == value
				|| board[2] == value && board[4] == value && board[6] == value) {
			return true;
		}

		return false;

	}

}
