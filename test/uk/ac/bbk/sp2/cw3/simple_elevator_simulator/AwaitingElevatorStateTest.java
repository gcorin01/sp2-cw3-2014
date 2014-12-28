/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author gcorin01
 *
 */
public class AwaitingElevatorStateTest {

    RideState rideState;

    @Before
    public void setUp () {
        rideState = new AwaitingElevatorState();
    }

    @Test
    public void testAwaitingElevatorStateMethodMoveCustomerNotNull ()
            throws Exception {
        Customer customer1 = new Customer();
        rideState.move(customer1);
        assertTrue(customer1 != null);
    }

    @Test(expected = NullPointerException.class)
    public void testAwaitingElevatorStateMethodMoveCommandNull ()
            throws Exception {
        Customer customer2 = null;
        rideState.move(customer2);
    }

    @Test
    public void testAwaitingElevatorStateMethodPressElevatorButtonCustomerNotNull ()
            throws Exception {
        Customer customer3 = new Customer();
        rideState.pressElevatorButton(customer3);
        assertTrue(customer3 != null);
    }
}
