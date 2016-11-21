
//FahrenheitConverter.java

import java.util.Scanner; //Needed for the Scanner class

/**
  This program converts an entered Fahrenheit degree to Celsius.
*/

public class FahrenheitConverter
{
  public static void main(String[] args)
  {
      double degreesFahrenheit;   //Degrees in Fahrenheit entered by the user
      double degreesCelsius;      //Calculated degrees in celsius

      //Create a Scanner object to read input.
      Scanner keyboard = new Scanner(System.in);

      //Get the degrees in Fahrenheit to be calculated
      System.out.print("Enter the degrees in Fahrenheit to be converted into Celsius: ");
      degreesFahrenheit = keyboard.nextDouble();

      //Calculate Fahrenheit to Celsius
      degreesCelsius = ((degreesFahrenheit - 32) * 5)/9;

      //Display the resulting information.
      System.out.println(degreesFahrenheit + " degrees Fahrenheit is " + degreesCelsius + " degrees Celsius");
  }
}
