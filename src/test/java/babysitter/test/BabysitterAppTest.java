package babysitter.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import babysitter.kata.BabysitterApp;

public class BabysitterAppTest {
	
	private BabysitterApp classUnderTest;

	@Before
	public void setUp() throws Exception {
		classUnderTest = new BabysitterApp();
	}

	@Test
	public void shouldReturnTrueForValidStartTimeIntegers() {
		int userInput = 5;
		
		boolean result = true;
		
		assertEquals(result, BabysitterApp.isValid(userInput));
	}  
	
	@Test 
	public void shouldReturnFalseForInvalidStartTimeIntegers() {
		int userInput = 4;
		
		boolean result = false;
		
		assertEquals(result, BabysitterApp.isValid(userInput));
	}
	
	@Test
	public void shouldReturnTrueForValidEndTimeIntegers() {
		int userInput = 6;
		
		boolean result = true;
		
		assertEquals(result, BabysitterApp.isValidEnd(userInput));
	} 

}
	
