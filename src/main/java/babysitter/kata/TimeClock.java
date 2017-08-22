package babysitter.kata;

import java.util.HashMap;
import java.util.Map;

public class TimeClock {

	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	
	//populates map with current hours and rates for service
	public void populateMap() {
		map.put(5, 12);
		map.put(6, 12);
		map.put(7, 12);
		map.put(8, 12);
		map.put(9, 8);
		map.put(10, 8);
		map.put(11, 8);
		map.put(12, 16);
		map.put(1, 16);
		map.put(2, 16);
		map.put(3, 16);
	
	}
	
	public int calcFullShift() {
		int total = 0;
		for(double current: map.values()) {
			total += current;
		}
		return total; 
	} 
	
	public Map<Integer, Integer> getMap() {
		return map;
	}
	 
}
