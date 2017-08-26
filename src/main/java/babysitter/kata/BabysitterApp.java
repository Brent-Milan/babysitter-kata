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
			String hardCodeDate = "08.23.2017";
			
//			TimeClock.logInvoiceFullShift(hardCodeDate, userInput2);
			System.out.println("\nYour shift invoice amount is " + TimeClock.calcFullShift(userInput2) + ".");
			System.out.println("A record has been logged in your default text file.");
		} else if(userInput == 2) {
			System.out.println("\nWhat is the agreed upon bedtime for this job?");
			int userInput2 = input.nextInt();
			String hardCodeDate = "08.23.2017";
			
			System.out.println("\nWhat was the starting hour for this job?");
			int userInput3 = input.nextInt();
			
			System.out.println("\nWhat was the end hour for this job?");
			int userInput4 = input.nextInt();
			
			System.out.println("\nYour shift invoice amount is " + TimeClock.calcPartialShift(userInput3, userInput4,userInput2) + ".");
			System.out.println("A record has been logged in your default text file.");
		}  
		

	} 

}
