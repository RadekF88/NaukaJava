package course;

public class Homework {

	public static void main(String[] args) {
		int detergent = 150;	// Grams
		int shampoo = 200;		// Mililiters
		int soap = 80;			// Grams
		
		int detergentExpected = 1000;	// Grams
		int shampooExpected = 500;		// Mililiters
		int soapExpected = 100;			// Grams
		
		boolean holidays = true;
		
		if (detergent < detergentExpected) {
			int shortage = detergentExpected - detergent;
			System.out.println("You need to buy " + shortage + " grams of detergent.");
		}
		else {
			System.out.println("You have enough detergent!");
		}
		
		
		if (holidays && shampoo < shampooExpected / 2) {
			int shortage = (shampooExpected / 2) - shampoo;
			System.out.println("You need to buy " + shortage + " mililiters of shampoo.");
		}
		else if (!holidays && shampoo < shampooExpected) {
			int shortage = shampooExpected - shampoo;
			System.out.println("You need to buy " + shortage + " mililiters of shampoo.");
		}
		else {
			System.out.println("You have enough shampoo!");
		}
		
		
		if (holidays & soap < soapExpected / 2) {
			int shortage = (soapExpected / 2) - soap;
			System.out.println("You need to buy " + shortage + " grams of soap.");
		}
		else if (!holidays && soap < soapExpected) {
			int shortage = soapExpected - soap;
			System.out.println("You need to buy " + shortage + " grams of soap.");
		}
		else {
			System.out.println("You have enough soap!");
		}
		
		
	}

}
