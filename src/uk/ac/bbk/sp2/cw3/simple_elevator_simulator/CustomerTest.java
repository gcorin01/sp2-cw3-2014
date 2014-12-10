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
        Customer customer = new Customer(0);
    }

    @Test
    public void testCurrentFloor () {
        @SuppressWarnings("unused")
        Customer customer = new Customer(0);

        @SuppressWarnings("unused")
        int currentFloor = Customer.getCurrentFloor();
    }

    @Test
    public void testDestinationFloor () {
        @SuppressWarnings("unused")
        Customer customer = new Customer(0);

        @SuppressWarnings("unused")
        int currentFloor = Customer.getDestinationFloor();
    }

    @Test
    public void testCustomerId () {
        int id = 1;

        @SuppressWarnings("unused")
        Customer customer = new Customer(id);
    }

    @Test
    public void testInElevator () {
        int id = 1;

        Customer customer = new Customer(id);
        
        @SuppressWarnings("unused")
        boolean onboard = customer.inElevator();
    }

    @Test
    public void testFinished() {
        int id = 1;

        Customer customer = new Customer(id);
        
        @SuppressWarnings("unused")
        boolean finished = customer.arrived();
    }
    @Test
    public void test () {
        fail("Not yet implemented");
    }    
}
