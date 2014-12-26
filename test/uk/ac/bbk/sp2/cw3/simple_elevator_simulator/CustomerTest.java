/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author gcorin01
 *
 */
public class CustomerTest {

    @Test
    public void testCustomerClassExistance () {
        @SuppressWarnings("unused")
        Customer customer = new Customer(5);
    }

    @Test
    public void testGetFloorNumberMethodExistance () {
        @SuppressWarnings("unused")
        Customer customer = new Customer(0);

        @SuppressWarnings("unused")
        int currentFloor = customer.getFloorNumber();
    }

    @Test
    public void testGetDestinationFloorMethodExistance () {
        @SuppressWarnings("unused")
        Customer customer = new Customer(5);

        @SuppressWarnings("unused")
        int currentFloor = Customer.getDestinationFloor();
    }

    @Test
    public void testCustomerIdAttribureExistance () {
        int id = 1;

        @SuppressWarnings("unused")
        Customer customer = new Customer(id);
    }

    @Test
    public void testInElevatorMethodExistance () {
        int id = 1;
        int desiredFloor = 5;

        Customer customer = new Customer(id);

        @SuppressWarnings("unused")
        boolean onboard = customer.inElevator();
    }

    @Test
    public void testFinishedMethodExistance () {
        int id = 1;
        int desiredFloor = 5;

        Customer customer = new Customer(id);

        @SuppressWarnings("unused")
        boolean finished = customer.arrived();
    }

    @Test
    public void testDesiredFloorAttributeExistance () {
        int id = 1;

        @SuppressWarnings("unused")
        Customer customer = new Customer(id);

        System.out.println("The random customer atFloorNumber is: "
                + customer.atFloorNumber);

    }

    @Test
    public void testGetDestinationFloorMethod () {
        fail("Not yet implemented");
    } // TODO Add number floors boundary in Customer Class as CONSTANTS derived
      // by the user input

    @Test
    public void testGetCurrentFloorMethod () {
        fail("Not yet implemented");
    } // TODO Number set by random number generator / possibly this should be an
      // Interface so that it can be implemented in various ways such as letting
      // the user decide the destination floor rather than using random numbers

}