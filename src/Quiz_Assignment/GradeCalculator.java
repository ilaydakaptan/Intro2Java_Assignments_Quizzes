package Quiz_Assignment;

import java.util.Scanner;

public class GradeCalculator {
	
	public static int midtermGrade(String studentNum) {
		
		int firstNum = Integer.valueOf(String.valueOf(studentNum.charAt(0)));
		int secondNum = Integer.valueOf(String.valueOf(studentNum.charAt(1)));

		return (firstNum * 10) + secondNum; 
	}
	

	public static int finalGrade(String studentNum) {
		
		int firstNum = Integer.valueOf(String.valueOf(studentNum.charAt(2)));
		int secondNum = Integer.valueOf(String.valueOf(studentNum.charAt(3)));
		
		return (firstNum * 10) + secondNum; 
	}
	
	
	public static int quiz1(String studentNum) {
		
		int firstNum = Integer.valueOf(String.valueOf(studentNum.charAt(4)));
		int secondNum = Integer.valueOf(String.valueOf(studentNum.charAt(5)));

		return (firstNum * 10) + secondNum; 
	}

	
	public static int quiz2(String studentNum) {
		
		int firstNum = Integer.valueOf(String.valueOf(studentNum.charAt(6)));
		int secondNum = Integer.valueOf(String.valueOf(studentNum.charAt(7)));
		
		return (firstNum * 10) + secondNum; 
	}
	

	public static int quiz3(String studentNum) {
		
		int firstNum = Integer.valueOf(String.valueOf(studentNum.charAt(8)));
		int secondNum = Integer.valueOf(String.valueOf(studentNum.charAt(9)));
		
		return (firstNum * 10) + secondNum; 
	}
	

	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your student number: (ex: 20010102300) \n");
		String studentNum = scanner.nextLine();
			
		double midterm_grade = midtermGrade(studentNum);
		System.out.println("\nMidterm : " + midterm_grade);
		
		double final_grade = finalGrade(studentNum);
		System.out.println("Final   : " + final_grade);
		
		double quiz1_grade = quiz1(studentNum);
		System.out.println("Quiz 1  : " + quiz1_grade);
		
		double quiz2_grade = quiz2(studentNum);
		System.out.println("Quiz 2  : " + quiz2_grade);
		
		double quiz3_grade = quiz3(studentNum);
		System.out.println("Quiz 3  : " + quiz3_grade);
		
		double total_grade = (midterm_grade * (30.0 / 100.0)) + 
								(final_grade * (55.0 / 100.0)) + 
									(quiz1_grade * (5.0 / 100.0)) + 
										(quiz2_grade * (5.0 / 100.0)) +
											(quiz3_grade * (5.0 / 100.0));
									
		System.out.println("\nYour end of the year grade is: " + total_grade);
		
	}
}
