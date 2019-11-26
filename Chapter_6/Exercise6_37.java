//	Daniel Morris
//	November 25
//	Exercise 6-37
//
//	This program prompts the user to input a number and a width and returns a formatted string


import java.util.Scanner;

class Exercise6_37 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		System.out.print("Enter a width: ");
		int width = input.nextInt();

		System.out.println(format(number, width));
	
	}
	
	public static String format(int number, int width){
	
		String stringInput = Integer.toString(number);
		int stringLength = stringInput.length();
			
		if (stringLength >= width){ 
			return stringInput;
		}
		else{
			for (int i = 0; i< width - stringLength; i++)
				stringInput = '0' + stringInput;
			return stringInput; 
		}
	}
}
//	if the length of the number is less than the width 
//	length.number - width = number of zeros
//  print 0s + number as a string
//	else print the number as a string 