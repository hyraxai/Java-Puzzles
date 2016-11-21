
//TestAverage.java

import java.util.Scanner; //Needed for the Scanner class

/**
  This program calculates the average of test scores entered.
*/

public class TestAverage
{
  public static void main(String[] args)
  {
      double testScore1;      //The first test score
      double testScore2;      //The second test score
      double testScore3;      //The third test score
      double testAverage;     //The calucated test average

      //Create a Scanner object to read input.
      Scanner keyboard = new Scanner(System.in);

      //Get the first test score
      System.out.print("What was the percent score of your first test? ");
      testScore1 = keyboard.nextDouble();

      //Get the second test score
      System.out.print("What was the percent score of your second test? ");
      testScore2 = keyboard.nextDouble();

      //Get the third test score
      System.out.print("What was the percent score of your third test? ");
      testScore3 = keyboard.nextDouble();

      //Calculate the total score.
      testAverage = ((testScore1 + testScore2 + testScore3)/3);

      //Display the resulting information.
      System.out.println("\tYour first test score was " + testScore1 + "%");
      System.out.println("\tYour second test score was " + testScore2 + "%");
      System.out.println("\tYour third test score was " + testScore3 + "%");
      System.out.println("\tYour final average is " + testAverage + "%");
  }
}
