package Quiz_Assignment;
import java.util.Scanner;

public class Draw_Rect_LabEx {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of patterns: ");
		int patternNum = scanner.nextInt();
		
		for(int i = 1; i <= patternNum; i++) {
			
			System.out.println("Row "+ i + ": ");
			int row = scanner.nextInt();		
			System.out.println("Column "+ i + ": ");
			int column = scanner.nextInt();
			
			for(int j = 0; j < row; j++) {
				for(int k = 0; k < column; k ++){
					System.out.print("*"); 	// yanyana çizdirmek için print
				}
				System.out.println(); 	// alt satıra geçmesi için
			}
		}
	}
}

