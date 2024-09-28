package Quiz_Assignment;
import java.util.Scanner;

public class LaunchTime_LabEx {

	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first hour (between 0-23): ");
		int h1 = scanner.nextInt();
		System.out.println("Enter first minute (between 0-59): ");
		int m1 = scanner.nextInt();
		System.out.println("Enter second hour (between 0-23): ");
		int h2 = scanner.nextInt();
		System.out.println("Enter second minute (between 0-59): ");
		int m2 = scanner.nextInt();
		
		if(gap(h1,m1,h2,m2)) {
			System.out.println("You can eat lunch!"); 
		} else {
			System.out.println("You can NOT eat lunch!"); 
		}
	}
	
	public static boolean gap(int h1, int m1, int h2, int m2) {
		int gap;
		
		if(h1 < h2) {
			gap = (60-m1) + m2;
		} else if(h1 == h2) {
			gap = Math.max(m1, m2) -  Math.min(m1, m2);
		} else {
			gap = (60-m2) + m1;
		}
		
		if(gap >= 45) {
			return true;
		}else {
			return false;
		}
	}
}
