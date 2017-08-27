package babysitter.kata;

import java.util.Scanner;

public class BabysitterApp {

	public static void main(String[] args) {

		TimeClock clock = new TimeClock();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the Babysitter Assistant v1.0 main menu.\n");
		System.out.println("Please choose from the options below: \n");
		
		System.out.println("1. Calculate And Log Invoice for a Full Shift (5pm - 4am)");
		System.out.println("2. Calculate and Log Invoice for a Partial Shift (data entry)");
		System.out.println("3. System exit");
		int userInput = input.nextInt();
		
		if(userInput == 1) {
			System.out.println("\nWhat is the agreed upon bedtime for this job?");
			int userInput2 = input.nextInt();
//			String hardCodeDate = "08.23.2017";
			
				while(!isValid(userInput2)) {
					System.out.println("Invalid input. Please enter a valid bedtime.");
					System.out.println("Start time must be between 5pm and 4am. Enter as a whole number "
							+ "without \"am\" or \"pm\".");
					System.out.println("Example: 7\n");
					
					System.out.println("What was the starting hour for this job?");
					userInput2 = input.nextInt();
				}
			
//			TimeClock.logInvoiceFullShift(hardCodeDate, userInput2);
			System.out.println("\nYour shift invoice amount is " + clock.calcFullShift(userInput2) + ".");
			System.out.println("A record has been logged in your default text file.");
		} else if(userInput == 2) {
			System.out.println("\nWhat is the agreed upon bedtime for this job?");
			int userInput2 = input.nextInt();
//			String hardCodeDate = "08.23.2017";
			
				while(!isValid(userInput2)) {
					System.out.println("Invalid input. Please enter a valid bedtime.");
					System.out.println("Start time must be between 5pm and 4am. Enter as a whole number "
							+ "without \"am\" or \"pm\".");
					System.out.println("Example: 7\n");
					
					System.out.println("What was the starting hour for this job?");
					userInput2 = input.nextInt();
				}
			
			System.out.println("\nWhat was the starting hour for this job?");
			int userInput3 = input.nextInt();
			
				while(!isValid(userInput3)) {
					System.out.println("Invalid input. Please enter a valid start time.");
					System.out.println("Start time must be an hour block between 5pm and 4am. Enter as a whole number "
							+ "without \"am\" or \"pm\".");
					System.out.println("Example: 7\n");
					
					System.out.println("What was the starting hour for this job?");
					userInput3 = input.nextInt();
				}
			
			System.out.println("\nWhat was the end hour for this job?");
			int userInput4 = input.nextInt();
			
				while(!isValid(userInput4)) {
					System.out.println("Invalid input. Please enter a valid end time.");
					System.out.println("Start time must be an hour block between 5pm and 4am. Enter as a whole number "
							+ "without \"am\" or \"pm\".");
					System.out.println("Example: 7\n");
					
					System.out.println("What was the starting hour for this job?");
					userInput3 = input.nextInt();
				}
			
			System.out.println("\nYour shift invoice amount is " + clock.calcPartialShift(userInput3, userInput4,userInput2) + ".");
//			System.out.println("A record has been logged in your default text file.");
		}   
		

	}  //end main

	public static boolean isValid(int userInput) {
		if(userInput == 5 || userInput == 6 || userInput == 7 || userInput == 8 || userInput == 9 || userInput == 10 || userInput == 11 || 
				userInput == 12 || userInput == 1 || userInput ==  2 || userInput == 3) {
			return true;
		} else {
			return false;
		}
	}
	
}
