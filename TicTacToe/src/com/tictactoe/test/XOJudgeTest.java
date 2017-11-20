package com.tictactoe.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.tictactoe.main.Judge;
import com.tictactoe.main.XOJudge;

public class XOJudgeTest {

	private final String PLAYER_X_WIN = "X_WINS";
	private final String PLAYER_O_WIN = "O_WINS";
	private final String NO_WINNER = "NO_WINNER";
	private final String INVALID_INPUT = "NOT_VALID_INPUT";

	/**
	 * Below method is used to test result for passed list
	 * 
	 * @Input Integer[]
	 * @Output String Result : Player X win
	 */

	@Test
	public void judgeTestXWins() {
		Judge xoJudge = new XOJudge();
		Integer[] moveHostry = new Integer[] { 0, 4, 1, 3, 2 };
		String result = xoJudge.judge(Arrays.asList(moveHostry));
		assertEquals(PLAYER_X_WIN, result);
	}

	/**
	 * Below method is used to test result for passed list
	 * 
	 * @Input Integer[]
	 * @Output String Result : Player Y win
	 */

	@Test
	public void judgeTestOWins() {
		Judge xoJudge = new XOJudge();
		Integer[] moveHostry = new Integer[] { 0, 6, 1, 2, 3, 8, 5, 7 };
		String result = xoJudge.judge(Arrays.asList(moveHostry));
		assertEquals(PLAYER_O_WIN, result);
	}

	/**
	 * Below method is used to test result for passed list
	 * 
	 * @Input Integer[]
	 * @Output String Result : Draw
	 */

	@Test
	public void judgeTestDraw() {
		Judge xoJudge = new XOJudge();
		Integer[] moveHostry = new Integer[] { 4, 0, 2, 6, 3, 5, 7, 1, 8 };
		String result = xoJudge.judge(Arrays.asList(moveHostry));
		assertEquals(NO_WINNER, result);
	}

	/**
	 * Below method is used to test result for passed list
	 * 
	 * @Input Integer[]
	 * @Output String Result : Invalid Input : invalid number 312
	 */
	@Test
	public void judgeTestInvalidInput() {
		Judge xoJudge = new XOJudge();
		Integer[] moveHostry = new Integer[] { 4, 0, 312 };
		String result = xoJudge.judge(Arrays.asList(moveHostry));
		assertEquals(INVALID_INPUT, result);
	}

	/**
	 * Below method is used to test result for passed list
	 * 
	 * @Input Integer[]
	 * @Output String Result : Invalid Input : more than 9 values in list
	 */
	@Test
	public void judgeTestInvalidInputMorethanNineIntegers() {
		Judge xoJudge = new XOJudge();
		Integer[] moveHostry = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		String result = xoJudge.judge(Arrays.asList(moveHostry));
		assertEquals(INVALID_INPUT, result);
	}

	/**
	 * Below method is used to test result for passed list
	 * 
	 * @Input Integer[]
	 * @Output String Result : Invalid Input : negative value passed
	 */
	@Test
	public void judgeTestInvalidInputPassingNegative() {
		Judge xoJudge = new XOJudge();
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(5);
		list.add(1);
		list.add(4);
		// Passing negative value
		list.add(-23);
		String result = xoJudge.judge(list);
		assertEquals(INVALID_INPUT, result);
	}

	/**
	 * Below method is used to test result for passed list
	 * 
	 * @Input Integer[]
	 * @Output String Result : Invalid Input : null value passed
	 */
	@Test
	public void judgeTestInvalidInputPassingNull() {
		Judge xoJudge = new XOJudge();
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(5);
		list.add(1);
		list.add(4);
		// Passing null
		list.add(null);
		String result = xoJudge.judge(list);
		assertEquals(INVALID_INPUT, result);
	}

	/**
	 * Below method is used to test result for passed list
	 * 
	 * @Input Integer[]
	 * @Output String Result : Invalid Input : passing empty List
	 */
	@Test
	public void judgeTestInvalidInputPassingEmptyList() {
		Judge xoJudge = new XOJudge();
		List<Integer> list = new ArrayList<Integer>();
		String result = xoJudge.judge(list);
		assertEquals(INVALID_INPUT, result);
	}

	/**
	 * Below method is used to test result for passed list
	 * 
	 * @Input Integer[]
	 * @Output String Result : Invalid Input : passing null as List
	 */
	@Test
	public void judgeTestInvalidInputPassingNullassList() {
		Judge xoJudge = new XOJudge();
		String result = xoJudge.judge(null);
		assertEquals(INVALID_INPUT, result);
	}

}
