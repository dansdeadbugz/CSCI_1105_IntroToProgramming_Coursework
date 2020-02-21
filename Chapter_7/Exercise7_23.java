//Daniel Morris
//Intro to Programming - java 
//Exercise 7 - 23
// This Exercise shows which of 100 lockers are open after each of 100 students flips the lockers where the student number
// is the same as the increment of lockers being flipped.

class Exercise7_23 {
	public static void main(String[] args) {
		
		boolean[] lockers = new boolean[100];
		
		
		for (int i = 0; i <lockers.length; i++) {
			lockers[i] = true;
		}

		for (int flipper = 2; flipper <= lockers.length; flipper++) {
			for (int locker = flipper - 1; locker < lockers.length; locker = locker + flipper){
				if (lockers[locker]){
					lockers[locker] = false;
				}
				else lockers[locker] = true;
			}
				
		}		
		for (int i = 0; i < lockers.length; i++) {
			if (lockers[i] == true)
			System.out.println("locker " + (i + 1) + " is open.");
		}
	}
}
		