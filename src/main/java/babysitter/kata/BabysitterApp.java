package babysitter.kata;

import java.util.Scanner;

public class BabysitterApp {

	public static void main(String[] args) {

		TimeClock clock = new TimeClock();
		Scanner input = new Scanner(System.in);
		
	do {	
		System.out.println("----------------------------------------------------");
		System.out.println("\nWelcome to the Babysitter Assistant v1.0 main menu.\n");
		System.out.println("Please choose from the options below: \n");
		
		System.out.println("1. Calculate Invoice for a Full Shift (5pm - 4am)");
		System.out.println("2. Calculate Invoice for a Partial Shift (data entry)");
		System.out.println("3. System exit");
		int userInput = input.nextInt();
		
		if(userInput == 1) {
			System.out.println("\nWhat is the agreed upon bedtime for this job?");
			int userInput2 = input.nextInt();
			
				while(!isValid(userInput2)) {
					System.out.println("\nInvalid input. Please enter a valid bedtime.");
					System.out.println("Start time must be between 5pm and 4am. Enter as a whole number "
							+ "without \"am\" or \"pm\".");
					System.out.println("Example: 7\n");
					
					System.out.println("What is the agreed upon bedtime for this job?");
					userInput2 = input.nextInt();
				}
			
			System.out.println("\nYour invoice amount for this shift is " + clock.calcFullShift(userInput2) + " dollars.");
			
		} else if(userInput == 2) {
			System.out.println("\nWhat is the agreed upon bedtime for this job?");
			int userInput2 = input.nextInt();
			
				while(!isValid(userInput2)) {
					System.out.println("\nInvalid input. Please enter a valid bedtime.");
					System.out.println("Start time must be between 5pm and 4am. Enter as a whole number "
							+ "without \"am\" or \"pm\".");
					System.out.println("Example: 7\n");
					
					System.out.println("What is the agreed upon bedtime for this job?");
					userInput2 = input.nextInt();
				}
			
			System.out.println("\nWhat was the starting hour for this job?");
			int userInput3 = input.nextInt();
			
				while(!isValid(userInput3)) {
					System.out.println("\nInvalid input. Please enter a valid start time.");
					System.out.println("Start time must be an hour block between 5pm and 4am. Enter as a whole number "
							+ "without \"am\" or \"pm\".");
					System.out.println("Example: 7\n");
					
					System.out.println("What was the starting hour for this job?");
					userInput3 = input.nextInt();
				}
				
			
			System.out.println("\nWhat was the end hour for this job?");
			System.out.println("(Hours are charged in full. If the last hour you worked was 3-4am, enter 3.)");
			int userInput4 = input.nextInt();
			
				while(!isValid(userInput4)) {
					System.out.println("\nInvalid input. Please enter a valid end time.");
					System.out.println("Start time must be an hour block between 5pm and 3am (no shift may go past 4am). Enter as a whole number "
							+ "without \"am\" or \"pm\".");
					System.out.println("Example: 7\n");
					
					System.out.println("What was the end hour for this job?");
					System.out.println("(Hours are charged in full. If the last hour you worked was 3-4am, enter 3.");
					userInput3 = input.nextInt();
				}
			
				/*
				 * Important! This checks whether the user entered a full shift (5pm - 4am) under the partial shift option.
				 * Unchecked, this would result in an incorrect calculation of the invoice amount, because the calcPartialShift()
				 * method uses Arrays.copyOfRange() resulting in index 10 being omitted. Rather than kick the user back to the main menu,
				 * this stealthily uses the proper calculation for a full shift scenario. 
				 * */
				if(userInput3 == 5 && userInput4 == 3) {
					System.out.println("\nYour invoice amount for this shift is " + clock.calcFullShift(userInput2) + " dollars.");
				} else { 
					System.out.println("\nYour invoice amount for this shift is " + clock.calcPartialShift(userInput3, userInput4,userInput2) + " dollars.");
				}
			
		} else if(userInput == 3) {
			System.out.println("\nThank you for using Babysitter Assistant v1.0.");
			System.out.println("<<Goodbye!>>");
			input.close();
			System.exit(0);
		}
	} while(!userHasEnded());
		

	}  //end main

	/******************
	 * App Methods
	 *****************/
	
	//always returns false and continues the loop until user chooses option 3; resulting in System.exit
	private static boolean userHasEnded() {
		return false;
	}

	//validates user input (must be an integer associated with hours[] in TimeClock class
	public static boolean isValid(int userInput) {
		if(userInput == 5 || userInput == 6 || userInput == 7 || userInput == 8 || userInput == 9 || userInput == 10 || userInput == 11 || 
				userInput == 12 || userInput == 1 || userInput ==  2 || userInput == 3) {
			return true;
		} else {
			return false; 
		}
	}
	
} 
