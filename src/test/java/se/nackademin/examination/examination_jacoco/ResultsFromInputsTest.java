package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.*;

import org.junit.Test;

public class ResultsFromInputsTest {

	@Test
	public void testNameGettersAndSettersMethods() {
		ResultFromInputs resultsFromInputs = new ResultFromInputs();
		resultsFromInputs.setResultForNameLenght(10);
		assertEquals("The result should be 10", resultsFromInputs.getResultForNameLenght(), 10);
	}
	
	@Test
	public void testAgeGettersAndSettersMethods() {
		ResultFromInputs resultsFromInputs = new ResultFromInputs();
		resultsFromInputs.setResultForAge(24);
		assertEquals("The result should be 24", resultsFromInputs.getResultForAge(), 24);
		
		resultsFromInputs.setResultForAge(30);
		assertEquals("The result should be 30", resultsFromInputs.getResultForAge(), 30);
	}
	
	@Test
	public void testGenderGettersAndSettersMethods() {
		ResultFromInputs resultsFromInputs = new ResultFromInputs();
		
		resultsFromInputs.setResultForGender(0);
		assertEquals("The result should be 0", resultsFromInputs.getResultForGender(), 0);
		
		resultsFromInputs.setResultForGender(1);
		assertEquals("The result should be 1", resultsFromInputs.getResultForGender(), 1);
	}
	
	@Test
	public void testCityGettersAndSettersMethods() {
		ResultFromInputs resultsFromInputs = new ResultFromInputs();
		resultsFromInputs.setResultForHomeCity(8);;
		assertEquals("The result should be 8", resultsFromInputs.getResultForHomeCity(), 8);
	}
	

}
