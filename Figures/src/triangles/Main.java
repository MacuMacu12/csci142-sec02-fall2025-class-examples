package triangles;

import java.util.Scanner;
public class Main {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("would you like to know your fortune?");
		String answer = input.next();
		
		if(answer.equals("yes")) {
			
			// This first random number will decide which question branch to take.
			int questionNumber = (int)(Math.random() * 3) + 1; // Generates 1, 2, or 3
			
			// This second random number will decide which fortune to give at the end.
			int fortuneNumber = (int)(Math.random() * 3) + 1; // Generates 1, 2, or 3
			
			System.out.println("perfect");
			
			// Based on the random questionNumber, one of these blocks will be executed.
			if(questionNumber == 1) {
				System.out.println("how long yo dih");
				int dihLength = input.nextInt();
			}
			
			else if(questionNumber == 2) {
				System.out.println("are you kiki or bouba");
				String kikiBouba = input.next();
			}
			
			else { // For questionNumber == 3
				System.out.println("what yo gun sound like");
				String gun = input.next();
			}
			
			// ---
			
			// Based on the random fortuneNumber, one of these fortunes will be displayed.
			if(fortuneNumber == 1) {
				System.out.println("Now, here is your fortune. you will die, "
								+ "but you will die lookin like a baddie ;)");
			}
			else if(fortuneNumber == 2) {
				System.out.println("Now, here is your fortune. you will live a long happy life. "
								+ "full of dunkan and 7 brew :) ");
			}
			else { // For fortuneNumber == 3
				System.out.println("you are in fact. cew");
			}
			
		}
		else {
			System.out.println("ew u tupid try again");
		}
		
	}
}