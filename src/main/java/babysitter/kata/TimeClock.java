package babysitter.kata;

import java.util.Arrays;
 
public class TimeClock {
	
	private int[] hours = { 5, 6, 7, 8, 9, 10, 11, 12, 1, 2, 3 };
	
	private int[] payRates = { 12, 12, 12, 12, 8, 8, 8, 16, 16, 16, 16 };
	
	//calculates total billable pay for a maximum shift length and returns as variable
	public int calcFullShift() {
		int billablePay = 0;
		for(int index = 0; index < payRates.length; index++) {
			int billableHour = 1;
			int currentPayRate = payRates[index];
			billablePay += (billableHour * currentPayRate);
		}
		return billablePay;
	}

	public int[] copyArrayAtIndexes(int startCopy, int endCopy) {
		int[] arrayCopy = Arrays.copyOfRange(payRates, startCopy, endCopy);
		return arrayCopy;
	} 
	
	public int convertToTimelineIndex(int time) {
		switch(time) {
			case 5: 
				return 0;
			case 6:
				return 1;
			case 7:
				return 2;
			case 8:
				return 3;
			case 9:
				return 4;
			case 10:
				return 5;
			case 11:
				return 6;
			case 12:
				return 7;
			case 1:
				return 8;
			case 2:
				return 9;
			case 3: 
				return 10;
			default:
				return 99;   
		}
	} 
	
	//public int calcPartialShift()
	 
	public String generateFileName(String date) {
		String fileName = "babysitting-hours." + date;
		return fileName;
		
	}
	
/****************************
	 * Getter Methods
 ****************************/
	public int[] getHours() {
		return hours;
	}
	
	public int[] getPayRates() {
		return payRates;
	}
	
} // end class
	
	 

