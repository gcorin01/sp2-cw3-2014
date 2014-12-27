/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.Test;

/**
 * 
 * @author gcorin01
 *
 */
public class CustomerTest {

    @Test
    public void testCustomerClassExistance () throws Exception {
        Customer customer1 = new Customer();

        assertTrue(customer1 != null);
    }

    @Test
    public void testCustomerStateFlagName () throws Exception {
        Customer customer1 = new Customer();

        assertTrue(customer1.getRideState().flagDescription == "Awaiting Elevator");
    }

    @Test
    public void testCustomerAtFloorNumberExistance () throws Exception {
        Customer customer2 = new Customer();

        String s = customer2.getAtFloorNumber();

        assertTrue(s != null);
    }

    @Test
    public void testCustomerAtFloorNumberIsNot13 () throws Exception {
        Customer customer3 = new Customer();

        String s = customer3.getAtFloorNumber();
        assertFalse(s.equals(Integer.toString(Building.FLOOR_TO_IGNORE)));
    }

    @Test
    public void testCustomerAtFloorNumberIsNotOutOfRangeMax () throws Exception {
        Customer customer4 = new Customer();

        int max = Building.MAX_FLOOR_NUMBER;
        int toFloorN = Integer.parseInt(customer4.getAtFloorNumber());

        assertFalse(toFloorN > max);
    }

    @Test
    public void testCustomerAtFloorNumberIsNotOutOfRangeMin () throws Exception {
        Customer customer5 = new Customer();

        int min = Building.MIN_FLOOR_NUMBER;
        int toFloorN = Integer.parseInt(customer5.getAtFloorNumber());

        assertFalse(toFloorN < min);
    }

    @Test
    public void testCustomerToFloorNumberExistance () throws Exception {
        Customer customer6 = new Customer();

        String s = customer6.getToFloorNumber();

        assertFalse(s == null);
    }

    @Test
    public void testCustomerToFloorNumberIsNot13 () throws Exception {
        Customer customer7 = new Customer();

        String s = customer7.getToFloorNumber();
        assertFalse(s.equals(Integer.toString(Building.FLOOR_TO_IGNORE)));
    }

    @Test
    public void testCustomerToFloorNumberIsNotOutOfRangeMax () throws Exception {
        Customer customer8 = new Customer();

        int max = Building.MAX_FLOOR_NUMBER;
        int toFloorN = Integer.parseInt(customer8.getToFloorNumber());

        assertFalse(toFloorN > max);
    }

    @Test
    public void testCustomerToFloorNumberIsNotOutOfRangeMin () throws Exception {
        Customer customer9 = new Customer();

        int min = Building.MIN_FLOOR_NUMBER;
        int toFloorN = Integer.parseInt(customer9.getToFloorNumber());

        assertFalse(toFloorN < min);
    }

    @Test
    public void testCustomerId () throws Exception {
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
        int expectedCount = 11;
        int actualCount = Customer.count;

        assertEquals(expectedCount, actualCount);
    }
}