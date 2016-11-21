
//NewHome.java

import java.util.Scanner; //Needed for the Scanner class
import java.text.*;       //Needed for Decimal Formatting

/**
  This program asks the user to enter a numeric test
  score and displays a letter grade for the score. The
  program uses an if-else-if statement to determine
  the letter grade.
*/

public class NewHome
{
  public static void main(String[] args)
  {
    // Create a format for decimals
    DecimalFormat df = new DecimalFormat(".##");

    // Create a Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);

    // Get the user's home price.
    System.out.print("How much did you pay for your home? ");
    double homePrice = keyboard.nextDouble();

    // Get the user's credit score.
    System.out.print("Enter your credit score (0-800): ");
    double creditScore = keyboard.nextDouble();

    // Calculate the cost of the home
    double homePriceWithHighInterest = homePrice * 1.1;        // The calculated price of the home after 10% interest
    double homePriceWithMediumInterest = homePrice * 1.07;     // The calculated price of the home after 7% interest
    double homePriceWithNormalInterest = homePrice * 1.05;     // The calculated price of the home after 5% interest
    double homePriceWithLowInterest = homePrice * 1.03;        // The calculated price of the home after 3% interest

    // Calculate the interest based on the sale price
    double highInterest = homePrice * .1;                      // The calculated 10% interest
    double mediumInterest = homePrice * .07;                   // The calculated 7% interest
    double normalInterest = homePrice * .05;                   // The calculated 5% interest
    double lowInterest = homePrice * .03;                      // The calculated 3% interest

    //Display outputs
    if (creditScore <= 500)
      System.out.println("Your home will cost $" + df.format(homePriceWithHighInterest) +
                        " and you will pay $" + df.format(highInterest) + " in interest.");
    else if (creditScore > 500 && creditScore <= 600)
      System.out.println("Your home will cost $" + df.format(homePriceWithMediumInterest) +
                        " and you will pay $" + df.format(mediumInterest) + " in interest.");
    else if (creditScore > 600 && creditScore <= 700)
      System.out.println("Your home will cost $" + df.format(homePriceWithNormalInterest) +
                        " and you will pay $" + df.format(normalInterest) + " in interest.");
    else
      System.out.println("Your home will cost $" + df.format(homePriceWithLowInterest) +
                        " and you will pay $" + df.format(lowInterest) + " in interest.");
  }
}
