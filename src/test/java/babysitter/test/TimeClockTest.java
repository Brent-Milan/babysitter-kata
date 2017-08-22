package babysitter.test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import babysitter.kata.TimeClock;

public class TimeClockTest {

	private TimeClock classUnderTest;
	
	@Before
	public void setUp() throws Exception {
		classUnderTest = new TimeClock();
	}

	@Test
	public void hoursArrayContainsCorrectValues() {
		int[] hours = classUnderTest.getHours();
		
		assertArrayEquals(new int[] {5, 6, 7, 8, 9, 10, 11, 12, 1, 2, 3}, hours);
	}
	
	@Test
	public void payRatesArrayContainsCorrectValues() {
		int[] payRates = classUnderTest.getPayRates(); 
			
		assertArrayEquals(new int[] { 12, 12, 12, 12, 8, 8, 8, 16, 16, 16, 16 }, payRates);
		 
	}
	
	@Test
	public void shouldReturnTotalAmountToInvoiceForFullShift() {
//		//arrange
//		int firstBillableHour = 5;
//		int finalBillableHour = 4;
		
		//act
		int result = 136;
		
		//assert
		assertEquals(result, classUnderTest.fullShift());
		
		
	}
		
		
		
	

}
