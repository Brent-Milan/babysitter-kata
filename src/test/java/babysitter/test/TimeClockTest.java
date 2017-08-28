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
		
		assertArrayEquals(new int[] { 5, 6, 7, 8, 9, 10, 11, 12, 1, 2, 3 }, hours);
	}
	
	@Test 
	public void payRatesArrayContainsCorrectValues() {
		int[] payRates = classUnderTest.newBedtime(9); 
		
		assertArrayEquals(new int[] { 12, 12, 12, 12, 8, 8, 8, 16, 16, 16, 16 }, payRates);	 
	}
	
	@Test
	public void shouldReturnTotalAmountToInvoiceForFullShift() {
		int bedtime = 9;
		
		int result = 136;
		
		assertEquals(result, classUnderTest.calcFullShift(bedtime));	
	} 
	
	
	@Test 
	public void shouldCopyArrayBetweenGivenIndexes() {
		int startCopyAtIndex = 0;
		int endCopyAtIndex = 5;
		int bedtime = 9;
		
		int[] result = { 12, 12, 12, 12, 8};
		
		assertArrayEquals(result, classUnderTest.copyArrayAtIndexes(startCopyAtIndex, endCopyAtIndex, bedtime));
	}
	
	@Test
	public void shouldConvertStartTimeToRelevantIndexInHoursArray() {
		int startTime = 5;
		
		int result = 0;
		
		assertEquals(result, classUnderTest.convertToTimelineIndex(startTime));
		
		//checks a different value
		startTime = 6;
		
		result = 1;
		
		assertEquals(result, classUnderTest.convertToTimelineIndex(startTime));
		
		//edge case that should return 'default' value in switch (99)
		startTime = 98;
		
		result = 99;
		
		assertEquals(result, classUnderTest.convertToTimelineIndex(startTime));	
	}
	
	@Test 
	public void shouldUsePreviousMethodsToReturnInoviceAmountForPartialShift() {
		int startTime = 5;
		int endTime = 9;
		int bedTime = 10;
		
		int result = 48;
			
		assertEquals(result, classUnderTest.calcPartialShift(startTime, endTime, bedTime));
	}
		
	@Test
	public void shouldReturnExpectedInvoiceAmountForFullShiftWithBedtimeAfter12() {
		int bedTime = 12;
		
		int result = 148;
		
		assertEquals(result, classUnderTest.calcFullShift(bedTime));
	}
	
	@Test
	public void shouldReturnExpectedInvoiceAmountForFullShiftWithBedtimeOf1() {
		int bedTime = 1;
		int result = 148;
		
		assertEquals(result, classUnderTest.calcFullShift(bedTime));
	}
	
	@Test
	public void shouldReturnExpectedInvoiceAmountForFullShiftWithBedtimeOf2() {
		int bedTime = 2;
		int result = 148;
		
		assertEquals(result, classUnderTest.calcFullShift(bedTime));
	}
	
	@Test
	public void shouldReturnANewParallelArrayOfPayRatesBasedOnGivenBedtime() {
		int bedtime = 10;
		
		int[] result = { 12, 12, 12, 12, 12, 8, 8, 16, 16, 16, 16 };
		
		assertArrayEquals(result, classUnderTest.newBedtime(bedtime));
	}  
	
}
				
		
	


