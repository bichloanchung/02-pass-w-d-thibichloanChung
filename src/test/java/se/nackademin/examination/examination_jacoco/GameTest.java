package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class GameTest {

	// test calculateOutPutBaseOnNames()
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
	
	// test calculateOutPutBaseOnGender()
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
	
	// test calculateOutPutBasedOnAge()
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
	
	// test calculateOutPutBaseOnHomeCity()
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
	
	// test getGenderFromInputValues()
	@Test
	public void testMethod5() {
		Game game = new Game();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Thi", "Chung", "F", "20", "Saigon"));
		
		assertEquals("Gender Character of this person is F", game.getGenderFromInputValues(values), 'F');
	}
	
	// test getAgeFromInputValues()
	@Test
	public void testMethod6() {
		Game game = new Game();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Thi", "Chung", "F", "20", "Saigon"));
		
		assertEquals("The result should be 20", game.getAgeFromInputValues(values), 20);
	}
	
	// test buildFinalString()
	@Test
	public void testMethod7() {
		
		Conversor conversor = new Conversor();
		ResultFromInputs resultFromInputs = new ResultFromInputs();
		int age = 0;
		resultFromInputs.setResultForAge(age);
		int gender = 2;
		resultFromInputs.setResultForGender(gender);
		int name = 2;
		resultFromInputs.setResultForNameLenght(name);
		int homecity = 9;
		resultFromInputs.setResultForHomeCity(homecity);
		
		Game game = new Game();
		game.buildFinalString("A", "B", resultFromInputs, conversor);
			
		String tgender = conversor.getGenderConverterArray().get(gender);
		assertEquals(tgender, "person!");
		
		String tage = conversor.getAgeConverterArray().get(age);
		assertEquals(tage, "You are young and talented! Things will come your way soon enough! ");
		
		String tname = conversor.getNameConverterArray().get(name);
		assertEquals(tname, "The lengths of your first name is your last name are the same");
		
		String thomecity = conversor.getCityConverterArray().get(homecity);
		assertEquals(thomecity, " J, ");
		
	}
	
	// test runGame()
		@Test
		public void testMethod8() {
			Game game = new Game();
			
			String gameName = "Game";
			String firstName = "Elina";
			String lastName = "Svensson";
			char gender = 'F';
			int age = 30;
			String homeCity = "Stockholm";
			
			game.runGame(gameName, firstName, lastName, gender, age, homeCity);
			
			int nameE = game.calculateOutPutBasedOnNames(firstName, lastName);
			assertEquals("CalculateOutPutBaseOnNames should be 0", nameE, 0);
			
			int genderE = game.calculateOutPutBasedOnGender(gender);
			assertEquals("CalculateOutPutBasedOnGender should be 1", genderE, 1);
			
			int ageE = game.calculateOutPutBasedOnAge(age);
			assertEquals("CalculataOutPutBasedOnAge should be 1", ageE, 1);
			
			int cityE = game.calculateOutPutBasedOnHomeCity(homeCity);
			assertEquals("CalculateOutPutBasedOnHomeCity should be 10", cityE, 10);
			
		}
		
		// test run()
		@Test
		public void testMethod9() {
			Game game = new Game();
			//DataAnalysis dataAnalysis = new DataAnalysis();
			ArrayList<String> values = new ArrayList<String>();
			values.addAll(Arrays.asList("Game", "Thi", "Chung", "P", "25", "France"));
			
			game.run(values);
	
			assertEquals(values.get(0), "Game");
			assertEquals(values.get(1), "Thi");
			assertEquals(values.get(2), "Chung");
			assertEquals(game.getGenderFromInputValues(values), 'P');
			assertEquals(game.getAgeFromInputValues(values), 25);
			assertEquals(values.get(5), "France");

		}

}
