/*
Author: Daniel Morris 
Date: 	November 26, 2019

Sample input/output:
	income = $200.00,   expense = $100.00,  months = 3, savings = $300.00
	income = $200.00,   expense = $100.00,  months = 6, savings = $600.00
	income = $2000.00,  expense = $800.00,  months = 3, savings = $3600.00
	income = $2000.00,  expense = $800.00,  months = 6, savings = $7200.00
*/
import java.util.Scanner;

class Mod2ExamPart1 {
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		double income  = 0.0;       // Stores the user's monthly income
		double expense = 0.0;       // Stores the user's monthly expenses
		double savings = 0.0;       // Stores the user's calculated savings
		int months = 0;             // Stores the number of months the user is saving for
		
		System.out.print("Enter your income for 1 month: $");
		income = input.nextDouble();
		
		System.out.print("Enter your expenses for 1 month: $");
		expense = input.nextDouble();
		
		System.out.print("Enter number of months you are saving: ");
		months = input.nextInt();
		
		savings = calcSavings(income, expense, months);
		// Call method to populate value for savings
		// The call statement is worth 2 pts
		
		System.out.printf("After %d months you will have saved $%.2f", months, savings);
		}   
	
	public static double calcSavings(double income, double expense, int months){
		
		double monthlySavings = (income - expense);
		double totalSavings = 0;
		
		for(int i = 1; i <= months; i++){
			totalSavings = totalSavings + monthlySavings;
		}
		return totalSavings;
	}
		// Create your method here
		// The method header is worth 2 pts
		// The method result is worth 3 pts
		// The method should contain a loop calculating savings for each month
			// The loop is worth 3 pts
}