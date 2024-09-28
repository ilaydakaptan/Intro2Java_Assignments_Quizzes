/*Write a program that randomly generates an integer between 0 and 100, inclusive. 
 * The program prompts the user to enter a number continuously until the number matches the randomly generated number. 
 * For each user input, the program tells the user whether the input is too low or too high, 
 * so the user can choose the next input intelligently. 
 */
package Quiz_Assignment;

import java.math.*;
import java.util.Scanner;

public class guessingNumber {
	
	public static void main (String[] args) {
		
		int number = (int) (Math.random() * 100);
		System.out.println("kontrol: " + number );
		
		int guess = 0;
		while (number != guess) {
			System.out.println("Guess a number between 0 and 100");
			
			Scanner scanner = new Scanner(System.in);
			guess = scanner.nextInt();
			
			if (guess > 100 || guess < 0 ) {
				System.out.println("Check your number");
			} else if (number < guess) {
				System.out.println("Your guess is higher than actual number :(");
			} else if (number > guess) {
				System.out.println("Your guess is lower than actual number :(");
			} else if (number == guess) {
				System.out.println("BINGO !");
				break;
			}			
		}	
	}
}
