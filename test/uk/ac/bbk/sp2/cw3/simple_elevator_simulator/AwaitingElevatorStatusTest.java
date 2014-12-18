/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Gabriel
 *
 */
public class AwaitingElevatorStatusTest {

    RideStatus rideStatus;

    @Before
    public void setUp() {
	rideStatus = new AwaitingElevatorStatus();
    }

    @Test
    public void testRideStatusMethodMove() {

	AwaitingElevatorStatus awaitingElevatorStatus = new AwaitingElevatorStatus();
	awaitingElevatorStatus.move();
    }


//     @Test public void testTestRideStatusMethodSelectElevatorCommand() {
//     fail("Not yet implemented"); }
//     

}
