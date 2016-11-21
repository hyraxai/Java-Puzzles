
//SalesPrediction.java

// This program predicts the sales of a company's sales division

public class SalesPrediction
{
  public static void main(String[] args)
  {
      //Variables to hold the sales data
      double totalyearlySales = 4600000;

      //Calculate sales prectiction of the East Coast division
      double salesPrediction = totalyearlySales * 0.62;

      //Display sales prectiction of the East Coast division
      //For some reason if I wrapped the ouput, it would error on compile
      System.out.println("The East Coast sales division will generate $" + salesPrediction + " if the company earns $4.6 million");
  }
}
