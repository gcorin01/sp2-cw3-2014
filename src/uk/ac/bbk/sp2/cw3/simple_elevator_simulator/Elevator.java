/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author gcorin01
 *
 */
public class Elevator {
    private int                  currentFloor  = 0;
    private int                  floorVisited  = 0;
    public static List<Customer> registerList  = new ArrayList<Customer>();

    /** 
     * Class constructor.
     * @param customerList 
     */
    public Elevator(ArrayList<Customer> customerList) {

    }

    /**
     * @return the atFloorNumber or toFloorNumber
     */
    public static String getFloorNumber (Customer c) {
        return setFloorNumber(c);
    }

    private static String setFloorNumber (Customer c) {
        int max = Building.highestFloorNumber;
        int min = Building.lOWEST_FLOOR_NUMBER;

        Random r = new Random();

        // Random number creation
        String x = Integer.toString(min + r.nextInt(max - min + 1));

        // Current floor
        String y = c.getAtFloorNumber();

        // Floor to ignore
        String z = Integer.toString(Building.FLOOR_TO_IGNORE);

        // Check that when setting the randomly generated floor number, the
        // number for the toFloorNumber variable is not the same as the floor
        // from which the customer is calling the elevator and that the random
        // number is not a floor that the Building class requests to ignore.
        x = (x.equals(y) || x.equals(z)) ? setFloorNumber(c) : x;

        return x;
    }

    // List of Customers with given IDs to be used when letting Customers on/off
    // the Elevator at a given floor
    // Integer[] ids = {1, 2, 4, 8};
    // List<Customer> matchingCustomer =
    // Stream.of(ids).map(EmployeeUtils::findById).collect(toList());
    // Intermediate Operations filter excludes all elements that don’t match
    // a Predicate.
    // Map performs a one-­‐to-­‐one transformation of
    // elements using a Function.
}
