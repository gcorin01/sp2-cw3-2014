/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Gabriel
 *
 */
public class RideStatusTest {
    
    RideStatus rideStatus;
    @Before
    public void setUp() {
	rideStatus = new MockRideStatus();
    }

    @Test
    public void testRideStatusMethodMove() {
	    rideStatus.move();
    }

/*    @Test
    public void test() {
	fail("Not yet implemented");
    }

    @Test
    public void test() {
	fail("Not yet implemented");
    }

    @Test
    public void test() {
	fail("Not yet implemented");
    }*/
}
