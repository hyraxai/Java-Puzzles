
//RunningTheRace.java

import java.util.Scanner; //Needed for the Scanner class

/**
  This program asks the user to enter runners names and thier times, then displays
  them in order
*/

public class RunningTheRace
{
  public static void main(String[] args)
  {
    String runner1;            // First runner name
    String runner2;            // Second runner name
    String runner3;            // Third runner name
    int runnerTime1;           // First runner time
    int runnerTime2;           // Second runner time
    int runnerTime3;           // Third runner time

    //Create a Scanner object to read input.
    Scanner keyboard = new Scanner(System.in);

    // Get the runner names and time.
    System.out.print("Enter the name of a runner: ");
    runner1 = keyboard.nextLine();
    System.out.print("Now enter his/her race finish time in minutes: ");
    runnerTime1 = keyboard.nextInt();
    keyboard.nextLine();
    System.out.print("Enter another name of a runner: ");
    runner2 = keyboard.nextLine();
    System.out.print("Now enter his/her race finish time in minutes: ");
    runnerTime2 = keyboard.nextInt();
    keyboard.nextLine();
    System.out.print("Enter another name of a runner: ");
    runner3 = keyboard.nextLine();
    System.out.print("Now enter his/her race finish time in minutes: ");
    runnerTime3 = keyboard.nextInt();

    // Display the runners in order.
    if (runnerTime1 < runnerTime2 && runnerTime1 < runnerTime3)
      System.out.println(runner1);
          if (runnerTime2 < runnerTime3)
          {
          System.out.println(runner2);
          System.out.println(runner3);
          }
          else
          {
          System.out.println(runner2);
          System.out.println(runner3);
          }
    if (runnerTime2 < runnerTime1 && runnerTime2 < runnerTime3)
      System.out.println(runner2);
        if (runnerTime1 < runnerTime3)
          {
          System.out.println(runner1);
          System.out.println(runner3);
          }
        else
          {
          System.out.println(runner3);
          System.out.println(runner1);
          }
    if (runnerTime3 < runnerTime1 && runnerTime3 < runnerTime2)
      System.out.println(runner3);
        if (runnerTime1 < runnerTime3)
          {
          System.out.println(runner1);
          System.out.println(runner2);
          }
        else
          {
          System.out.println(runner2);
          System.out.println(runner1);
          }
  }
}
