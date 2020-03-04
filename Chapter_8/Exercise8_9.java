//Daniel Morris
//Intro to Programming
//Exercise 8-9
//This is a program that lets the users play tic tac toe

import java.util.Scanner;

class Exercise8_37 {
	public static int row, column;
	public static String[][] table = new String[3][3];
	public static Scanner input = new Scanner(System.in);
	public static String turn = "X";
	
	public static void main(String[] args) {
	
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				table[i][j] = ".";
			}
		}	
		System.out.println("Tic Tac Toe for Two");
		
		printboard();
		play();
	}
	public static void play(){
		while (row <= 3 && column <= 3){
			System.out.println("It's " +  turn + "'s turn");
			System.out.println("Enter a Row: ");
			row = input.nextInt() - 1;
			System.out.println("Enter a Column: ");
			column = input.nextInt() - 1;
			table[row][column] = turn;
			
			printboard();	
			if (turn == "X")
				turn = "O";
			else
				turn = "X";
		}	
	}
	public static void printboard() {	
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
		
	
	
	
	