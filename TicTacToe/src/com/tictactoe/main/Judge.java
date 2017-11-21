package com.tictactoe.main;

import java.util.List;

/*
 * Create class called XOJudge implementing the Judge interface which determines
 * the outcome of a game of O's and X's.
 * https://en.wikipedia.org/wiki/Tic-tac-toe
 *
 * The method public String judge(List<Integer> history) accepts a List of
 * Integers representing the move history of both players in order as zero
 * indexed offsets into the game board. The board squares are numbered as
 * follows:
 *
 *     012
 *     345
 *     678
 *
 * The X player makes the first move.
 * The method should return a String, either "X_WIN", "O_WIN" or "NO_WINNER"
 * to indicate the outcome of the game.
 *
 * Input is guaranteed to represent a valid Os and Xs game.
 *
 * For example: 
 *   [ 0, 4, 1, 3, 2 ] = X_WINS
 *   [ 4, 0, 2, 6, 3, 5, 7, 1, 8 ] = NO_WINNER
 *   [ 0, 6, 1, 2, 3, 8, 5, 7 ] = O_WINS
 *
 * Please include unit tests.
 *
 */
public interface Judge {

	/**
	 * The method public String judge(List<Integer> history) accepts a List of
	 * Integers and returns the game result in String format
	 *
	 */
	public String judge(List<Integer> history);

}
