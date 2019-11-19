//	Daniel Morris
// 	November 19th, 2019
//	Exercise 5 - 49
//
//	This is a program that will count the number of vowels in a phrase and print it to the console

import java.util.Scanner;

class Exercise5_49 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a phrase to find out the number of vowels it contains below:");
		
		String phraseRaw = input.nextLine();
		String phrase = phraseRaw.toUpperCase();
		
		int phraseLength = phrase.length();
		int vowelCount = 0;
//		int countY = 0;
		int i = 0;
		
		while (i < phraseLength) {
			if (phrase.charAt(i) == 'A' || phrase.charAt(i) == 'E' || phrase.charAt(i) == 'I' || phrase.charAt(i) == 'O' || phrase.charAt(i) == 'U') {
				vowelCount++;
			}
//			if (phrase.charAt(i) == 'Y')
//				countY++;
			i++;	
		}
		System.out.println("\n");
		System.out.println("The phrase \"" + phraseRaw + "\" has " + vowelCount + " vowels in it");
//		int yIncluded = vowelCount + countY;
		
//		if (countY > 0)
//		System.out.println("\nThe phrase contains at least one letter Y. If the Y or Ys are used as \nsvowels there could be up to  " + yIncluded + " vowels in your phrase");
		
		
		
		
		
		
	}
}