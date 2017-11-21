package com.tictactoe.test;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import com.tictactoe.main.Judge;
import com.tictactoe.main.XOJudge;

public class XOJudgeTest {

	private final String PLAYER_X_WIN = "X_WINS";
	private final String PLAYER_O_WIN = "O_WINS";
	private final String NO_WINNER = "NO_WINNER";
	private Judge xoJudge = new XOJudge();

	@Rule
	public ExpectedException exception = ExpectedException.none();

	/**
	 * Below method is used to test result for passed list
	 * 
	 * @Input Integer[]
	 * @Output String Result : Player X win
	 */
	@Test
	public void judgeTestXWins() {
		assertEquals(PLAYER_X_WIN, xoJudge.judge(Arrays.asList(new Integer[] { 0, 4, 1, 3, 2 })));
	}

	/**
	 * Below method is used to test result for passed list
	 * 
	 * @Input Integer[]
	 * @Output String Result : Player Y win
	 */
	@Test
	public void judgeTestOWins() {
		assertEquals(PLAYER_O_WIN, xoJudge.judge(Arrays.asList(new Integer[] { 0, 6, 1, 2, 3, 8, 5, 7 })));
	}

	/**
	 * Below method is used to test result for passed list
	 * 
	 * @Input Integer[]
	 * @Output String Result : Draw
	 */

	@Test
	public void judgeTestDraw() {
		assertEquals(NO_WINNER, xoJudge.judge(Arrays.asList(new Integer[] { 4, 0, 2, 6, 3, 5, 7, 1, 8 })));
	}

	/**
	 * Below method is used to test result for passed list with negative value
	 * 
	 * @Input Integer[]
	 * @Output String Result : ArrayIndexOutOfBoundsException
	 */
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void judgeArrayIndexOutofBound() {
		xoJudge.judge(Arrays.asList(new Integer[] { 0, -4, -1, 3, 2 }));
	}

	/**
	 * Below method is used to test result for passed list with null value
	 * 
	 * @Input Integer[]
	 * @Output String Result : NullPointerException
	 */
	@Test(expected = NullPointerException.class)
	public void judgeNullPointerException() {
		xoJudge.judge(Arrays.asList(new Integer[] { null, 4, 1, 3, 2 }));
	}
}
