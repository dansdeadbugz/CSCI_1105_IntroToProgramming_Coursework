//	Daniel Morris
//	Intro to Programming
//	Exercise 3 - 19
//
//	This program has the user input values for the three sides of a triangle and then calculates the perimeter
	
import java.util.Scanner;

class Exercise3_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("what is the length of side 1 of your triangle?   ");
		double side1 = input.nextDouble();
		
		System.out.print("what is the length of side 2 of your triangle?   ");
		double side2 = input.nextDouble();

		System.out.print("what is the length of side 3 of your triangle?   ");
		double side3 = input.nextDouble();;
		
		if(side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1){
			double perimeter = side1 + side2 + side3;
			System.out.println("Your triangle has a perimeter of " + perimeter);
		}
		else{
			System.out.println("Your input is invalid. The triangle youv'e described only exists in narnia");
		}
		
	}
}