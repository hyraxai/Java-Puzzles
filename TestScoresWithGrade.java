
//TestScoresWithGrade.java

import java.util.Scanner; //Needed for the Scanner class

/**
  This program asks the user to enter a numeric test
  score and displays a letter grade for the score. The
  program uses an if-else-if statement to determine
  the letter grade.
*/

public class TestScoresWithGrade
{
  public static void main(String[] args)
  {
    int testScore1;         // A numeric test score
    int testScore2;         // A numeric test score
    int testScore3;         // A numeric test score
    int testScoreAverage;   // The calcuated average of the test scores

    //Create a Scanner object to read input.
    Scanner keyboard = new Scanner(System.in);

    // Get the numeric test scores.
    System.out.print("Enter the first test score: ");
    testScore1 = keyboard.nextInt();

    System.out.print("Enter another test score: ");
    testScore2 = keyboard.nextInt();

    System.out.print("Enter another test score: ");
    testScore3 = keyboard.nextInt();

    // Calculate the average of the scores
    testScoreAverage = (testScore1 + testScore2 + testScore3)/3;

    // Display the grade.
    if (testScoreAverage < 60)
      System.out.println("Your grade is F with an average of " + testScoreAverage + "%");
    else if (testScoreAverage < 70)
      System.out.println("Your grade is D with an average of " + testScoreAverage + "%");
    else if (testScoreAverage < 80)
      System.out.println("Your grade is C with an average of " + testScoreAverage + "%");
    else if (testScoreAverage < 90)
      System.out.println("Your grade is B with an average of " + testScoreAverage + "%");
    else
      System.out.println("Your grade is A with an average of " + testScoreAverage + "%");
  }
}
