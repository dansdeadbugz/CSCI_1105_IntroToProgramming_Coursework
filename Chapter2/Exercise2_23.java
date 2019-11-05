/*	
	Daniel Morris
	November 5, 2019
	
	Exercise2_23:This is a program that can estimate the cost of a trip given the price of gas, driving distance, and fuel economy 
*/
import java.util.Scanner;

class Exercise2_23{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.println("What is the name of your destination?");
		String destination = input.nextLine();	
				
		System.out.println("Enter driving distance in miles:");
		Double distance = input.nextDouble();
		
		System.out.println("How many miles per gallon does your vehicle get?");
		Double mpg = input.nextDouble();
		
		System.out.println("How much is a gallon of gas in your area?");
		Double gasPrice = input.nextDouble();
		
		Double tripCost = (distance / mpg) * gasPrice;
		
		System.out.println("The cost of driving to " + destination + " is $" + tripCost);

						
	}
}