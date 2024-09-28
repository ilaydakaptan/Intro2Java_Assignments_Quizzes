//İLAYDA KAPTAN 200101023

// P(1) = 15*((1+r)^1) = a --> June
// P(2) = a((1+r)^2)   = b --> July
// P(3) = b((1+r)^3)   = c --> Aug 		Aug is 850, find r first	
// P(4) = c((1+r)^4)   = d --> Sep  
// P(5) = d((1+r)^5)   = e --> Oct
// P(6) = e((1+r)^6)   = f --> Nov
// P(7) = f((1+r)^2)   = g --> Dec
// P(8) = g((1+r)^2)   = h --> Jan
// P(9) = h((1+r)^2)   = i --> Feb

package Quiz_Assignment;

public class EbolaCases {

	private static double rateValue(int initialCases, int finalCases, int monthsPassed) {
		
        return Math.pow((double) finalCases / initialCases, 1.0 / monthsPassed) - 1;
    }
	

    private static double estimate(int initialCases, double growthRate, int months) {
    	
        return initialCases * Math.pow(1 + growthRate, months);
    }
	
    public static void main(String[] args) {

        int initialCases = 15;
        int finalCases = 850;
        int monthsPassed = 3; // From May to August 

        double growthRate = rateValue(initialCases, finalCases, monthsPassed);

        int monthsToFebruary2015 = 9;
        double estimatedCases = estimate(initialCases, growthRate, monthsToFebruary2015);

        System.out.println("Estimated number of February 2015: " + (int) estimatedCases);
    }   
}


