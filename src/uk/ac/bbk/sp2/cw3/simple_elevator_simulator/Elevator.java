/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gcorin01
 *
 */
public class Elevator {
    public static int                currentFloor         = 0;
    public static int                floorVisited         = 0;
    public static ArrayList<Integer> requestedFloorToStop = new ArrayList<Integer>();
    public static List<Customer>     registerList         = new ArrayList<Customer>();
    public static List<Customer>     customerJoins        = new ArrayList<Customer>();

    public Elevator() {

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
