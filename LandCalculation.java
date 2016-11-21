
//LandCalculation.java

//This program calculates the number of acres in a tract of land

public class LandCalculation
{
  public static void main(String[] args)
  {
      //Variable to hold the given land track in sqare feet and 1 acre
      double landTract = 389767;
      double oneAcre = 43560;

      //Calucaltion of acreage
      double landTractAcres = landTract / oneAcre;

      //Output of calculation to terminal
      System.out.println("There is " + landTractAcres + "acres in the given land tract");
  }
}
