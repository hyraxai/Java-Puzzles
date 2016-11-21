
//RestaurantBill.java

import java.util.Scanner; //Needed for the Scanner class

/**
  This program calculates tip and tax of a restaurant meal.
*/

public class RestaurantBill
{
  public static void main(String[] args)
  {
      double taxPercent = 0.0625;          //Sales tax percentage
      double tax;                          //The calucated tax
      double tipPercent = 0.2;             //Tip percentage
      double tip;                          //The calculated tip
      double mealCharge;                   //Cost of the meal
      double mealChargeWithTax;            //Cost of the meal with tax
      double mealChargeWithTaxAndTip;      //Cost of the meal with tax and tip

      //Create a Scanner object to read input.
      Scanner keyboard = new Scanner(System.in);

      //Get the cost of the meal
      System.out.print("What was the total cost of the meal before tax? ");
      mealCharge = keyboard.nextDouble();

      //Calculate the tax and the total with tax (but without tip)
      tax = (mealCharge * taxPercent);
      mealChargeWithTax = (tax + mealCharge);

      //Calculate the tip
      tip = (mealChargeWithTax * tipPercent);

      //Calculate the total for the meal with tax and tip
      mealChargeWithTaxAndTip = (mealChargeWithTax + tip);

      //Display the resulting information.
      System.out.println("\tMeal Charge: $" + mealCharge);
      System.out.println("\tTax: $" + tax);
      System.out.println("\tTip: $" + tip);
      System.out.println("\tTotal: $" + mealChargeWithTaxAndTip);
  }
}
