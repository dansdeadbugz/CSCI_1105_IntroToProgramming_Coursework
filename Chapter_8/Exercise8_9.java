//Daniel Morris
//Intro to Programming
//Exercise 8-9
//This is a program that lets the users play tic tac toe

import java.util.Scanner;

class Exercise8_9 {
	
	public static void main(String[] args) {
	
		String[][] table = new String[3][3];
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				table[i][j] = ".";
			}
		}	
		System.out.println("Tic Tac Toe for Two");
		
		printboard(table);
		play(table);
	}
	public static void play(String[][] table){
		String turn = "X";
		Scanner input = new Scanner(System.in);
		int row = 0; 
		int column = 0;
		while (table[0][0] == "." || table[0][1] == "." || table[0][2] == "." || 
			table[1][0] == "." || table[1][1] == "." || table[1][2] == "." || 
			table[2][0] == "." || table[2][1] == "." || table[2][2] == ".") {
			System.out.println("It's " +  turn + "'s turn");
			System.out.println("Enter a Row: ");
			row = input.nextInt() - 1;
			System.out.println("Enter a Column: ");
			column = input.nextInt() - 1;
			if (table[row][column] == ".")
				table[row][column] = turn;
			else{
				System.out.println("Your input is invalid. PLease Try again.");
				if (turn == "X")
					turn = "O";
				else
					turn = "X";
			}
			printboard(table);	
			if (turn == "X")
				turn = "O";
			else
				turn = "X";
		}
		System.out.println("Game must be over now... Go eat some pie.");
		
	}
	public static void printboard(String[][] table) {	
		System.out.println("---------------------");
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				if (j == 0)
					System.out.print("| ");
				System.out.print(table[i][j] + " | ");
			}
		System.out.println("");
		}
		System.out.println("---------------------");
	}
}
		
	
	
	
	