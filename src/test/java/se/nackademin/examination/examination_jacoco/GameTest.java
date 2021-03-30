package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {

	@Test
	public void testMethod1() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnNames("Rafael", "Silva");
		assertEquals("The result should be 1", i, 1);
	}
	
	@Test
	public void testMethod1_2() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnNames("Thi", "Chung");
		assertEquals("The result should be 0", i, 0);
	}
	
	@Test
	public void testMethod1_3() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnNames("Jakob", "Berny");
		assertEquals("The result should be 2", i, 2);
	}

}
