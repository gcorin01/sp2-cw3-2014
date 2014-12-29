/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author gcorin01
 *
 */
public class Controller {

    /**
     * Asks user input to obtain the number of floors the building needs to have
     * and the number of customers the elevator needs to have.
     * 
     * It creates a list of customers and constructs the building before the
     * simulations is started.
     */
    public Controller() {

        int numOfFloors = 0;
        int numOfCustomers = 0;

        Scanner input = new Scanner(System.in);
        try {
            System.out
                    .println("Entyer the number of floors you wish the building to have: ");
            numOfFloors = input.nextInt();

            System.out
                    .println("Enter the number of customers you wish the elevator to have: ");
            numOfCustomers = input.nextInt();

        } catch (NumberFormatException exception) {
            System.out.println("Input was not a valid number.");
        } finally {
            input.close();
        }

        // A customer list is created with number of customers decided by user
        ArrayList<Customer> customerList = new ArrayList<Customer>();
        int count = 1;
        while(count <= numOfCustomers){
            try {
                customerList.add(new Customer());
            } catch (Exception e) {
                System.err.println("Customer could not be created");
            }
            count++;
        }

        new Building(numOfFloors, customerList);
    }

    public static void main (String[] args) {
        new Controller();
    }

}
