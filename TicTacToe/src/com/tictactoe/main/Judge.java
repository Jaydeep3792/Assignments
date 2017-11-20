package com.tictactoe.main;

import java.util.List;

public interface Judge {

	/**
	 * The method public String judge(List<Integer> history) accepts a List of
	 * Integers and returns the game result in String format
	 *
	 */
	public String judge(List<Integer> history);

}
