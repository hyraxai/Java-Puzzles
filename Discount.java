
//Discount.java

//This program calculates the sale price of an item that is regularly
//priced at $59, with a 20 percent discount subtracted.

public class Discount
{
  public static void main(String[] args)
  {
      //Variables to hold the regular price, the amount of a discount
      //and the sale price.
      double regularPrice = 59.0;
      double discount;
      double salePrice;

      //Calculate the amount of a 20% discount.
      discount = regularPrice * 0.2;

      //Calculate the sale price by subtracting the discount from the
      //regular price.
      salePrice = regularPrice - discount;

      //Display the results.
      System.out.println("Regular Price: $" + regularPrice);
      System.out.println("Dicount amount Price: $" + discount);
      System.out.println("Sale Price: $" + salePrice);
  }
}
