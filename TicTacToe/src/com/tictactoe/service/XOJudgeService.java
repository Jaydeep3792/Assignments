package com.tictactoe.service;

public interface XOJudgeService {

	/**
	 * setValue() method is used to set value on board
	 * 
	 * @Input Player and integer location
	 * 
	 * @return boolean value
	 */
	public boolean setValueOnBoard(char player, Integer location);

	/**
	 * playerWon() method is used to determine winner
	 * 
	 * @Input Player
	 * 
	 * @return boolean value
	 */
	public boolean playerWon(char player);
}
