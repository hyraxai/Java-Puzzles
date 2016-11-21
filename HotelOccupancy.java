
//HotelOccupancy.java

import java.util.Scanner;           // Needed for the Scanner class

/**
    This program will calculate the occupancy rate for each floor of
    a hotel. It will ask for the number of floors, the number of rooms
    on each floor, and the number of rooms that are occupied. At the
    end, it will display the number rooms, the number of rooms occupied,
    the number of vacancies, and the occupancy rate of the hotel.
*/

public class HotelOccupancy
{
  public static void main(String[] args)
  {
    // Needed variables
    int floor;
    int roomsPerFloor;
    int occupiedRooms;
    int numFloors;
    double roomsTotal;
    double occupiedRoomsTotal;

    // Create a Scanner object
    Scanner keyboard = new Scanner(System.in);

    // Ask the user how many floors
    System.out.println("How many floors does the hotel have?");
    numFloors = keyboard.nextInt();

    // Input validation to ensure floors is always more than 1
    while(numFloors < 1)
      {
        System.out.print("Invalid input. Please enter a number of floors " +
                        "greater than 0: ");
        numFloors = keyboard.nextInt();
      }

    // Set accumulators to zero
    roomsTotal = 0.0;
    occupiedRoomsTotal = 0.0;

    // Begin a loop to calcuate the number of vacancies
    for (floor = 0; floor != numFloors; floor++)
    {
        System.out.println();
        System.out.println("Floor number " + (floor + 1) + ": ");
        System.out.println("-----------------");
        System.out.println("Total rooms: ");
        roomsPerFloor = keyboard.nextInt();
        roomsTotal += roomsPerFloor;

        // Input validation to ensure rooms per floor is always more than 10
        while (roomsPerFloor < 10)
          {
            System.out.println("Invalid input. Please enter a number of rooms " +
                            "greater than 10:");
            roomsPerFloor = keyboard.nextInt();
          }

        System.out.println("Occupied rooms: ");
        occupiedRooms = keyboard.nextInt();
        occupiedRoomsTotal += occupiedRooms;

    }
    // calculate and display results
    double occupancyRate = (occupiedRoomsTotal / roomsTotal) * 100;
    double vacantRooms = (roomsTotal - occupiedRoomsTotal);
    System.out.println("Total rooms in the hotel: " + roomsTotal);
    System.out.println("Total occupied rooms = " + occupiedRoomsTotal);
    System.out.println("Total vacant rooms = " + vacantRooms);
    System.out.printf("The occupancy rate is %.1f%%", occupancyRate);
  }
}
