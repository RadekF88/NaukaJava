package course;

public class Homework {

	public static void main(String[] args) {
		int detergentDeficit = 100;		// Grams
		int shampooDeficit = 200;		// Mililiters
		int soapDeficit = 80;			// Grams
		
		int detergentExpected = 1000;	// Grams
		int shampooExpected = 500;		// Mililiters
		int soapExpected = 400;			// Grams
		
		boolean holidays = true ;
		
		if (holidays && detergentDeficit > 0) {
			int shortage = (detergentExpected / 2) - detergentDeficit;
			System.out.println("You have " + shortage + " grams of detergent.");
		}
		else if (holidays && detergentDeficit == 0) {
			int shortage = (detergentExpected / 2) - detergentDeficit;
			System.out.println("You have " + shortage + " grams of detergent.");
		}
		else if (!holidays && detergentDeficit > 0) {
			int shortage = detergentExpected - detergentDeficit;
			System.out.println("You have " + shortage + " grams of detergent.");
		}
		else if (!holidays && detergentDeficit == 0) {
			int shortage = detergentExpected - detergentDeficit;
			System.out.println("You have " + shortage + " grams of detergent.");
		}
		else {
			System.out.println("Error!");
		}
		
		if (holidays && shampooDeficit > 0) {
			int shortage = (shampooExpected / 2) - shampooDeficit;
			System.out.println("You have " + shortage + " mililiters of shampoo.");
		}
		else if (holidays && shampooDeficit == 0) {
			int shortage = (shampooExpected / 2) - shampooDeficit;
			System.out.println("You have " + shortage + " mililiters of shampoo.");
		}
		else if (!holidays && shampooDeficit > 0) {
			int shortage = shampooExpected - shampooDeficit;
			System.out.println("You have " + shortage + " mililiters of shampoo.");
		}
		else if (!holidays && shampooDeficit == 0) {
			int shortage = shampooExpected - shampooDeficit;
			System.out.println("You have " + shortage + " mililiters of shampoo.");
		}
		else {
			System.out.println("Error!");
		}
		
		if (holidays && soapDeficit > 0) {
			int shortage = (soapExpected / 2) - soapDeficit;
			System.out.println("You have " + shortage + " grams of soap.");
		}
		else if (holidays && soapDeficit == 0) {
			int shortage = (soapExpected / 2) - soapDeficit;
			System.out.println("You have " + shortage + " grams of soap.");
		}
		else if (!holidays && soapDeficit > 0) {
			int shortage = soapExpected - soapDeficit;
			System.out.println("You have " + shortage + " grams of soap.");
		}
		else if (!holidays && soapDeficit == 0) {
			int shortage = soapExpected - soapDeficit;
			System.out.println("You have " + shortage + " grams of soap.");
		}
		else {
			System.out.println("Error!");
		}
		
		
		
		
	}

}
