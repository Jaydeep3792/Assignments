package com.tictactoe.service;

public interface XOJudgeService {

	public void play(int number, char[][] board, char palyer);

	public  boolean checkVictory(char[][] board, char player);
	
	public  boolean checkDraw(char palyerX, char palyerO, char[][] board);
}
