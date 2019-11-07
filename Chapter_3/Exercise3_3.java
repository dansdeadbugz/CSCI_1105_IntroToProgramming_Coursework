//	Daniel Morris
//	Intro to Programming
//	Exercise 3 - 3
//
//	This program has the user input variables for a, b, c, d, e and f and uses cramers rule to find values for x and y
	
import java.util.Scanner;

class Exercise3_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a value for a:   ");
		double a = input.nextDouble();
		
		System.out.print("Enter a value for b:   ");
		double b = input.nextDouble();

		System.out.print("Enter a value for c:   ");
		double c = input.nextDouble();
		
		System.out.print("Enter a value for d:   ");
		double d = input.nextDouble();
		
		System.out.print("Enter a value for e:   ");
		double e = input.nextDouble();
		
		System.out.print("Enter a value for f:   ");
		double f = input.nextDouble();
		
		if((a * d) - (b * c) == 0 ){
			System.out.println("The equation has no solution");
		}
		else{
			System.out.println("Given that 	" + a + "x " +  b + "y  = " + e);
			System.out.println("And that " + c + "x " +  d + "y  = " + f);
			System.out.println("x =");
			System.out.println((( e * d ) - ( b * f )) / (( a * d ) - ( b * c )));
			System.out.println("y =");
			System.out.println((( a * f ) - ( e * c )) / (( a * d ) - ( b * c )));
			
		}
		
	}
}