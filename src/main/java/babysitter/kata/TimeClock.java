package babysitter.kata;

import java.util.HashMap;
import java.util.Map;

public class TimeClock {

	Map<Integer, Double> map = new HashMap<Integer, Double>();
	
	public void populateMap() {
		map.put(5, 12.00);
		map.put(6, 12.00);
		map.put(7, 12.00);
		map.put(8, 12.00);
		map.put(9, 8.00);
		map.put(10, 8.00);
		map.put(11, 8.00);
		map.put(12, 16.00);
		map.put(1, 16.00);
		map.put(2, 16.00);
		map.put(3, 16.00);
	
	}
	
	public Map<Integer, Double> getMap() {
		return map;
	}
	
}
