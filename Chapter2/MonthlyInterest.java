//	Daniel Morris
//	November 4
//	This is a program that can calculate interest after a six month period

import java.util.Scanner;

class MonthlyInterest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("How much do you save every month? ");
		double monthlySavings = input.nextDouble();
		
		System.out.println("What is yout annual interest rate? (please exclude percent symbol)");
		double interestA = input.nextDouble();
				
		double interest = interestA / 1200;
				
		double month1 = monthlySavings * (1 + interest);
		double month2 = (monthlySavings + month1) * (1 + interest);
		double month3 = (monthlySavings + month2) * (1 + interest);
		double month4 = (monthlySavings + month3) * (1 + interest);
		double month5 = (monthlySavings + month4) * (1 + interest);
		double month6 = (monthlySavings + month5) * (1 + interest);

		
		System.out.println("After six months of saving $" + monthlySavings + " a month, you would have $" + month6 + " if the annual interest rate was " + interestA + "%");
		
		
		
	}
}