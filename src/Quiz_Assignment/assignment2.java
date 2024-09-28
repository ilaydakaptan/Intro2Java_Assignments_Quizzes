/*Write a Java program including a method named compare which takes two strings as parameters 
and returns whether both strings have same pattern. You must generate some rules to decide whether
strings have the same character pattern using the following examples while designing your algorithm. 

Note 1: You are not allowed to create extra strings, arrays and use any data structures.
Note 2: The compare() method must return true or false for any two strings, not just for the
examples below.
Note 3: The compare() method should return the same boolean value regardless the order of strings.*/


package Quiz_Assignment;

import java.util.Scanner;

public class assignment2 {
	
	public static boolean compare(String word1, String word2) {
		
		if (word1.length() != word2.length()) {					
			return false;
			
		}else {	
			
			int counter = 0;			
			for(int i = 0; i <= word1.length() - 1 ; i++) {		
				if(word1.charAt(i) == word2.charAt(i)) {
					counter +=1; 					
				}				
			}
			
			if(counter == word1.length()) {
				return true;
			} else {
				return false; 
			}			
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your first string");	
		String word1 = scanner.nextLine();
		
		System.out.println("Please enter your second string");	
		String word2 = scanner.nextLine();
		
		if (compare(word1, word2) == true) {
			System.out.println( word1 + " and " + word2 + " are equal (true)" );
		} else {
			System.out.println( word1 + " and " + word2 + " are NOT equal (false)" );
		}			
	}
}
