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
		//arrange
		int[] hours = classUnderTest.getHours();
		//assert
		assertArrayEquals(new int[] { 5, 6, 7, 8, 9, 10, 11, 12, 1, 2, 3 }, hours);
	}
	
	@Test 
	public void payRatesArrayContainsCorrectValues() {
		//arrange
		int[] payRates = classUnderTest.getPayRates(); 
		//assert
		assertArrayEquals(new int[] { 12, 12, 12, 12, 8, 8, 8, 16, 16, 16, 16 }, payRates);	 
	}
	
	@Test
	public void shouldReturnTotalAmountToInvoiceForFullShift() {
		//act
		int result = 136;
		//assert
		assertEquals(result, classUnderTest.calcFullShift());	
	}
	
	@Test
	public void shouldAppendDateToFileName() {
		String date = "08.22.2017";
		String result = "babysitting-hours.08.22.2017";
		
		assertEquals(result, classUnderTest.generateFileName(date));
		
	}
	
	@Test 
	public void shouldCopyArrayBetweenGivenIndexes() {
		int startCopyAtIndex = 0;
		int endCopyAtIndex = 5;
		
		int[] result = { 12, 12, 12, 12, 8};
		
		assertArrayEquals(result, classUnderTest.copyArrayAtIndexes(startCopyAtIndex, endCopyAtIndex));
	}
	
	@Test
	public void shouldConvertStartTimeToRelevantIndexInHoursArray() {
		int startTime = 5;
		
		int result = 0;
		
		assertEquals(result, classUnderTest.convertToTimelineIndex(startTime));
		
		startTime = 6;
		
		result = 1;
		
		assertEquals(result, classUnderTest.convertToTimelineIndex(startTime));
		
		startTime = 98;
		
		result = 99;
		
		assertEquals(result, classUnderTest.convertToTimelineIndex(startTime));	
	}
	
//	@Test 
//	public void shouldUsePreviousMethodsToReturnInoviceAmountForPartialShift() {
//		int startTime = 5;
//		int endTime = 9;
//		
//		int startTimeIndex = classUnderTest.convertToTimelineIndex(startTime);
//		int endTimeIndex = classUnderTest.convertToTimelineIndex(endTime);
//		
//		int[] array = classUnderTest.copyArrayAtIndexes(startTimeIndex, endTimeIndex);
//		
//		for(int index = 0; array.length; index++) {
//			int billableHour = 1;
//			int currentPayRate = payRates[index];
//			billablePay += (billableHour * currentPayRate);
//		}
//		
//		assertArrayEquals(result, classUnderTest.calcPartialShift()
//	}
		

	
/***
 * Saving for later. Make tests for partial shifts and converting user input for hours to related index first
 ***/	
	
	
//	@Test
//	public void shouldGenerateFileNameThenCalculateBillableHoursAndLogEverythingToFile() {
//		String date = "08.22.2017";
//		int startTime = 5;
//		int endTime = 1;
//		
//	}
		
		
		
	

}
