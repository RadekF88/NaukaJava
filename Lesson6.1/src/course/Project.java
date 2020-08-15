package course;

public class Project {

	public static void main(String[] args) {
		int cheese = 200;	// Grams
		int milk = 4;		// Liters
		int eggs = 10;
		
		int cheeseExpected = 300;	//Grams
		int milkExpected = 5;		//Liters
		int eggsExpected = 20;
		
		boolean party = true;
		
		if (cheese < cheeseExpected) {
			int shortage = cheeseExpected - cheese;
			System.out.println("You need to buy " + shortage + " grams of cheese.");
		}
			
		if (party && milk < milkExpected * 3) {	
			int shortage = (milkExpected * 3) - milk;
			System.out.println("You need to buy " + shortage + " liters of milk.");
		}
		
		else if (milk < milkExpected) {
			int shortage = milkExpected - milk;
			System.out.println("You need to buy " + shortage + " liters of milk.");
		}
		if (party && eggs < eggsExpected * 2) {
			int shortage = (eggsExpected * 2) - eggs;
			System.out.println("You need to buy " + shortage + " eggs.");
		}
		else if (eggs < eggsExpected) {
			int shortage = eggsExpected - eggs;
			System.out.println ("You need to buy " + shortage + " eggs.");
		}
	}

}
