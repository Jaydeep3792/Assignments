package com.tictactoe.main;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;

import com.tictactoe.service.XOJudgeService;
import com.tictactoe.service.XOJudgeServiceImpl;
import com.tictactoe.utils.TicTacToeConstants;

public class XOJudge implements Judge {

	/**
	 * The method public String judge(List<Integer> history) accepts a List of
	 * Integers representing the move history of both players in order as zero
	 * indexed offsets into the game board.
	 */

	@Override
	public String judge(List<Integer> historyList) {

		char palyerX = 'x';
		char palyerO = 'o';
		boolean gameOver = false;
		char[][] board = new char[3][3];
		int listIndex = 0;
		int indexX = 0;
		int indexO = 0;
		XOJudgeService xoJudgeService = new XOJudgeServiceImpl();
		System.out.println("Validating and Processing  data" + historyList);

		// Validating Input values from list
		if (CollectionUtils.isEmpty(historyList)) {
			return TicTacToeConstants.INVALID_INPUT;
		} else {
			for (Integer value : historyList) {
				if (value == null || (!(value >= 0 && value <= 8))) {
					return TicTacToeConstants.INVALID_INPUT;
				}
			}
		}

		
		// Game loop
		while (gameOver == false && listIndex <= historyList.size()) {
			indexX = listIndex;

			if (indexX < historyList.size()) {
				// Player X turn
				xoJudgeService.play(historyList.get(indexX), board, palyerX);
				// Check X victory
				if (xoJudgeService.checkVictory(board, palyerX) == true) {
					gameOver = true;
					return TicTacToeConstants.PLAYER_X_WIN;
				}
			}

			indexO = listIndex + 1;
			if (indexO < historyList.size()) {
				// Player O turn
				xoJudgeService.play(historyList.get(indexO), board, palyerO);
				// Check O victory
				if (xoJudgeService.checkVictory(board, palyerO) == true) {
					gameOver = true;
					return TicTacToeConstants.PLAYER_O_WIN;
				}
			}

			// increase list index by 2
			listIndex = listIndex + 2;

			// Check for draw
			if (xoJudgeService.checkDraw(palyerX, palyerO, board) == true) {
				return TicTacToeConstants.NO_WINNER;
			}

		}
		return TicTacToeConstants.UNKNOWN_RESULT;
	}

}
