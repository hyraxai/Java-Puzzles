
//SalesTax.java

import java.util.Scanner; //Needed for the Scanner class

/**
  This program calculate sales tax.
*/

public class SalesTax
{
  public static void main(String[] args)
  {
    double countySalesTax = 0.02;     //County Sales Tax is 2%
    double calculatedCountySalesTax;    //Calculated county Sales Tax
    double stateSalesTax = 0.04;      //State Sales Tax is 4%
    double calculatedStateSalesTax;    //Calculated state Sales Tax
    double purchaseAmount;            //Purchase amount requested from user
    double totalTax;                  //Calculated sum of tax
    double total;                     //Calculated total sale

    //Create a Scanner object to read input.
    Scanner keyboard = new Scanner(System.in);

    //Get the Purchase Amount
    System.out.print("What is the purchase amount? ");
    purchaseAmount = keyboard.nextDouble();

    //Compute the state sales tax
    calculatedStateSalesTax = (purchaseAmount * stateSalesTax);

    //Compute the county sales tax
    calculatedCountySalesTax = (purchaseAmount * countySalesTax);

    //Compute the total sale
    total = (purchaseAmount + ((purchaseAmount * countySalesTax) + (purchaseAmount * stateSalesTax)));

    //Compute the total tax
    totalTax = ((purchaseAmount * countySalesTax) + (purchaseAmount * stateSalesTax));

    //Display the resulting information.
    System.out.println("Purchase Amount: $" + purchaseAmount);
    System.out.println("2% County Sales Tax: $" + calculatedCountySalesTax);
    System.out.println("4% State Sales Tax: $" + calculatedStateSalesTax);
    System.out.println("Total Tax: $" + totalTax);
    System.out.println("Total: $" + total);
  }
}
