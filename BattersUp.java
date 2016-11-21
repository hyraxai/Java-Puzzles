
//BattersUp.java

import java.util.Scanner; //Needed for the Scanner class
import java.text.*;       //Needed for Decimal Formatting

/**
  This program calculates a batting average based on input from
  the user.
*/

public class BattersUp
{
  public static void main(String[] args)
  {

    DecimalFormat df = new DecimalFormat(".###");

    double atBats;          // Number of at bats
    double hits;            // Number of hits
    double average;         // Batting average

    //Create a Scanner object to read input.
    Scanner keyboard = new Scanner(System.in);

    // Get the number of at bats.
    System.out.print("How many at bats have you had? ");
    atBats = keyboard.nextDouble();

    // Get the number of hits.
    System.out.print("How many hits have you attained? ");
    hits = keyboard.nextDouble();

    // Calculate the batting average
    average = (hits / atBats);

    //Print the information
    System.out.println("Your total at bats: " + atBats);
    System.out.println("The number of hits you've attained: " + hits);
    System.out.println("Your batting average is " + df.format(average));

    if (average > 400)
      System.out.print("You're going to the Allstars!");
  }

}
