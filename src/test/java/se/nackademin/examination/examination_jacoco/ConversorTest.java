package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConversorTest {

	@Test
	public void testConversor_Name() {
		Conversor conversor = new Conversor();
		conversor.setNameConverterArrayValues();
		assertEquals(conversor.getNameConverterArray().get(0), "Your first name is smaller than your last name");
		assertEquals(conversor.getNameConverterArray().get(1), "Your last name is smaller than your first name");
		assertEquals(conversor.getNameConverterArray().get(2), "The lengths of your first name is your last name are the same");
	}
	
	@Test
	public void testConversor_Age() {
		Conversor conversor = new Conversor();
		conversor.setAgeConverterArrayValues();
		assertEquals(conversor.getAgeConverterArray().get(0), "You are young and talented! Things will come your way soon enough! ");
		assertEquals(conversor.getAgeConverterArray().get(1), "You are experienced and talented! Things will come your way soon enough!");
	}
	
	@Test
	public void testConversor_Gender() {
		Conversor conversor = new Conversor();
		conversor.setGenderConverterArrayValues();
		assertEquals(conversor.getGenderConverterArray().get(0), "man!");
		assertEquals(conversor.getGenderConverterArray().get(1), "woman!");
		assertEquals(conversor.getGenderConverterArray().get(2), "person!");
		
	}

}
