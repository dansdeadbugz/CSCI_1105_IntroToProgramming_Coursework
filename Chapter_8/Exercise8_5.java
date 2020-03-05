//Daniel Morris
//Intro to Programming - java 
//Exercise 8 - 5
// This Exercise adds two 3 x 3 arrays

import java.util.Scanner;
import java.nio.file.*;

class Exercise8_5 {
	public static void main(String[] args) {
		
		double [][] a = new double [3][3];
		System.out.println("Enter 9 values for Array A ");
		
		Scanner input = new Scanner(System.in);
		for (int row = 0; row < 3; row++) {
			for (int column = 0; column < 3; column++) {
				a[row][column] = input.nextDouble();
			}
		}		
		
		double [][] b = new double [3][3];
		System.out.println("Enter 9 values for Array B ");
		for (int row = 0; row < 3; row++) {
			for (int column = 0; column < 3; column++) {
				b[row][column] = input.nextDouble();
			}
		}
		double [][] c = new double [3][3];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j< 3; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		/*
		c[0][0] = a[0][0] + b[0][0];
		c[0][1] = a[0][1] + b[0][1];
		c[0][2] = a[0][2] + b[0][2];
		c[1][0] = a[1][0] + b[1][0];
		c[1][1] = a[1][1] + b[1][1];
		c[1][2] = a[1][2] + b[1][2];
		c[2][0] = a[2][0] + b[2][0];
		c[2][1] = a[2][1] + b[2][1];
		c[2][2] = a[2][2] + b[2][2];
		*/
		
		System.out.println("---------------");	
		System.out.println("Array A + B is:");
		System.out.println("");	
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j< 3; j++) {
			System.out.print (c[i][j] + " ");
			}
			System.out.println("");
		}
	}
}