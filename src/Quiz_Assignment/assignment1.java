package Quiz_Assignment;

public class assignment1 {

	public static void main(String[] args) {
		
        // Cumulative change rate at November
		double novInterestRate = 1.0;
		
        for (int i = 6; i <= 10; i++) {
            double monthlyInterest = 0.0;
            switch (i) {
                case 6: monthlyInterest = 3.92; break;
                case 7: monthlyInterest = 9.49; break;
                case 8: monthlyInterest = 9.09; break;
                case 9: monthlyInterest = 4.75; break;
                case 10: monthlyInterest = 3.43; break;
            }
            novInterestRate *= (1 + monthlyInterest / 100);
        }
        
        // Cumulative change rate at December
        double decInterestRate = 1.0;
  
        for (int i = 6; i <= 11; i++) {
            double monthlyInterest = 0.0;
            switch (i) {
                case 6: monthlyInterest = 3.92; break;
                case 7: monthlyInterest = 9.49; break;
                case 8: monthlyInterest = 9.09; break;
                case 9: monthlyInterest = 4.75; break;
                case 10: monthlyInterest = 3.43; break;
                case 11: monthlyInterest = novInterestRate; break;
            }
            decInterestRate *= (1 + monthlyInterest / 100);
        }

        System.out.println("Percentage change in November: " + (novInterestRate - 1) * 100 + " %");
        System.out.println("Percentage change in December: " + (decInterestRate - 1) * 100 + " %");

        double minimumWage = 11402.0;
        
        for (int completedYearsOfWork = 0; completedYearsOfWork <= 10; completedYearsOfWork++) {
            double salary = 0.0 ;

            switch (completedYearsOfWork) {
            	case 0: 
            		salary = minimumWage;
                    break;
                case 1: 
                    salary = minimumWage * decInterestRate;;
                
                	if (salary <= 13000) {
                		salary = Math.max(13000, salary);
                    
                	} else if (salary >= 18000){
                		salary = Math.min(18000, salary);
                	}
                    break;
                case 2:
                	salary = minimumWage * decInterestRate;
                	break;
                case 3:
                    salary = (minimumWage * 1.3 * decInterestRate) + 3000;
                    break;
                case 4: 
                	salary = (minimumWage * 1.3 * decInterestRate);
                    break;
                case 5:
                    salary = (minimumWage * 1.5 * decInterestRate) + 5000;
                    break;
                case 6, 7, 8, 9:
                	salary = (minimumWage * 1.5 * decInterestRate);
                	break;
                case 10:
                    salary = (minimumWage * 2.0 * decInterestRate) + 10000;
                    break;
            }
            System.out.println(completedYearsOfWork + " Years worker's salary: " + salary);
        }
    }
}
