package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class ControllerTest {
    static Controller controller;
    
    @BeforeClass
    public static void createControllerClass () throws Exception {
        controller = new Controller();
    }

    @Test
    public void testClaZssScannerNumberOfFloorsInputLessThan1 () {
        assertTrue("Number of floor is less than 1", controller.numOfFloors > 0);
    }

    @Test
    public void testClaZssScannerNumberOfFloorsInputMoreThan100 () {
        assertFalse("Number of floor is more than 100",
                controller.numOfFloors > 100);
    }

    @Test
    public void testClaZssScannerNumberOfCustomersInputLessThan1 () {
        assertTrue("Number of customers is less than 1",
                controller.numOfCustomers > 0);
    }

    @Test
    public void testClaZssScannerNumberOfCustomersInputMoreThan100 () {
        assertFalse("Number of customers is less than 1",
                controller.numOfCustomers > 100);
    }
}
