package Quiz_Assignment;

import java.util.Scanner;

public class SubstringCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the main text: ");
        String mainText = scanner.nextLine();

        System.out.print("Enter the substring to count: ");
        String substring = scanner.nextLine();

        int count = countSubstring(mainText, substring);
        System.out.println("Number of occurrences: " + count);

        scanner.close();
    }

    public static int countSubstring(String mainText, String substring) {
        int mainLength = mainText.length();
        int subLength = substring.length();

        // Base case: if the remaining part is shorter than the substring, no more counts can be made
        if (mainLength < subLength) {
            return 0;
        }

        // Check if the current substring matches the specified substring
        if (mainText.substring(0, subLength).equals(substring)) {
            // If there is a match, increment count and recursively check the rest of the text
            return 1 + countSubstring(mainText.substring(subLength), substring);
        } else {
            // If no match, move to the next character and continue checking recursively
            return countSubstring(mainText.substring(1), substring);
        }
    }
}
