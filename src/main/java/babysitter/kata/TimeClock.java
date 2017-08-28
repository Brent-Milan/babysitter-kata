package babysitter.kata;

import java.util.Arrays;
 
public class TimeClock {
	
	private int[] hours = { 5, 6, 7, 8, 9, 10, 11, 12, 1, 2, 3 };
	
	private int[] payRates = new int[11];
	
	//populates int[] payRates based on given bedtime (allows user to define bedtime for shift)
	public int[] newBedtime(int newBedtime) {
		int[] newPayRates = new int[11];
		int hour = 5;
		
		if(newBedtime == 1) {
			newBedtime = 13;
		} else if(newBedtime == 2) {
			newBedtime = 14;
		} else if(newBedtime == 3){
			newBedtime = 15;
		}
		
		for(int index = 0; index <= 10; index++) {
			if(hour >= 12) {
				newPayRates[index] = 16;
				hour++;
			} else if(hour < newBedtime) {
				newPayRates[index] = 12;
				hour++;
			} else if(hour >= newBedtime) {
				newPayRates[index] = 8;
				hour++;
			} 
		}
		return newPayRates;
	}
	
	//calculates total invoice amount for a maximum shift length and returns as variable
	public int calcFullShift(int bedTime) {
		int[] payRates = newBedtime(bedTime);
		int invoiceAmount = 0;
		for(int index = 0; index < payRates.length; index++) {
			int billableHour = 1;
			int currentPayRate = payRates[index];
			invoiceAmount += (billableHour * currentPayRate);
		}
		return invoiceAmount;
	}
	
	//used by calcPartialShift() to create a copy of a range in payRates[]
	public int[] copyArrayAtIndexes(int startCopy, int endCopy, int bedTime) {
		int[] payRates = newBedtime(bedTime);
		int[] arrayCopy = Arrays.copyOfRange(payRates, startCopy, endCopy);
		return arrayCopy;
	}  
	
	//used by calcPartialShift() to return the index location of a given integer
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
	
	//calculates the invoice amount for a partial shift. Relies on copyArrayAtIndexes() and convertToTimelineIndex()
	public int calcPartialShift(int startTime, int endTime, int bedTime) {
		int startTimeIndex = convertToTimelineIndex(startTime);
		int endTimeIndex = convertToTimelineIndex(endTime);
		
		int[] copiedPayRates = copyArrayAtIndexes(startTimeIndex, endTimeIndex, bedTime);
		
		int invoiceAmount = 0;
		for(int index = 0; index < copiedPayRates.length; index++) {
			int billableHour = 1;
			int currentPayRate = copiedPayRates[index];
			invoiceAmount += (billableHour * currentPayRate);
		} 
		return invoiceAmount;
	} 
	
	/**********************
	 * Getter Methods
	 ***********************/
	public int[] getHours() {
		return hours;
	}
	
	public int[] getPayRates() {
		return payRates;
	}
	
} // end class
	
	 

