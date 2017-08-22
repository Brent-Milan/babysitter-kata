package babysitter.test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

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
		
		Map<Integer, Double> map = classUnderTest.getMap();
		classUnderTest.populateMap();
		
		Map<Integer, Double> expected = new HashMap<Integer, Double>();
			expected.put(5, 12.00);
			expected.put(6, 12.00);
			expected.put(7, 12.00);
			expected.put(8, 12.00);
			expected.put(9, 8.00);
			expected.put(10, 8.00);
			expected.put(11, 8.00);
			expected.put(12, 16.00);
			expected.put(1, 16.00);
			expected.put(2, 16.00);
			expected.put(3, 16.00);
			
		assertEquals(expected, map);
			
	}
}
