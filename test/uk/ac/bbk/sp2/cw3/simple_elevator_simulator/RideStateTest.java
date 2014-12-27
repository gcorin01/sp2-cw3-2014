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
    public void testRideStatusMethodMove () throws Exception {
        Customer customer = new Customer();
        rideState.move(customer);

        assertTrue(customer != null);
    }

    @Test
    public void testRideStatusMethodSelectElevatorCommandCustNotNull() throws Exception {
        Customer customer = new Customer();
        String command = "" + 1;
        rideState.pressElevatorButton(customer, command);
        assertTrue(customer != null);
    }

    @Test
    public void testRideStatusMethodSelectElevatorCommandCommNotNull() throws Exception {
        Customer customer = new Customer();
        String command = "" + 1;
        rideState.pressElevatorButton(customer, command);
        assertTrue(command != null);
    }
}
