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
    private int       id;
    private RideState stateVar;
    int               atFloorNumber;
    int               toFloorNumber;

    public Customer(int id) {
        setId(id); // ID comes from customerList index created in Building
        // setDesiredFloor(); this needs to be controlled by the OnboardElevator
        this.atFloorNumber = getFloorNumber();
        initialiseCustomer(this);
    }

    private void initialiseCustomer (Customer cust) {
        this.stateVar = new AwaitingElevatorState(cust);
        stateVar.pressElevatorButton(cust);
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
        @SuppressWarnings("unused")
        int floorNumber;
        // TODO Add a functional interface (or SAM interface) to change this
        // method so that the implementation of the random number is moved
        // outside of this class
        // TODO set MAX and MIN floor number in Building class
        int max = 10;
        int min = 0;

        Random r = new Random();

        return floorNumber = r.ints(1, min, max).findFirst().getAsInt();
    }

    void move (Customer cust) {

    }

    void pressElevatorButton (Customer cust) {

    }
}