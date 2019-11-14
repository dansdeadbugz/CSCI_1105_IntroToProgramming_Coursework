/*
Daniel Morris 
November 13

Sample input/output:
	pckType = "env",   aCost = $0.00
	pckType = "sBox",  aCost = $3.00
	pckType = "mBox",  aCost = $10.00
	pckType = "lBox",  aCost = $15.00
*/
class Mod2ExamPart2 {
	public static void main(String[] args) {
		String pckType = "sBox";
		double aCost = 0.0;
		
		switch(pckType) {
			// The first case is optional
			case "env":
				aCost = 0;
				break;
			case "sBox":
				aCost = 3;
				break;
			case "mBox":
				aCost = 10;
				break;
			case "lBox":
				aCost = 15;
				break;
		}
		System.out.printf("The package type %s costs an additional $%.2f." , pckType, aCost);
	}
}