//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package Week01;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {
		System.out.println("Week 1 Lab");
		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		
		int seatsLeftOnPlane = 16;
		
		// 2. Create a variable to hold the cost of groceries at checkout
		double priceOfGroceries = 24.32;	
		
		// 3. Create a variable to hold a person's middle initial
		char middleInitial = 'H';
	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
		boolean hotOutside = true;
		
		// 5. Create a variable to hold a customer's first name
		String customerFirstName = "Nancy";
		
		// 6. Create a variable to hold a street address
		String streetAddress = "4632 N Soloman Drive";

		// 7. Print all variables to the console
		System.out.println("There are " + seatsLeftOnPlane + "seats left on the plane");
		System.out.println("The price of groceries is " + "$"+priceOfGroceries);
		System.out.println("His middle initial is " + middleInitial);
		System.out.println("It is hot outside: " + hotOutside);
		System.out.println("The customers first name is " + customerFirstName);
		System.out.println("My address is " + streetAddress);

		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
		seatsLeftOnPlane = seatsLeftOnPlane-2;
		System.out.println(seatsLeftOnPlane);
		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		
		priceOfGroceries = priceOfGroceries + 2.15;
		System.out.println(priceOfGroceries);
		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		middleInitial = 'T';
		System.out.println(middleInitial);
		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
		hotOutside = false;
		System.out.println(hotOutside);
		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
		String fullName = customerFirstName + " " + middleInitial+ " " + "Gartner";
		System.out.println(fullName);
		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
		System.out.println("Hello, my name is " + fullName + ". I live at " + streetAddress + ".");
		
		// Trey is awesome
	}
}
