/*	
	Daniel Morris
	October 31, 2019
	
	Exercise2_1:This is a program that reads a Celsius degree from the console, 
	then converts it to Fahrenheit and displays the result. 
*/
import java.util.Scanner;

class Exercise2_1{
	public static void main(String[] args) {
		double ctemp;
		double ftemp;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter Celcius Temperature: ");
		ctemp = input.nextDouble();
	
		ftemp = (( 9.0 / 5.0 ) * ctemp + 32.0);
		
	System.out.println(ctemp + " Celcius is equal to " + ftemp + " Farenheit");
						
	}
}