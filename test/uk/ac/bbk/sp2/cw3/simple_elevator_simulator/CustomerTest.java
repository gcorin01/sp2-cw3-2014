/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;

/**
 * 
 * @author gcorin01
 *
 */
public class CustomerTest {

    @Test
    public void testCustomerClassExistance () {
        @SuppressWarnings("unused")
        Customer customer1 = new Customer();
        
        assertTrue(customer1 != null);
    }

    @Test
    public void testCustomerAtFloorNumberExistance () {
        Customer customer2 = new Customer();

        String s = customer2.getAtFloorNumber();
        
        assertTrue(s != null);
    }

    @Test
    public void testCustomerAtFloorNumberIsNot13 () {
        Customer customer3 = new Customer();

        String s = customer3.getAtFloorNumber();
        assertFalse(s.equals(Integer.toString(Building.FLOOR_TO_IGNORE)));
    }

    @Test
    public void testCustomerAtFloorNumberIsNotOutOfRangeMax () {
        Customer customer4 = new Customer();

        int max = Building.MAX_FLOOR_NUMBER;
        int toFloorN = Integer.parseInt(customer4.getAtFloorNumber());

        assertFalse(toFloorN > max);
    }

    @Test
    public void testCustomerAtFloorNumberIsNotOutOfRangeMin () {
        Customer customer5 = new Customer();

        int min = Building.MIN_FLOOR_NUMBER;
        int toFloorN = Integer.parseInt(customer5.getAtFloorNumber());

        assertFalse(toFloorN < min);
    }

    @Test
    public void testCustomerToFloorNumberExistance () {
        Customer customer6 = new Customer();

        String s = customer6.getToFloorNumber();

        assertFalse(s == null);
    }

    @Test
    public void testCustomerToFloorNumberIsNot13 () {
        Customer customer7 = new Customer();

        String s = customer7.getToFloorNumber();
        assertFalse(s.equals(Integer.toString(Building.FLOOR_TO_IGNORE)));
    }

    @Test
    public void testCustomerToFloorNumberIsNotOutOfRangeMax () {
        Customer customer8 = new Customer();

        int max = Building.MAX_FLOOR_NUMBER;
        int toFloorN = Integer.parseInt(customer8.getToFloorNumber());

        assertFalse(toFloorN > max);
    }

    @Test
    public void testCustomerToFloorNumberIsNotOutOfRangeMin () {
        Customer customer9 = new Customer();

        int min = Building.MIN_FLOOR_NUMBER;
        int toFloorN = Integer.parseInt(customer9.getToFloorNumber());

        assertFalse(toFloorN < min);
    }

    @Test
    public void testCustomerId () {
        Customer customer10 = new Customer();

        int expectedId = Customer.count;
        int actualId = customer10.getId();

        assertEquals(expectedId, actualId);
    }

    @AfterClass
    public static void testCustomerCount () {
        // TODO Once Building class has been equipped with user input,
        // expectedCount needs to be equal to the number of customers the user
        // decided to have in the elevator simulation
        int expectedCount = 10;
        int actualCount = Customer.count;
        
        for (Integer floor : Elevator.requestedFloorToStop) {
            System.out.println("Floor to stop " + floor);
        }

        assertEquals(expectedCount, actualCount);
    }
}