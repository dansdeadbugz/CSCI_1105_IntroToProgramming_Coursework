//Daniel Morris
//Intro to Programming - java 
//Exercise 7 - 15
// This program stores 10 numbers in an array and uses a  method named eliminateDuplicates create a new array without the duplicates 

import java.util.Scanner;

class Exercise7_15 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10];

		System.out.println("Enter 10 numbers ");
		for (int i = 0; i < 10; i++) {
			numbers[i] = input.nextInt();
		}	
		int[] tempArray = removeDuplicateElements(numbers);
		
		System.out.println("The array without duplicates is: ");
		for (int i = 0; i < 10; i++) {
				System.out.print(tempArray[i] + " ");
			}
			

		}		
	
	public static int[] removeDuplicateElements(int[] numbers){
		 int length = numbers.length;
		 int[] arrayWitoutDuplicates = new int[length];
		 
		// use a counter
		// boolean value as a flag
		
		int count = 0;
		// boolean found = false
		
		for (int i = 0; i < length - 1; i++) {
			boolean match = false;
			for (int j = i + 1; j < length - 1; j++) {   
				
				if (numbers[i] == numbers[j]) {
					
					match = true;
				}
			}
			if (!match){
				arrayWitoutDuplicates[count] = numbers[i];
				count++;
			}

		}
		System.out.println("The number of distinct numbers is " + count );
		return arrayWitoutDuplicates;
	
	}
}
