/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

import java.util.Random;

/**
 * @author gcorin01
 *
 */
public class Customer {
    private int       id               = 0;
    private RideState currentRideState = null;

    // private Integer toFloorNumber = null;

    public Customer(int id) {
        // ID comes from customerList index created in Building
        // setDesiredFloor(); this needs to be controlled by the OnboardElevator
        setId(id);

        // In a real world scenario, it would be the actual button pressed by
        // the Customer which determines at which floor the elevator has been
        // called from
        String atFloorNumber = getFloorNumber();
        System.out.println(atFloorNumber); // TODO Remove debug line

        initialiseCustomer(atFloorNumber);
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
     * @return the atFloorNumber or toFloorNumber
     */
    public String getFloorNumber () {
        return setFloorNumber();
    }

    private String setFloorNumber () {
        // TODO Add a functional interface (or SAM interface) to change this
        // method so that the implementation of the random number is moved
        // outside of this class
        // TODO set MAX and MIN floor number in Building class
        int max = Building.MAX_FLOOR_NUMBER;
        int min = Building.MIN_FLOOR_NUMBER;

        Random r = new Random();

        String x = Integer.toString(r.ints(1, min, max).findFirst().getAsInt());

        String y = Integer.toString(Elevator.currentFloor);

        String z = Integer.toString(Building.FLOOR_TO_IGNORE);

        String a = setFloorNumber();

        // Check that when setting the randomly generated floor number, the
        // number is not the same as the floor from which the customer is
        // calling the elevator and that the random number is not a floor that
        // the Building class requests to ignore.
        x = (x == y) || (x == z) ? a : x;

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
    void setRideState (RideState currentRideState) {
        this.currentRideState = currentRideState;
    }

    public void move () {
        // Customer either enters or exit the elevator
        this.currentRideState = currentRideState.move();
    }

    public void pressElevatorButton () {
        // In a real case scenario, it would be the actual button pressed by the
        // Customer which would determine either the floor number or any other
        // button/function available to be selected within the elevator
        String command = getFloorNumber();

        this.currentRideState.pressElevatorButton(command);
    }
}