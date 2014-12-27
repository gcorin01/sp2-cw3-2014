/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

import java.util.Random;

/**
 * @author gcorin01
 *
 */
public class Building {

    public static final int FLOOR_TO_IGNORE  = 13;
    public static final int MIN_FLOOR_NUMBER = 0;
    public static final int MAX_FLOOR_NUMBER = 20;  // TODO obtain from user
                                                     // input
    Customer                customer         = null;

    /**
     * @return the atFloorNumber or toFloorNumber
     */
    public static String getFloorNumber (Customer customer) {
        return setFloorNumber(customer);
    }

    static String setFloorNumber (Customer customer) {
        int max = MAX_FLOOR_NUMBER;
        int min = MIN_FLOOR_NUMBER;

        Random r = new Random();

        // Random number creation
        String x = Integer.toString(min + r.nextInt(max - min + 1));

        // Current floor
        String y = customer.getAtFloorNumber();

        // Floor to ignore
        String z = Integer.toString(FLOOR_TO_IGNORE);

        // Check that when setting the randomly generated floor number, the
        // number for the toFloorNumber variable is not the same as the floor
        // from which the customer is calling the elevator and that the random
        // number is not a floor that the Building class requests to ignore.
        x = (x.equals(y) || x.equals(z)) ? setFloorNumber(customer) : x;

        return x;
    }
}
