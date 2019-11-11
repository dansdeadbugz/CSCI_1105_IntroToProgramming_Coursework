//	Daniel Morris
//	November 10th 2019
//	Exercise 4 - 1
//
//	This program calculates the area of a pentagon
	
import java.util.Scanner;

public class Exercise4_1 {
	public static void main(String[] args) {
		
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("What is the length from the center of the pentagon to a vertex ");
	double cToV = input.nextDouble();
	
	double side = (2 * cToV) * (Math.sin(Math.PI/5));
	double area = (5 * (side * side)) / (4 * Math.tan(Math.PI/5));

	area = Math.round(area * 100) / 100.0;

	System.out.println("The area of the pentagon is: " + area);
		
		}
}