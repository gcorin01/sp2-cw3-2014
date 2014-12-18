/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

import org.junit.Before;
import org.junit.Test;

import uk.ac.bbk.sp2.cw3.simple_elevator_simulator.RideState;

/**
 * @author Gabriel
 *
 */
public class RideStatusTest {

    RideState rideStatus;

    @Before
    public void setUp() {
	rideStatus = new MockRideStatus();
    }

    @Test
    public void testRideStatusMethodMove() {
	rideStatus.move();
    }

    @Test
    public void testRideStatusMethodSelectElevatorCommand() {
	rideStatus.selectElevatorCommand();
    }

}
