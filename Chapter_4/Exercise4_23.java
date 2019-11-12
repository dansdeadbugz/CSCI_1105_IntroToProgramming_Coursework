/*	
	Daniel Morris
	November 5, 2019
	
	Exercise4_23:This is a program that prints a payroll Statement
*/

import java.util.Scanner;

class Exercise4_23{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter Employee's name:               ");
		String name = input.nextLine();	
				
		System.out.print("Enter Number of hours worked:        ");
		double hours = input.nextDouble();
		
		System.out.print("Enter hourly pay rate:              $");
		double payRate = input.nextDouble();
		
		System.out.print("Enter Federal Tax withholding rate:   ");
		double fedTax = input.nextDouble();
		
		System.out.print("Enter State Tax withholding rate:     ");
		double stateTax = input.nextDouble();
		
		double grossPay = hours * payRate;
		double fedWitholding = grossPay * fedTax;
		double stateWitholding = grossPay * stateTax;
		double totalDeduction = fedWitholding + stateWitholding;
		double netPay = grossPay - totalDeduction;
		
		grossPay = Math.round(grossPay * 100) / 100.0;
		fedWitholding = Math.round(fedWitholding * 100) / 100.0;
		stateWitholding = Math.round(stateWitholding * 100) / 100.0;
		totalDeduction = Math.round(totalDeduction * 100) / 100.0;
		netPay = Math.round(netPay * 100) / 100.0;
				
		System.out.println("");
		System.out.println("");
		System.out.println("Employee Name:  " + name);
		System.out.println("Hours Workded:  " + hours + "hrs");
		System.out.println("Pay Rate:       $" + payRate);
		System.out.println("Gross Pay:      $" + grossPay);
		System.out.println("Deductions:");
		System.out.println("            Federal Withholding (" + (fedTax * 100) + "%):   $" + fedWitholding);
		System.out.println("            State Withholding (" + (stateTax * 100) + "%):     $" + stateWitholding);
		System.out.println("            Total Deduction              $" + totalDeduction);
		System.out.println("Net Pay:         $" + netPay);

						
	}
}