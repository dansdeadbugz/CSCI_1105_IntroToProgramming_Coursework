
		
		
/*
	Daniel Morris: 
	November 13: 

	Sample input/output:
	distance = 100,  cost = $5.00
	distance = 500,  cost = $8.00
	distance = 550,  cost = $10.00
	distance = 1000, cost = $12.00
*/
class Mod2ExamPart1 {
	public static void main(String[] args) {
		int distance = 100
		;
		double cost = 0.00;
				
				// Insert your code here
				// Each if statement is worth 2 pts - done-
		if (distance < 0)
			cost = 0.00;
		else if	(distance > 0 && distance <= 100)
			cost = 5.00;
		else if	(distance > 100 && distance <= 500)
			cost = 8.00;
		else if	(distance > 500 && distance < 1000)
			cost = 10.00;	
		else if	(distance >= 1000)
			cost = 12.00;
		
				// Turn this print statement into a printf statement - done -
				// Distance should be printed without any trailing zeroes - distance is an integer - 
				// Cost should be printed with 2 trailing zeroes - done - 
				// The printf statement is worth 2 pts - done - 
		System.out.printf("For the package to travel " + distance + " miles it would cost $%2.2f", cost ,".");
	}
}