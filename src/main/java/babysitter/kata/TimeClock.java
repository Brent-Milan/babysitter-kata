package babysitter.kata;

public class TimeClock {
	
	//These are two parallel arrays with corresponding values at matching indexes
	private int[] hours = { 5, 6, 7, 8, 9, 10, 11, 12, 1, 2, 3 };
	
	private int[] payRates = { 12, 12, 12, 12, 8, 8, 8, 16, 16, 16, 16 };
	
	public int calcFullShift() {
		int billablePay = 0;
		for(int index = 0; index < payRates.length; index++) {
			int billableHour = 1;
			int currentPayRate = payRates[index];
			billablePay += (billableHour * currentPayRate);
		}
		return billablePay;
	}
	
	
	
	
	
	public int[] getHours() {
		return hours;
	}
	
	public int[] getPayRates() {
		return payRates;
	}
}
	
	

