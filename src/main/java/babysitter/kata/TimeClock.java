package babysitter.kata;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
 
public class TimeClock {
	
	private int[] hours = 		{ 5, 6, 7, 8, 9, 10, 11, 12, 1, 2, 3 };
	
	private int[] payRates = 	 { 12, 12, 12, 12, 8, 8, 8, 16, 16, 16, 16 };
	
	//calculates total billable pay for a maximum shift length and returns as variable
	public int calcFullShift() {
		int invoiceAmount = 0;
		for(int index = 0; index < payRates.length; index++) {
			int billableHour = 1;
			int currentPayRate = payRates[index];
			invoiceAmount += (billableHour * currentPayRate);
		}
		return invoiceAmount;
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
	
	public int calcPartialShift(int startTime, int endTime) {
		int startTimeIndex = convertToTimelineIndex(startTime);
		int endTimeIndex = convertToTimelineIndex(endTime);
		
		int[] copiedPayRates = copyArrayAtIndexes(startTimeIndex, endTimeIndex);
		
		int invoiceAmount = 0;
		for(int index = 0; index < copiedPayRates.length; index++) {
			int billableHour = 1;
			int currentPayRate = copiedPayRates[index];
			invoiceAmount += (billableHour * currentPayRate);
		}
		return invoiceAmount;
	} 
	 
	public String generateFileName(String date) {
		String fileName = "babysitting-invoice_" + date + ".text";
		return fileName;	
	}
	
	public void logInvoiceFullShift(String date) throws IOException {
		String appendedFileName = generateFileName(date);
		int invoiceAmount = calcFullShift();
		
		try {
		PrintWriter fileWriter = new PrintWriter(new FileWriter(appendedFileName));
				fileWriter.println(date + ": 11 hours, " + invoiceAmount + " dollars");
				fileWriter.close();				
			} catch(IOException e) {
				System.out.println("Cannot write file!"); 
			} 
	} 
	
	public int[] newBedtime(int newBedtime) {
		int[] newPayRates = new int[11];
		int hour = 5;
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
	
	 

