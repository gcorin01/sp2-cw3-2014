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
     * Sets the highest floor number the building has so that it can be used for
     * the generation of the random floor numbers
     * 
     * Creates a list of customers which is then passed to the Elevator class
     * while initiating it
     * 
     * @param numOfFloors
     * @param numOfCustomers
     * @throws Exception 
     */
    public Building(int numOfFloors, int numOfCustomers) throws Exception {
        setNumberOfFloors(numOfFloors);
        setHighestFloorNumber();

        // A customer list is created with number of customers decided by user
        ArrayList<Customer> customerList = new ArrayList<Customer>();
        int count = 1;
        while (count <= numOfCustomers) {
            try {
                customerList.add(new Customer());
            } catch (Exception e) {
                System.err.println("Customer could not be created");
            }
            count++;
        }

        new Elevator(customerList);
    }

    private void setNumberOfFloors (int numOfFloors) {
        Building.numOfFloors = numOfFloors;
    }

    /**
     * @return the building highest floor adding 1 floor when the building has
     *         13 or more floors because floor 13 is ignored
     */
    private int setHighestFloorNumber () {
        int x = numOfFloors;
        int y = FLOOR_TO_IGNORE;
        int z = lOWEST_FLOOR_NUMBER;

        return Building.highestFloorNumber = (x >= y ? z + x + 1 : x);
    }
}
