package course;

import java.util.Scanner;

public class Homework2PKB {
	
	public static void showOne (int [] pkb) {
		Scanner read = null;
	try {
	  read = new Scanner(System.in);
	  
	  System.out.print("Select year: 200");
	  int year = read.nextInt();
	  
	  if (year <= 9) {
		System.out.println("200" + year + ": " + pkb[year]);  
	  }
	  else {
	    System.out.println("Wrong value"); 
	  }
	
	}
	finally {
	  if (read != null) read.close();
		
	}	
		
	}
	public static void showAverage (int [] pkb) {
		double average = 0;
		double suma = 0;
		for (int i = 0; i < pkb.length; i++) {
		  suma += pkb[i];
		  average = suma / pkb.length;
		}
		System.out.println("Average: " + average);	
	}
	
	public static void showMin (int [] pkb) {
		
		int min = pkb[0];
		for (int i = 1; i < pkb.length; i++) {
		  if (pkb [i] < min)
		    min = pkb[i];
		}
		System.out.println("Lowest value:" + min);
	}

	public static void showMax (int [] pkb) {
		
		int max = pkb[0];
		for (int i = 0; i < pkb.length; i++) {
		  if (pkb [i] > max)
			max = pkb[i];  
		} 
		System.out.println("Highest value" + max);
	}
	public static void showAll(int [] pkb) {
		
		for (int  i = 0; i < pkb.length;  i++) {
		  System.out.println("200" + i + ": " + pkb[i]);
		}
	}
	
	
	public static void main(String [] args) {
		
		int pkb [] = {19527, 20391, 21203, 
				22148, 24438, 25955, 28056, 
				31158, 33741, 35966};
		
		showAll(pkb); 
		showMin(pkb);
		showMax(pkb);
		showAverage(pkb);
		showOne(pkb);
	}

}

