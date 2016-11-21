
//LargestAndSmallest.java

import java.util.Scanner;     // Needed for the scanner class

public class LargestAndSmallest
{
	public static void main(String[] args)
  {

		double value;      	 // Store user input
		double smallest;     // Smallest value
		double largest = 0;  // Larget value

		// Create Scanner object
		Scanner keyboard = new Scanner(System.in);

		// Provide program information
		System.out.println("Enter a series of numbers, when fishined enter '-99'");

		// Get a number from the user
		System.out.print("Enter a number: ");
		value = keyboard.nextDouble();

		// Assign first value as smallest
		smallest = value;

    // Begin a while loop to continue getting numbers from the user
		while(value != -99)
    {
			System.out.print("Enter a number: ");
			value = keyboard.nextDouble();
			if(value != -99)
      {
				if (value > smallest)
					largest = value;
				else
					smallest = value;
			}
		}

		// Display largest and smallest value
		System.out.println("Smallest Value: " + smallest);
    System.out.println("Largest Value: " + largest);
	}
}
