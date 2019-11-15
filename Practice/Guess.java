import java.util.Scanner;

class Guess {
	public static void main(String[] args) {
		int magicNumber = (int)(Math.random() * 101);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Guess the number, it's between 1 and 100");
		int guess = -1;
		
				
		while (guess != magicNumber){
			
			System.out.print("Enter Your Guess:  ");
			guess = input.nextInt();
			
			if (guess == magicNumber)
				System.out.println("That's Right you son of a gun you!");
			else if (guess > magicNumber)
				System.out.println("Your guess was too high... Like snoop dogg. Try again.");
			else 
				System.out.println("Your guess was too low. Try again.");
		
		}
		
		
	}
}