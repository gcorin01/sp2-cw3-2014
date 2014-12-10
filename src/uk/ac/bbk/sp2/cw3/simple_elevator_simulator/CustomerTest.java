/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Gabriel
 *
 */
public class CustomerTest {

    @Test
    public void testCustomerClassExistance () {
        @SuppressWarnings("unused")
        Customer customer = new Customer(0, 5);
    }

    @Test
    public void testGetCurrentFloorMethodExistance () {
        @SuppressWarnings("unused")
        Customer customer = new Customer(0, 5);

        @SuppressWarnings("unused")
        int currentFloor = Customer.getCurrentFloor();
    }

    @Test
    public void testGetDestinationFloorMethodExistance () {
        @SuppressWarnings("unused")
        Customer customer = new Customer(0, 5);

        @SuppressWarnings("unused")
        int currentFloor = Customer.getDestinationFloor();
    }

    @Test
    public void testCustomerIdAttribureExistance () {
        int id = 1;
        int desiredFloor = 5;

        @SuppressWarnings("unused")
        Customer customer = new Customer(id, desiredFloor);
    }

    @Test
    public void testInElevatorMethodExistance () {
        int id = 1;
        int desiredFloor = 5;

        Customer customer = new Customer(id, desiredFloor);

        @SuppressWarnings("unused")
        boolean onboard = customer.inElevator();
    }

    @Test
    public void testFinishedMethodExistance () {
        int id = 1;
        int desiredFloor = 5;

        Customer customer = new Customer(id, desiredFloor);

        @SuppressWarnings("unused")
        boolean finished = customer.arrived();
    }

    @Test
    public void testDesiredFloorAttributeExistance () {
        int id = 1;
        int desiredFloor = 5;

        @SuppressWarnings("unused")
        Customer customer = new Customer(id, desiredFloor);

    }
    
    @Test
    public void testInElevatorMethodTrue () {
        fail("Not yet implemented");
    }

    @Test
    public void testInElevatorMethodFalse () {
        fail("Not yet implemented");
    }
    
    @Test
    public void testFinishedMethodFalse () {
        fail("Not yet implemented");
    }

    @Test
    public void testFinishedMethodTrue () {
        fail("Not yet implemented");
    }

    @Test
    public void testGetDestinationFloorMethod () {
        fail("Not yet implemented");
    }

    @Test
    public void testGetCurrentFloorMethod () {
        fail("Not yet implemented");
    }

    @Test
    public void test () {
        fail("Not yet implemented");
    }
}