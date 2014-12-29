/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author gcorin01
 *
 */
public class Controller {

    int     numOfFloors;
    int     numOfCustomers;
    Scanner input = new Scanner(System.in);

    /**
     * Asks user input to obtain the number of floors the building needs to have
     * and the number of customers the elevator needs to have.
     * 
     * It creates a list of customers and constructs the building before the
     * simulations is started.
     */
    public Controller() {
        String notANumber = "What you typed was not a number. Good bye!";

        try {
            String s = "Enter the number of floors (from 1 to 100) you wish the building to have: ";
            numOfFloors = getUserInput(s);
        } catch (InputMismatchException exception) {
            System.out.println(notANumber);
            input.close();
            return;
        }
        try {
            String s = "Enter the number of customers (from 1 to 100) you wish the elevator to have: ";
            numOfCustomers = getUserInput(s);
        } catch (InputMismatchException exception) {
            System.out.println(notANumber);
            input.close();
            return;
        } finally {
            input.close();
        }

        new Building(numOfFloors, numOfCustomers);
    }

    /**
     * Checks if number input from the user is within range 1 to 100 and if it
     * is not, the user is prompted to enter another number
     * 
     * @param s
     *            the message prompting the user to enter a number of floors and
     *            customers
     * @return either the number of floors the building will have or the number
     *         of customers the elevator will have
     */
    private int getUserInput (String s) {
        String errText = "The number must be between 1 and 100. Enter another nubmer: ";
        System.out.println(s);
        int x = input.nextInt();

        x = ((x < 1) || (x > 100) ? getUserInput(errText) : x);
        return x;
    }

    public static void main (String[] args) {
        new Controller();
    }

}
