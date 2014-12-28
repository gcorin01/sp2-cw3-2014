/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

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