/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

import static org.junit.Assert.fail;
import static org.mockito.Mockito.*;

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
    
    
    /**
     * Test method for {@link uk.ac.bbk.sp2.cw3.simple_elevator_simulator.RideStatusTest#testRideStatusMethodMove()}.
     */
    @Test
    public void testTestRideStatusMethodMove() {
	
	AwaitingElevatorStatus awaitingElevatorStatus = new AwaitingElevatorStatus();
	awaitingElevatorStatus.move();
    }

    /**
     * Test method for {@link uk.ac.bbk.sp2.cw3.simple_elevator_simulator.RideStatusTest#testRideStatusMethodSelectElevatorCommand()}.
     */
    @Test
    public void testTestRideStatusMethodSelectElevatorCommand() {
	fail("Not yet implemented");
    }

}
