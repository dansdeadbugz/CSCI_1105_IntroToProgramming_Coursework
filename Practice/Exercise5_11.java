//	Daniel Morris
//	November 18, 2019
//	Exercise5_11
//	
// 	This is a program that will print numbers that are divisible by 5 or 6 to the console 


class Exercise5_11 {
	public static void main(String[] args) {
		System.out.println("Counting From 100 - 200");
		System.out.println("These numbers are divisible by 5 or 6 but not by both: \n");
		
		int number = 99;
		
		
		while(number < 201){
			int mod5 = number % 5;
			int mod6 = number % 6;
			
			if (mod5 == 0 || mod6 == 0)
				System.out.print(number + " ");
			
			number++;
			 
		}
	}
}