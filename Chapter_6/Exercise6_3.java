//Daniel Morris
//November 25
//Exercise6_3
//
//This program allows the user to input an integer and tests to see if it is a palindrome



import java.util.Scanner;

class Exercise6_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an Integer:  ");
		int number = input.nextInt();
		
		if (isPalindrome(number))
			System.out.println(number + " is a palindrome!");
		else 
			System.out.println(number + " is not a palindrome.");				
	}
	
	public static boolean isPalindrome(int number){
		boolean palindrome = true;
		int backwards = reverse(number); 
		if (backwards == number){
			palindrome = true;
		}	
		else{ 
			palindrome = false; 
		}
		return palindrome;
	}
		
	public static int reverse(int number){
		int rev_num = 0;
		while (number != 0){ 
			rev_num = rev_num * 10 + number % 10; 
			number = number / 10; 
		} 
		return rev_num;	
	}	
}