/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

import java.util.*;

/**
 * @author gcorin01
 *
 */
public class Customer {
    static int        count            = 0;
    private int       id               = 0;
    private RideState currentRideState = null;
    private String    atFloorNumber    = null;
    private String    toFloorNumber    = null;

    public Customer() {
        count++;
        setId(count);

        // In a real world scenario, it would be the actual button pressed by
        // the Customer which determines at which floor the elevator has been
        // called from
        this.atFloorNumber = setFloorNumber();
        System.out.println("At floor number" + this.atFloorNumber); // TODO
                                                                    // Remove
                                                                    // debug
                                                                    // line

        this.toFloorNumber = setFloorNumber();
        System.out.println("To floor number" + this.toFloorNumber); // TODO
                                                                    // Remove
                                                                    // debug
                                                                    // line

        initialiseCustomer(this.atFloorNumber);
    }

    private void initialiseCustomer (String atFloorNumber) {
        setRideState(new AwaitingElevatorState());

        this.currentRideState.pressElevatorButton(atFloorNumber);
    }

    /**
     * @return the id
     */
    public int getId () {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    private void setId (int id) {
        this.id = id;
    }

    /**
     * @return the atFloorNumber
     */
    public String getAtFloorNumber () {
        return atFloorNumber;
    }

    /**
     * @return the toFloorNumber
     */
    public String getToFloorNumber () {
        return toFloorNumber;
    }

    private String setFloorNumber () {
        // TODO Add a functional interface (or SAM interface) to change this
        // method so that the implementation of the random number is moved
        // outside of this class
        int max = Building.MAX_FLOOR_NUMBER;
        int min = Building.MIN_FLOOR_NUMBER;

        Random r = new Random();

        // Random number creation
        String x = Integer.toString(min + r.nextInt(max - min + 1));

        // Current floor
        String y = this.atFloorNumber;

        // Floor to ignore
        String z = Integer.toString(Building.FLOOR_TO_IGNORE);

        // Check that when setting the randomly generated floor number, the
        // number for the toFloorNumber variable is not the same as the floor
        // from which the customer is calling the elevator and that the random
        // number is not a floor that the Building class requests to ignore.
        x = (x.equals(y) || x.equals(z)) ? setFloorNumber() : x;

        return x;
    }

    /**
     * @return the rideState
     */
    public RideState getRideState () {
        return currentRideState;
    }

    /**
     * @param currentRideState
     *            the rideState to set
     */
    private void setRideState (RideState currentRideState) {
        this.currentRideState = currentRideState;
    }

    public void move () {
        // Customer either enters or exit the elevator
        this.currentRideState = currentRideState.move();
    }

    public void pressElevatorButton (String command) {
        // In a real case scenario, it would be the actual button pressed by the
        // Customer which would determine either the floor number or any other
        // button/function available to be selected within the elevator

        this.currentRideState.pressElevatorButton(command);
    }
}