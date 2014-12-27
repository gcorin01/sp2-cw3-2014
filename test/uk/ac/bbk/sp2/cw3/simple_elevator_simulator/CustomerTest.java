/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * x`
 * 
 * @author gcorin01
 *
 */
public class CustomerTest {

    @Test
    public void testCustomerClassExistance () {
        @SuppressWarnings("unused")
        Customer customer = new Customer();
    }

    @Test
    public void testCustomerId () {
        @SuppressWarnings("unused")
        Customer customer = new Customer();

        int expectedId = 1;
        int actualId = customer.getId();

        assertEquals(expectedId, actualId);
    }

    @Test
    public void testCustomerCount () {
        @SuppressWarnings("unused")
        Customer customer1 = new Customer();
        @SuppressWarnings("unused")
        Customer customer2 = new Customer();
        @SuppressWarnings("unused")
        Customer customer3 = new Customer();

        int expectedCount = 3;
        int actualCount = Customer.count;

        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testCustomerAtFloorNumberExistance () {
        @SuppressWarnings("unused")
        Customer customer = new Customer();

        String s = customer.getAtFloorNumber();
        System.out.println("At floor number: " + s);
    }

    @Test
    public void testCustomerToFloorNumberExistance () {
        @SuppressWarnings("unused")
        Customer customer = new Customer();

        String s = customer.getToFloorNumber();
        System.out.println("To floor number: " + s);
    }

    @Test
    public void testCustomerToFloorNumberIsNot13 () {
        @SuppressWarnings("unused")
        Customer customer = new Customer();

        String s = customer.getToFloorNumber();
        assertFalse(s.equals("13"));
    }

    @Test
    public void testCustomerToFloorNumberIsNotOutOfRange () {
        @SuppressWarnings("unused")
        Customer customer = new Customer();

        String s = customer.getToFloorNumber();
        assertFalse(s.equals("13"));
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