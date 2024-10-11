package course.exercises.myPackageB;

import course.exercises.myPackageA.Trip;

public class Holiday {
  public static void main(String[] args) {
    Trip trip_1 = new Trip();
    Trip trip_2 = new Trip();
    Trip trip_3 = new Trip();

    trip_1.tripName = "Trip 1";
    trip_1.location = "Eiffel Tower";
    trip_1.noOfPlannedDays = 2;
    trip_1.Travel();

    trip_2.tripName = "Trip 2";
    trip_2.location = "Notre Dame Cathedral";
    trip_2.noOfPlannedDays = 1;
    trip_2.Travel();

    trip_3.tripName = "Trip 3";
    trip_3.location = "Louvre Museum";
    trip_3.noOfPlannedDays = 5;
    trip_3.Travel();
  }

}

/*
 * >> For lesson 18 or Coding Exercise 3: Package & Imports Understanding or 18. Solution Coding Exercise 3: Package & Imports Understanding
 */