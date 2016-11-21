
//CtoF.java

//This program calculates a given temperature in Celsius to Fahrenheit

public class CtoF
{
  public static void main(String[] args)
  {
      //Variable to hold the given degrees Celsius
      double degreesCelsius = 25;

      //Calucaltion of Celsius to Fahrenheit
      double degreesFahrenheit = ((degreesCelsius * 9)/5) + 32;

      //Output of calculation to terminal
      System.out.println("25 degrees Celsius is " + degreesFahrenheit + " degrees Fahrenheit");
  }
}
