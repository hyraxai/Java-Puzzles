
//MPG.java

import java.util.Scanner; //Needed for the Scanner class

/**
  This program calculate a vehicle's miles per gallon.
*/

public class MPG
{
  public static void main(String[] args)
  {
    double miles;        //Miles the vehicle was driven
    double gallons;      //Gallons of fuel consumed
    double mpg;          //Calculated MPGs

    //Create a Scanner object to read input.
    Scanner keyboard = new Scanner(System.in);

    //Get the miles driven
    System.out.print("How many miles were driven? ");
    miles = keyboard.nextDouble();

    //Get the gallons of fuel consumed
    System.out.print("How many gallons of fuel were consumed? ");
    gallons = keyboard.nextDouble();

    //Compute the total sale
    mpg = (miles/gallons);

    //Display the resulting information.
    System.out.println("Miles per gallon: " + mpg );
  }
}
