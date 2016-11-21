
//FtoC.java

//This program calculates a given temperature in Fahrenheit to Celsius

public class FtoC
{
  public static void main(String[] args)
  {
      //Variable to hold the given degrees Fahrenheit
      double degreesFahrenheit = 99;

      //Calucaltion of Fahrenheit to Celsius
      double degreesCelsius = ((degreesFahrenheit - 32) * 5)/9;

      //Output of calculation to terminal
      System.out.println("99 degrees Fahrenheit is " + degreesCelsius + " degrees Celsius");
  }
}
