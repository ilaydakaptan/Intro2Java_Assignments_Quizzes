package Quiz_Assignment;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Think of a number between 0 and 100.");

        int lowerBound = 0;
        int upperBound = 100;
        int attempts = 5;

        while (attempts > 0) {
            int guess = makeGuess(lowerBound, upperBound);
            System.out.println("Is the number " + guess + "?");
            System.out.print("Enter 'higher', 'lower', or 'correct': ");

            String userResponse = getUserResponse(scanner);

            if (userResponse.equals("correct")) {
                System.out.println("The computer guessed the correct number :)");
                break;
            } else if (userResponse.equals("higher")) {
                lowerBound = guess + 1;
            } else if (userResponse.equals("lower")) {
                upperBound = guess - 1;
            } else {
                System.out.println("Invalid input. Please enter 'higher', 'lower', or 'correct'.");
                continue; 
            }

            attempts--;
        }

        if (attempts == 0) {
            System.out.println("The computer couldn't guess the number in 5 attempts :(");
        }

        scanner.close();
    }

    private static int makeGuess(int lowerBound, int upperBound) {
        return (int) (Math.random() * (upperBound - lowerBound + 1)) + lowerBound;
    }

    private static String getUserResponse(Scanner scanner) {
        String response = scanner.nextLine().toLowerCase();
        while (!response.equals("higher") && !response.equals("lower") && !response.equals("correct")) {
            System.out.println("Invalid input. Please enter 'higher', 'lower', or 'correct':");
            response = scanner.nextLine().toLowerCase();
        }
        return response;
    }
}
