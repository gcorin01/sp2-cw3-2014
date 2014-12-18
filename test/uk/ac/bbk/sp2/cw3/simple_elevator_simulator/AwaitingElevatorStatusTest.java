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

    RideState rideStatus;

    @Before
    public void setUp() {
	rideStatus = new AwaitingElevatorState();
    }

    @Test
    public void testRideStatusMethodMove() {

	AwaitingElevatorState awaitingElevatorStatus = new AwaitingElevatorState();
	awaitingElevatorStatus.move();
	
    }


//     @Test public void testRideStatusMethodSelectElevatorCommand() {
//     fail("Not yet implemented"); }
//     

}
