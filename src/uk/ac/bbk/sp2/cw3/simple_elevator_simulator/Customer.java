package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

/**
 * Customer is the context/driver class of a state pattern to simulate the basic
 * interactions (press a button, move in or out) a person has when using an
 * elevator. The other classes forming the state design pattern are as follows:
 * <ul>
 * <li>Abstract state class: <code>RideState</code>;
 * <li>Concrete state class: <code>AwaitingElevatorState</code>;
 * <li>Concrete state class: <code>OnboardElevatorState</code>;
 * <li>Concrete state class: <code>ArrivedState</code>.
 * </ul>
 * <p>
 * This is Coursework Three to be submitted for the purposes of Birkbeck,
 * University of London's module Software and Programming II (2014_15).
 * 
 * @author gcorin01
 * @version %i%, 28 December 2014
 */
public class Customer {
    static int        count            = 0;
    private int       id               = 0;
    private RideState currentRideState = null;
    private String    atFloorNumber    = null;
    private String    toFloorNumber    = null;

    public Customer() throws Exception {
        count++;
        setId(count);
        setRideState(new AwaitingElevatorState()); // If successful, The
                                                   // RideStete/flag is set to
                                                   // "Awaiting Elevator"
        this.currentRideState.pressElevatorButton(this);
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

    /**
     * @return the atFloorNumber
     */
    public String getAtFloorNumber () {
        return atFloorNumber;
    }

    public void setAtFloorNumber () {
        this.atFloorNumber = Elevator.getFloorNumber(this);
    }

    /**
     * @return the toFloorNumber
     */
    public String getToFloorNumber () {
        return toFloorNumber;
    }

    public void setToFloorNumber () {
        this.toFloorNumber = Elevator.getFloorNumber(this);
    }

    public void move () throws Exception {
        // Currently Customer can either enter or exit the elevator
        try {
            this.currentRideState = currentRideState.move(this);
        } catch (Exception e) {
            System.err.println("Customer cannot be moved.");
        }
    }

    public void pressElevatorButton () throws Exception {
        // Currently Customer can either call the elevator or select a
        // destination floor
        try {
            this.currentRideState.pressElevatorButton(this);
        } catch (Exception e) {
            System.err.println("Command not recognised.");
        }
    }
}