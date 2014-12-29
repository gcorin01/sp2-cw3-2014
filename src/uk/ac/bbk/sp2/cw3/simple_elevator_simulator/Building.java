package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

import java.util.ArrayList;

/**
 * Building class creates a simulated environment where an elevator can operate
 * and customers can use the elevator.
 * <p>
 * This is Coursework Three to be submitted for the purposes of Birkbeck,
 * University of London's module Software and Programming II (2014_15).
 * 
 * @author gcorin01
 * @version %i%, 28 December 2014
 */
public class Building {

    public static final int FLOOR_TO_IGNORE     = 13;
    public static final int lOWEST_FLOOR_NUMBER = 0;
    public static int       numOfFloors         = 0;
    public static int       highestFloorNumber  = 0;

    /**
     * @param numOfFloors
     * @param customerList 
     */
    public Building(int numOfFloors, ArrayList<Customer> customerList) {
        setNumberOfFloors(numOfFloors);
        setHighestFloorNumber();

        new Elevator(customerList);
    }

    private void setNumberOfFloors (int numOfFloors) {
        Building.numOfFloors = numOfFloors;
    }

    private int setHighestFloorNumber () {
        // Adding 1 floor to the highest floor number variable only when the
        // building has 13 or more floors
        int x = numOfFloors; 
        int y = FLOOR_TO_IGNORE;
        int z = lOWEST_FLOOR_NUMBER;

        return Building.highestFloorNumber = (x >= y ? z + x + 1 : x);
    }
}
