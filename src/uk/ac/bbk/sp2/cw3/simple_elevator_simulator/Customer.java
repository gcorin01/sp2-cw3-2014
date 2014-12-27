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

        // In a real world scenario, it would be the actual button pressed by
        // the Customer which determines at which floor the elevator has been
        // called from and the desired floor a customer wants to go
        setAtFloorNumber();
        setToFloorNumber();

        initialiseCustomer(this.atFloorNumber);
    }

    private void initialiseCustomer (String atFloorNumber) throws Exception {
        setRideState(new AwaitingElevatorState());

        this.currentRideState.pressElevatorButton(this, atFloorNumber);
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

    /**
     * @param atFloorNumber
     *            the atFloorNumber to set
     * @return
     */
    private String setAtFloorNumber () {
        this.atFloorNumber = Building.getFloorNumber(this);

        return this.atFloorNumber;
    }

    /**
     * @return the toFloorNumber
     */
    public String getToFloorNumber () {
        return toFloorNumber;
    }

    /**
     * @param toFloorNumber
     *            the toFloorNumber to set
     * @return
     */
    private String setToFloorNumber () {
        this.toFloorNumber = Building.getFloorNumber(this);

        return this.toFloorNumber;
    }

    public void move () throws Exception {
        // Currently Customer can either enters or exit the elevator
        
        try {
            this.currentRideState = currentRideState.move(this);
        } catch (Exception e) {
            System.err.println("Customer cannot be moved.");
            e.printStackTrace();
        }
    }

    public void pressElevatorButton (String command) throws Exception {
        // In a real case scenario, it would be the actual button pressed by the
        // Customer which would determine either the floor number or any other
        // function available to be selected within the elevator

        try {
            this.currentRideState.pressElevatorButton(this, command);
        } catch (Exception e) {
            System.err.println("Command not recognised.");
            e.printStackTrace();
        }
    }
}