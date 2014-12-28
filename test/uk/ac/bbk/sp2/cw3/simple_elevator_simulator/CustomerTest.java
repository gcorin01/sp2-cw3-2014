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
    public void testCustomerStateFlagNameAwaitng () throws Exception {
        Customer customer1 = new Customer();

        assertTrue(customer1.getRideState().getFlagDescription () == "Awaiting Elevator");
    }
    
    @Test
    public void testCustomerStateFlagNameInElevator () throws Exception {
        Customer customer1 = new Customer();
        customer1.move();
        customer1.getRideState().pressElevatorButton(customer1);

        assertTrue(customer1.getRideState().getFlagDescription () == "In Elevator");
    }
    
    @Test
    public void testCustomerStateFlagNameArrived () throws Exception {
        Customer customer1 = new Customer();
        customer1.move();
        customer1.getRideState().pressElevatorButton(customer1);
        customer1.move();
       
        assertTrue(customer1.getRideState().getFlagDescription () == "Arrived");
    }
    
    @Test(expected = Exception.class)
    public void testCustomerStateFlagNameArrivedPressElevatorButtonExceptions () throws Exception {
        Customer customer1 = new Customer();
        customer1.move();
        customer1.getRideState().pressElevatorButton(customer1);
        customer1.move();
        customer1.getRideState().pressElevatorButton(customer1);        
    }
    
    @Test(expected = Exception.class)
    public void testCustomerStateFlagNameArrivedMoveExceptions () throws Exception {
        Customer customer1 = new Customer();
        customer1.move();
        customer1.getRideState().pressElevatorButton(customer1);
        customer1.move();
        customer1.getRideState().move(customer1);        
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
    public void testCustomerAtFloorNumberIsNotOutOfRangeHighest () throws Exception {
        Customer customer4 = new Customer();

        int max = Building.HIGHEST_FLOOR_NUMBER;
        int toFloorN = Integer.parseInt(customer4.getAtFloorNumber());

        assertFalse(toFloorN > max);
    }

    @Test
    public void testCustomerAtFloorNumberIsNotOutOfRangeLowest () throws Exception {
        Customer customer5 = new Customer();

        int min = Building.lOWEST_FLOOR_NUMBER;
        int toFloorN = Integer.parseInt(customer5.getAtFloorNumber());

        assertFalse(toFloorN < min);
    }

    @Test
    public void testCustomerToFloorNumberExistance () throws Exception {
        Customer customer6 = new Customer();
        customer6.move();
        customer6.getRideState().pressElevatorButton(customer6);
        
        String s = customer6.getToFloorNumber();

        assertFalse(s == null);
    }

    @Test
    public void testCustomerToFloorNumberIsNot13 () throws Exception {
        Customer customer7 = new Customer();
        customer7.move();
        customer7.getRideState().pressElevatorButton(customer7);

        String s = customer7.getToFloorNumber();
        assertFalse(s.equals(Integer.toString(Building.FLOOR_TO_IGNORE)));
    }

    @Test
    public void testCustomerToFloorNumberIsNotOutOfRangeHighest () throws Exception {
        Customer customer8 = new Customer();
        customer8.move();
        customer8.getRideState().pressElevatorButton(customer8);

        int max = Building.HIGHEST_FLOOR_NUMBER;
        int toFloorN = Integer.parseInt(customer8.getToFloorNumber());

        assertFalse(toFloorN > max);
    }

    @Test
    public void testCustomerToFloorNumberIsNotOutOfRangeLowest () throws Exception {
        Customer customer9 = new Customer();

        int min = Building.lOWEST_FLOOR_NUMBER;

        customer9.move();
        customer9.getRideState().pressElevatorButton(customer9);

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
        int expectedCount = 15;
        int actualCount = Customer.count;

        assertEquals(expectedCount, actualCount);
    }
}