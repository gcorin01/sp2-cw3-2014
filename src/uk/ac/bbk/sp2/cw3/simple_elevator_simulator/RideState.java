/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

/**
 * @author Gabriel
 *
 */
public abstract class RideState {
    static RideState initialState;
    static final RideState awaitingElevator = new AwaitingElevatorState();
    static final RideState inElevator = new OnboardElevatorState();

	protected RideState() {
	    if (initialState == null) initialState = this;
    }

    public abstract void selectElevatorCommand(Customer cust);

    public abstract void move(Customer cust);

    abstract void stateExit(Customer cust);

    abstract void stateEnter(Customer cust);

}
