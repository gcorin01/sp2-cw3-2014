package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

/**
 * Customer is the context/driver class of a state pattern to simulate the basic
 * interactions (press a button, move in or out) a person has when using an
 * elevator. The constructor of this class has the responsibility to trigger the
 * first customer state/flag which is "Awaiting Elevator". The other classes
 * forming the state design pattern are as follows:
 * <ul>
 * <li>Abstract state class: <code>RideState</code> which is an instance
 * variable of this (Customer) class;
 * <li>Concrete state class: <code>AwaitingElevatorState</code> set by the
 * constructor Customer class;
 * <li>Concrete state class: <code>OnboardElevatorState</code> set by the
 * AwaitingElevatorState class;
 * <li>Concrete state class: <code>ArrivedState</code> set by the
 * OnboardElevatorState class.
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

    /**
     * Class constructor.
     */
    public Customer() throws Exception {
        count++;
        setId(count);

        // If successfully set, the RideStete/flag is set to "Awaiting Elevator"
        setRideState(new AwaitingElevatorState());
        this.currentRideState.pressElevatorButton(this);
    }

    /**
     * @return the customer id
     */
    public int getId () {
        return id;
    }

    /**
     * @param id
     *            the customer id to set when creating an instance of this class
     */
    private void setId (int id) {
        this.id = id;
    }

    /**
     * @return the current rideState of an instance of this class
     */
    public RideState getRideState () {
        return currentRideState;
    }

    /**
     * Sets the RideState when constructing an instance of this class. All other
     * RideStates are set from within the respective RideState subclass
     * <code>move()</code> method
     * 
     * @param currentRideState
     *            the rideState to set when constructing an instance of this
     *            class
     */
    private void setRideState (RideState currentRideState) {
        this.currentRideState = currentRideState;
    }

    /**
     * @return the atFloorNumber which is the floor from which the elevator is
     *         called. It's the floor where the elevator needs to stop to let
     *         the customer in
     */
    public String getAtFloorNumber () {
        return atFloorNumber;
    }

    /**
     * Calls the method in the Elevator class to obtain a randomly generated
     * floor number
     */
    public void setAtFloorNumber () {
        this.atFloorNumber = Elevator.getFloorNumber(this);
    }

    /**
     * @return the toFloorNumber which is the customer's desired destination
     *         floor. It's the floor where the elevator needs to spot to let the
     *         customer out
     */
    public String getToFloorNumber () {
        return toFloorNumber;
    }

    /**
     * Calls the method in the Elevator class to obtain a randomly generated
     * floor number
     */
    public void setToFloorNumber () {
        this.toFloorNumber = Elevator.getFloorNumber(this);
    }

    /**
     * Moves the customer either in or out of the elevator
     * 
     * @exception e
     *                if for any reason a customer could not be moved, the
     *                console will display whether a specific customer could not
     *                get-in or get-out of the elevator at a specific floor. The
     *                exception is handled in the relevant RideState subclass
     */
    public void move () throws Exception {
        this.currentRideState = currentRideState.move(this);
    }

    /**
     * Tells the elevator to either stop for picking-up the customer or asks the
     * elevator to stop for letting the customer out of the elevator
     * 
     * @exception e
     *                if for any reason a customer cannot call the elevator or
     *                select the desired destination floor, the console will
     *                display whether a specific customer encountered such an
     *                issue. The exception is handled in the relevant RideState
     *                subclass
     */
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