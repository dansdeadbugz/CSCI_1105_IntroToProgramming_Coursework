//Daniel Morris
//Intro to Programming
//Final Project
//This program is a VIN decoder

import java.util.Scanner;

class VinDecoder {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Vehicle Identification Number: ");
		String vinString = input.nextLine();
		char [] vin = new char [17];
		vinString.getChars(0, 17, vin, 0);
		
	//findOrigin
		//System.out.print(vin[0]);
		String countryOfOrigin = "unknown country of origin";
		char element0 = vin[0];
		switch (element0){
			case '1': countryOfOrigin = "United States";
			break;
			case '4': countryOfOrigin = "United States";
			break;
			case '5': countryOfOrigin = "United States";
			break;
			case '2': countryOfOrigin = "Canada";
			break;
			case '3': countryOfOrigin = "Mexico";
			break;
			case 'J': countryOfOrigin = "Japan";
			break;
			case 'K': countryOfOrigin = "Korea";
			break;
			case 'S': countryOfOrigin = "United Kingdom";
			break;
			case 'V': countryOfOrigin = "France/Spain";
			break;
			case 'W': countryOfOrigin = "Germany";
			break;
			case 'T': countryOfOrigin = "Switzerland";
			break;
			case 'Z': countryOfOrigin = "Italy";
			break;
		}
		
		System.out.println("Country of Origin : " + countryOfOrigin);
	
	//findMake
		String make = "unknown make";
		char element1 = vin[1];
		switch (element1){
			case 'B': make = "Chrysler/Dodge";
			break;
			case 'C': make = "Chrysler/Dodge";
			break;
			case 'D': make = "Chrysler/Dodge";
			break;
			case 'F': make = "Ford";
			break;
			case 'G': make = "GMC/Cheverolet";
			break;
			case 'J': make = "Jeep";
			break;
			case 'L': make = "Lincoln";
			break;
			case 'M': make = "Mercury";
			break;
			case 'Y': make = "Mazda";
			break;
			case 'Z': make = "Ford";
			break;
			case 'T': make = "Toyota";
			break;
			case 'S': make = "Suzuki";
			break;
		}
		System.out.println("Vehicle Make : " + make);
		
	//findModel
		String model = "unknown model";
		char element2 = vin[2];
		switch (element2){
			case 'B': make = "Chrysler/Dodge";
			break;
			case 'C': make = "Chrysler/Dodge";
			break;
			case 'D': make = "Chrysler/Dodge";
			break;
		}
		System.out.println("Vehicle Model : " + model);
	}
}

// 2002 Chevy Equinox  3GNAXYEX6LS610753
// 1988 Suzuki Samurai JS4JC51V4J4157184
// 2020 Toyota Tacoma  3TMCZ5AN7LM308701
// 2010 Toyota Camry   4T1BF3EK1AU037311
//