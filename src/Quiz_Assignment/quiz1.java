package Quiz_Assignment;

import java.util.Scanner;

public class quiz1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a real number (like 14,25): ");
		
		double realNum = scanner.nextDouble();
		
		int integer = (int)realNum;
		double decimal = (realNum % integer);

		System.out.println("This is the integer part of your number: " + integer);
		System.out.println("This is the decimal part of your number: " + decimal);
		
	}

}
