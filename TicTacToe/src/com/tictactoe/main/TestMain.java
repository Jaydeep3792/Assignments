package com.tictactoe.main;

import java.util.Arrays;
import com.tictactoe.main.XOJudge;

public class TestMain {

	public static void main(String args[]) {
		Judge xoJudge = new XOJudge();
		Integer[] moveHistory = new Integer[] { 0, 4, 1, 3, 2 };
		String result = xoJudge.judge(Arrays.asList(moveHistory));
		System.out.println("Result is " + result);

		Integer[] moveHistory1 = new Integer[] { 4, 0, 2, 6, 3, 5, 7, 1, 8 };
		String result1 = xoJudge.judge(Arrays.asList(moveHistory1));
		System.out.println("Result1 is " + result1);

		Integer[] moveHistory2 = new Integer[] { 0, 6, 1, 2, 3, 8, 5, 7 };
		String result2 = xoJudge.judge(Arrays.asList(moveHistory2));
		System.out.println("Result2 is " + result2);

		Integer[] moveHistory3 = new Integer[] { -465 };
		String result3 = xoJudge.judge(Arrays.asList(moveHistory3));
		System.out.println("Result2 is " + result3);
		
		Integer[] moveHistory4 = new Integer[] { 1,null,2,null,5 };
		String result4 = xoJudge.judge(Arrays.asList(moveHistory4));
		System.out.println("Result4 is " + result4);
	}
}
