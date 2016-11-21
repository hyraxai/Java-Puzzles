
//Population.java

import java.util.Scanner;

/**
    This program will calculate an organisms population based on a
    given rate of increase over a given number of days from a given
    population begining number.
*/

public class Population
{
  public static void main(String[] args)
  {
    double startingOrganisims;    // The given number of starting organisms
    double percentPopIncrease;    // The given percentage of population increase
    double multiplyDays;          // The given number of days to calculate for
    double dailyPopulation;       // The calculated population per day

    // create a scanner object
    Scanner keyboard = new Scanner(System.in);

    // Get the starting number of organisms
    System.out.println("Starting number of organisms: ");
    startingOrganisims = keyboard.nextDouble();
    // Input validation for organisms
    while (startingOrganisims < 2)
      {
        System.out.println("You must enter 2 or more organisms: ");
        startingOrganisims = keyboard.nextDouble();
      }

    // Get the percentage of population increase
    System.out.println("Average daily population increase as a percentage: ");
    percentPopIncrease = keyboard.nextDouble();
    // Input validation for percentage
    while (percentPopIncrease < 0)
      {
        System.out.println("You must enter a positive percentage: ");
        percentPopIncrease = keyboard.nextDouble();
      }

    // Get the number of days
    System.out.println("How many days should the experiment run? ");
    multiplyDays = keyboard.nextDouble();
    // Input validation for days
    while (multiplyDays < 1)
      {
        System.out.println("You must enter 1 or more days: ");
        multiplyDays = keyboard.nextDouble();
      }

    // Set intital value for dailyPopulation
    dailyPopulation = startingOrganisims;

    // Begin a loop to calculate and display the results
    for (double days = 0; days <= multiplyDays; days++)
      {
        dailyPopulation = dailyPopulation + (dailyPopulation * (percentPopIncrease / 100));
        System.out.printf("On day " + days + ", the population will be: " + dailyPopulation + "\n");
      }
  }
}
