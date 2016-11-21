
//LetterCounter.java

import java.util.Scanner;         // Needed for the Scanner class
import java.lang.Character;       // Needed for the Character class

/**
    This program will count the number of times a chosen character
    appears in a given String
*/

public class LetterCounter
{
  public static void main(String[] args)
  {
    String userString;            // The string provided by the user
    String userStringLower;       // The userString lower cased
    char userLetter;              // The letter the user would like counted
    char userLetterLower;         // The userLetter lower cased
    int i;                        // The characters of the string
    int appearances = 0;          // The number of appearances of the userLetter

    // Create a Scanner
    Scanner keyboard = new Scanner(System.in);

    // Ask the user to enter a String
    System.out.println("Please enter a word or write a sentance " +
                        "that you would like to have a letter " +
                        "counted for: ");
    userString = keyboard.nextLine();
    System.out.println();

    // Ask the user to provide a letter
    System.out.println("Please provide the letter you would like counted: ");
    userLetter = keyboard.next().charAt(0);
    System.out.println();

    // Convert both inputs to lowercase
    userStringLower = userString.toLowerCase();
    userLetterLower = Character.toLowerCase(userLetter);

    for (i = 0; i < userStringLower.length(); i++)
      {
        if (userStringLower.charAt(i) == userLetterLower)
          {
            appearances++;
          }
      }
    System.out.println("The character " + userLetter + " appears " + appearances + " times.");
  }
}
