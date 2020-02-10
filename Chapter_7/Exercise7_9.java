import java.util.Scanner;

class Exercise7_9 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double[] a = new double[10];

		System.out.println("Enter 10 numbers ");
		for (int i = 0; i < 10; i++) {
			a[i] = input.nextDouble();
		}
		
		System.out.println("the minimum value is :" + min(a));	
	}
			
	public static double min(double[] array) {
		double min = array[0];
	
		for (int i = 0; i < 10; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
}
