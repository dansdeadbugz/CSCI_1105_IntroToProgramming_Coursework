import java.util.Scanner;

class ForLoopPracticePyramid {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of rows");
		int rows = input.nextInt();
				
		for (int i = 1; i <= rows; i++){						//ROWS
			for(int space = 1; space <= rows - i; space++){		//SPACES
				System.out.print("  ");
			}
			for (int star = 1; star <= (i * 2 - 1); star++){	//STARS
				System.out.print("* ");
			}
			System.out.println();								//next line at the end of row
		}	
	}
}