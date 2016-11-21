
//CelsiusConverter.java

import java.util.Scanner; //Needed for the Scanner class

/**
  This program converts an entered Celsius degree to Fahrenheit.
*/

public class CelsiusConverter
{
  public static void main(String[] args)
  {
      double degreesCelsius;      //Degrees in celsius entered by the user
      double degreesFahrenheit;   //Calculated degrees in Fahrenheit

      //Create a Scanner object to read input.
      Scanner keyboard = new Scanner(System.in);

      //Get the degrees in Celsius to be calculated
      System.out.print("Enter the degrees in Celsius to be converted into Fahrenheit: ");
      degreesCelsius = keyboard.nextDouble();

      //Calculate Celsius to Fahrenheit
      degreesFahrenheit = ((degreesCelsius * 9)/5) + 32;

      //Display the resulting information.
      System.out.println(degreesCelsius + " degrees Celsius is " + degreesFahrenheit + " degrees Fahrenheit");
  }
}
