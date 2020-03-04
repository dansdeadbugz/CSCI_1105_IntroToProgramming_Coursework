//Daniel Morris
//Intro to Programming
//Exercise 8-37
//This is a program that quizzes the user on state capitals

import java.util.Scanner;

class Exercise8_37 {
	public static void main(String[] args) {
		
	String[][] stateCapitals = new String[10][2];
	
	stateCapitals[0][0] = "Alabama";
	stateCapitals[1][0] = "Alaska";
	stateCapitals[2][0] = "Arizona";
	stateCapitals[3][0] = "Arkansas";
	stateCapitals[4][0] = "California";
	stateCapitals[5][0] = "Colorado";
	stateCapitals[6][0] = "Connecticut";
	stateCapitals[7][0] = "Delaware";
	stateCapitals[8][0] = "Florida";
	stateCapitals[9][0] = "Georgia";
	
	stateCapitals[0][1] = "Montgomery";
	stateCapitals[1][1] = "Juneau";
	stateCapitals[2][1] = "Phoenix";
	stateCapitals[3][1] = "Little Rock";
	stateCapitals[4][1] = "Sacramento";
	stateCapitals[5][1] = "Denver";
	stateCapitals[6][1] = "Hartford";
	stateCapitals[7][1] = "Dover";
	stateCapitals[8][1] = "Tallahassee";
	stateCapitals[9][1] = "Atlanta";
	
	Scanner input = new Scanner(System.in);
	int count = 0;	
	
	for (int i = 0; i < stateCapitals.length; i++) {
		System.out.print("What is the capital of " + stateCapitals[i][0] + "? ");
		String answer = input.nextLine();
		
		if (stateCapitals[i][1].equalsIgnoreCase(answer)) {
			System.out.println("Great Work! Your answer is correct");
			count++;
		}
		
		else {
			System.out.println ("Wrong! The correct answer is: " + stateCapitals[i][1]);
		}
	}

	System.out.println("You got " + count + " correct!");
	}		
}