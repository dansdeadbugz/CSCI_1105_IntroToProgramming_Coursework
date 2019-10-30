//	Daniel Morris
//	October 30
//	This program uses cramers rule to solve two linear equations

public class Exercise1_13 {
	public static void main(String[] args) {
		System.out.println("Given that 	3.4x + 50.2y = 44");
		System.out.println("And		2.1x + 0.55y = 59");
		System.out.println("x =");
		System.out.println(((44.5 * .55) - (50.2 * 5.9)) / ((3.4 * .55) - (50.2 * 2.1)));
		System.out.println("y =");
		System.out.println(((3.4 * 5.9) - (44.9 * 2.1)) / ((3.4 * .55) - (50.2 * 2.1)));
	}
}