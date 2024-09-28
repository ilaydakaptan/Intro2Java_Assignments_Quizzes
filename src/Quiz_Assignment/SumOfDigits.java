package Quiz_Assignment;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer between 100 and 1000: ");
        int number = scanner.nextInt();

        // Check if the entered number is within the specified range
        if (number >= 100 && number <= 1000) {
            int digit = number % 10; // Extract the last digit
            int sum = 0;

            // Check if all digits are the same
            while (number > 0) {
                if (number % 10 != digit) {
                    sum = 0;
                    break;
                }
                sum += number % 10;
                number /= 10;
            }

            // Print the result
            if (sum > 0) {
                System.out.println("Sum of digits: " + sum);
            } else {
                System.out.println("Not all digits are the same. Sum is 0.");
            }
        } else {
            System.out.println("Please enter a valid integer between 100 and 1000.");
        }

        scanner.close();
    }
}
