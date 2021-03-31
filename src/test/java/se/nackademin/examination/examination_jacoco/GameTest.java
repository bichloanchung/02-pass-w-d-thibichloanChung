package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

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
	
	@Test
	public void testMethod2() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnGender('M');
		assertEquals("The result should be 0", i, 0);
	}
	
	@Test
	public void testMethod2_2() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnGender('F');
		assertEquals("The result should be 1", i, 1);
	}
	
	@Test
	public void testMethod2_3() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnGender('G');
		assertEquals("The result should be 2", i, 2);
	}
	
	@Test
	public void testMethod3() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnAge(30);
		assertEquals("The result should be 1", i, 1);
	}
	
	@Test
	public void testMethod3_2() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnAge(20);
		assertEquals("The result should be 0", i, 0);
	}
	
	@Test
	public void testMethod4() {
		Game game = new Game();
		int i0 = game.calculateOutPutBasedOnHomeCity("a");
		assertEquals("The result should be 0", i0, 0);
		
		int i1 = game.calculateOutPutBasedOnHomeCity("b");
		assertEquals("The result should be 1", i1, 1);
		
		int i2 = game.calculateOutPutBasedOnHomeCity("c");
		assertEquals("The result should be 2", i2, 2);
		
		int i3 = game.calculateOutPutBasedOnHomeCity("d");
		assertEquals("The result should be 3", i3, 3);
		
		int i4 = game.calculateOutPutBasedOnHomeCity("e");
		assertEquals("The result should be 4", i4, 4);
		
		int i5 = game.calculateOutPutBasedOnHomeCity("f");
		assertEquals("The result should be 5", i5, 5);
		
		int i6 = game.calculateOutPutBasedOnHomeCity("g");
		assertEquals("The result should be 6", i6, 6);
		
		int i7 = game.calculateOutPutBasedOnHomeCity("h");
		assertEquals("The result should be 7", i7, 7);
		
		int i8 = game.calculateOutPutBasedOnHomeCity("i");
		assertEquals("The result should be 8", i8, 8);
		
		int i9 = game.calculateOutPutBasedOnHomeCity("j");
		assertEquals("The result should be 9", i9, 9);
		
		int i = game.calculateOutPutBasedOnHomeCity("m");
		assertEquals("The result should be 10", i, 10);
	}
	
	@Test
	public void testMethod5() {
		Game game = new Game();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Thi", "Chung", "F", "20", "Saigon"));
		
		assertEquals("Gender Character of this person is F", game.getGenderFromInputValues(values), 'F');
	}
	
	@Test
	public void testMethod6() {
		Game game = new Game();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Thi", "Chung", "F", "20", "Saigon"));
		
		assertEquals("The result should be 20", game.getAgeFromInputValues(values), 20);
	}
	
	@Test
	public void testMethod7() {
		// Initialize conversor
		Conversor conversor = new Conversor();
		ResultFromInputs resultFromInputs = new ResultFromInputs();
		int age = 1;
		resultFromInputs.setResultForAge(age);
		int gender = 1;
		resultFromInputs.setResultForGender(gender);

		Game game = new Game();
		game.buildFinalString("A", "B", resultFromInputs, conversor);
			
		String tgender = conversor.getGenderConverterArray().get(gender);
		String tage = conversor.getAgeConverterArray().get(age);
		assertEquals(tgender,"woman!");
		assertEquals(tage,"You are experienced and talented! Things will come your way soon enough!");
		
		//System.out.println(conversor.getAgeConverterArray().get(age));
		//System.out.println(conversor.getNameConverterArray().get(name)+ " and combining that with the first letter of your homecity, i.e. "+conversor.getCityConverterArray().get(homecity) );
		//System.out.println("it seems that you are a dedicated student and will be a great Software Tester Engineer!");

		
		
	}

}
