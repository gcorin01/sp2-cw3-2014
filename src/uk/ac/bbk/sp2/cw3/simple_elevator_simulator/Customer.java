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
    private Integer   atFloorNumber    = null;
    private Integer   toFloorNumber    = null;

    public Customer(int id) {
        setId(id); // ID comes from customerList index created in Building
        // setDesiredFloor(); this needs to be controlled by the OnboardElevator

        this.atFloorNumber = getFloorNumber();
        System.out.println(this.atFloorNumber); // TODO Remove debug line

        initialiseCustomer(this.atFloorNumber);
    }

    private void initialiseCustomer (Integer atFloorNumber) {
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
    public int getFloorNumber () {
        return setFloorNumber();
    }

    private int setFloorNumber () {
        // TODO Add a functional interface (or SAM interface) to change this
        // method so that the implementation of the random number is moved
        // outside of this class
        // TODO set MAX and MIN floor number in Building class
        int max = 10;
        int min = 0;

        Random r = new Random();

        Integer x = r.ints(1, min, max).findFirst().getAsInt();

        Integer y = atFloorNumber;

        Integer z = setFloorNumber();

        // Only when setting the destination floor number, check that the
        // randomly generated toFloorNumber is not the same as the
        // atFloorNumber (that is, the same floor from which the customer is
        // calling the elevator).
        x = (y != null) && (x.toString() == y.toString()) ? z : x;

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
        // TODO trigger customerJoins in Elevator class
        this.currentRideState = this.currentRideState.move();
    }

    public void pressElevatorButton () {
        this.toFloorNumber = getFloorNumber();
        this.currentRideState.pressElevatorButton(toFloorNumber);
    }
}