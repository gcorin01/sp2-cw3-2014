/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import uk.ac.bbk.sp2.cw3.simple_elevator_simulator.RideState;

/**
 * @author gcorin01
 *
 */
public class RideStateTest {

    RideState rideState;

    @Before
    public void setUp () {
        rideState = new MockRideState();
    }

    @Test
    public void testRideStateMethodMove () throws Exception {
        Customer customer = new Customer();
        rideState.move(customer);

        assertTrue(customer != null);
    }

    @Test
    public void testRideStateMethodPressElevatorButtonCustNotNull ()
            throws Exception {
        Customer customer = new Customer();
        rideState.pressElevatorButton(customer);
        assertTrue(customer != null);
    }
}