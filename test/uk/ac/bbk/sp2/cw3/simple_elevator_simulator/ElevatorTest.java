/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author gcorin01
 *
 */
public class ElevatorTest {

    static Controller controller;
    
    @BeforeClass
    public static void createControllerClass () throws Exception {
        controller = new Controller();
    }
    
    @Test
    public void testGetCurrentFloorMethod () {
       // fail("Not yet implemented");
    } 
}
