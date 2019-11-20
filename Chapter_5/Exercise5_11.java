//	Daniel Morris
//	November 18, 2019
//	Exercise5_11
//	
// 	This is a program that will print numbers that are divisible by 5 or 6 to the console 

class Exercise5_11 {
	public static void main(String[] args) {
		System.out.println("Counting From 100 - 200");
		System.out.println("These numbers are divisible by 5 or 6 but not by both: \n");
		
		final int NUMBER_PER_LINE = 10;
		int number = 99;
		int count = 1;
		
		
		while(number < 200){
			int mod5 = number % 5;
			int mod6 = number % 6;
		
			if (mod5 == 0 || mod6 == 0){
//				if (count == 10 || count == 20 || count == 30){ 
				if (count % NUMBER_PER_LINE == 0){
					System.out.println(number+ " ");
					count ++;
				}
				else{ 
					System.out.print(number + " ");
					count ++;
				}
			}		
		number ++; 
		}
	}
}