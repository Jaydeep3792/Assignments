package com.tictactoe.main;

import java.util.List;
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

		XOJudgeService xoJudgeService = new XOJudgeServiceImpl();
		int arrayIndex = 0;
		int indexX = 0;
		int indexO = 0;

		// Translating history to board
		while (arrayIndex <= historyList.size() - 1) {
			indexX = arrayIndex;

			if (indexX < historyList.size()) {
				xoJudgeService.setValueOnBoard(TicTacToeConstants.PlayerX, Integer.valueOf(historyList.get(indexX)));
			}

			indexO = arrayIndex + 1;

			if (indexO < historyList.size()) {
				xoJudgeService.setValueOnBoard(TicTacToeConstants.PlayerO, Integer.valueOf(historyList.get(indexO)));
			}

			arrayIndex = arrayIndex + 2;

		}

		// Check for Winner
		boolean xWin = xoJudgeService.playerWon(TicTacToeConstants.PlayerX);
		boolean oWin = xoJudgeService.playerWon(TicTacToeConstants.PlayerO);

		if (xWin) {
			return TicTacToeConstants.PLAYER_X_WIN;
		} else if (oWin) {
			return TicTacToeConstants.PLAYER_O_WIN;
		} else {
			return TicTacToeConstants.NO_WINNER;
		}

	}

}
