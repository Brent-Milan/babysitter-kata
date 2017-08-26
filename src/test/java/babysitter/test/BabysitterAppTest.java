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
	public void shouldReturnTrueForValidIntegers() {
		int userInput = 5;
		
		boolean result = true;
		
		assertEquals(result, BabysitterApp.isValid(userInput));
	}

}
