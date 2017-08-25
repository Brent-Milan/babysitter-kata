package babysitter.kata;

import java.util.Scanner;

public class BabysitterApp {

	public static void main(String[] args) {

		TimeClock clock = new TimeClock();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the Babysitter Assistant v1.0 main menu.\n");
		System.out.println("Please choose from the options below: \n");
		
		System.out.println("1. Calculate And Log Invoice for a Full Shift (5pm - 4am)");
		System.out.println("2. Calculate and Log Invoice for a Partial Shift (data entry");
		System.out.println("3. System exit");
		int userInput = input.nextInt();
		

	}

}
