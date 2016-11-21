
//SumOfNumbers.java

import java.util.Scanner;     // Need for the scanner class

/**
    This program askes for a positive non-zero integer.
    Once an integer is provided, it will calculate the sum
    of that number with each integer from 1 to 50 and display
    the results.
*/

public class SumOfNumbers
{
  public static void main(String[] args)
  {
    int userNumber;           // A number entered by the userNumber
    int count;                // The number of iterations to control the loop
    int sum;                  // A sentinal sum

    // Create a new Scanner
    Scanner keyboard = new Scanner(System.in);

    // Ask the user for a number
    System.out.println("This program will sum a number you enter " +
                        "to the integers 1 through 50:");
    System.out.println("Enter a positive number: ");
    userNumber = keyboard.nextInt();

    // Print an interface
    System.out.println();
    System.out.println("------------------------");
    System.out.println(" Number + Integer = Sum ");
    System.out.println("------------------------");

    // Calculate and display the sum the userNumber with integers 1 to 50
    for (count = 1; count <= 50; count++)
    {
      sum = userNumber + count;
      System.out.printf("%-9d%-9d%-9d\n", userNumber, count, sum);
    }
  }
}
