
//RomanNumerals.java

import java.util.Scanner;

/**
  This program converts the numbers from 1 to 10 into
  Roman Numerals
*/

public class RomanNumerals
{
  public static void main(String[] args)
  {
      String input;

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Get a number from the user.
      System.out.print("Enter a number between 1 and 10: ");
      input = keyboard.nextLine();

      // Convert the number to a Roman Numeral.
      switch (input)
      {
        case "1":
          System.out.println("I");
          break;
        case "2":
          System.out.println("II");
          break;
        case "3":
          System.out.println("III");
          break;
        case "4":
          System.out.println("IV");
          break;
        case "5":
          System.out.println("V");
          break;
        case "6":
          System.out.println("VI");
          break;
        case "7":
          System.out.println("VII");
          break;
        case "8":
          System.out.println("VIII");
          break;
        case "9":
          System.out.println("IX");
          break;
        case "10":
          System.out.println("X");
          break;
        default:
          System.out.println("Please enter a number between 1 and 10:\n"
                    + "not less than 1 and not to exceed 10");
      }

  }
}
