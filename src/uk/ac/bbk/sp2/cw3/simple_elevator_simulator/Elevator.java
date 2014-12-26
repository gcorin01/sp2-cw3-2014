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

    public static int                currentFloor;
    public static ArrayList<Integer> requestedFloorToStop;
    public static List<Customer>     registerList;

    // List of Employees with given IDs to be used when letting Customers on/off
    // the Elevator at a given floor
    // Integer[] ids = {1, 2, 4, 8};
    // List<Employee> matchingEmployees =
    // Stream.of(ids).map(EmployeeUtils::findById).collect(toList());
    // Intermediate Operations filter excludes all elements that don’t match
    // a Predicate.
    // Map performs a one-­‐to-­‐one transformation of
    // elements using a Function.
}
