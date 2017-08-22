package babysitter.test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.hamcrest.collection.IsMapContaining;
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
	public void testToAssertMapValuesAndSize() {
		
		Map<Integer, Integer> map = classUnderTest.getMap();
		classUnderTest.populateMap();
		
		Map<Integer, Integer> expected = new HashMap<Integer, Integer>();
			expected.put(5, 12);
			expected.put(6, 12);
			expected.put(7, 12);
			expected.put(8, 12);
			expected.put(9, 8);
			expected.put(10, 8);
			expected.put(11, 8);
			expected.put(12, 16);
			expected.put(1, 16);
			expected.put(2, 16);
			expected.put(3, 16);
			
		assertEquals(expected, map);
		
		assertEquals(map.size(), expected.size());
			
	}
	
	@Test
	public void shouldReturnTotalInvoiceAmountForAFullShift() {
		Map<Integer, Integer> map = classUnderTest.getMap();
		classUnderTest.populateMap();
		
		int result = 136;
		
		assertEquals(result, classUnderTest.calcFullShift());
	}

}	
