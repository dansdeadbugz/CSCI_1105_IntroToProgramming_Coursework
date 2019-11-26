import java.util.Scanner;

class ForLoopPracticePyramidNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of rows");
		int rows = input.nextInt();
		int column = 1;
		int spaces = (rows - 1);
				
		for (int i = 1; i <= rows; i++){								
		
			int k = 0; 
			for (int j = 1;j <= spaces; j++){
				System.out.print("  ");
			}
			for (int j = 1; j <= column; j++){	
				if(j <= i){
					k = k + 1;
				}
				else{
					k = k - 1;
				}
				System.out.print(k + " ");
			}
			System.out.println();
			column = column + 2;
			spaces--;								//next line at the end of row
		}	
	}
}