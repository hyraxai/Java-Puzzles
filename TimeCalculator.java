
//TimeCalculator.java

import java.util.Scanner; //Needed for the Scanner class

/**
  This program asks the user to enter a a number of seconds
  and calculates the number of minutes then displays the answer
*/

public class TimeCalculator
{
  public static void main(String[] args)
  {
    double seconds;         // Number of seconds entered by the user
    double minutes;            // The calculated number of minutes
    double hours;              // The calculated number of hours
    double days;               // The calculated number of days

    //Create a Scanner object to read input.
    Scanner keyboard = new Scanner(System.in);

    // Get the seconds.
    System.out.print("Enter any number of seconds over 60: ");
    seconds = keyboard.nextDouble();

    // Calculate the number of minutes, hours, and days
    minutes = (seconds)/60;
    hours = (seconds)/3600;
    days = (seconds)/86400;

    // Display the grade.
    if (seconds <= 60)
      System.out.println("Enter a number greater than 60");
    else if ((seconds >= 60) && (seconds < 3600))
      System.out.println(seconds + " seconds contains " + minutes + " minute(s)");
    else if ((seconds >= 3600) && (seconds < 86400))
      System.out.println(seconds + " seconds contains " + hours + " hours(s)");
    else if (seconds >= 86400)
      System.out.println(seconds + " seconds contains " + days + " days(s)");

  }
}
