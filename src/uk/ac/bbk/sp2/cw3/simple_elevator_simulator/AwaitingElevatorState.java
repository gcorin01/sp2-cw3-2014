/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

/**
 * @author gcorin01
 *
 */
public class AwaitingElevatorState extends RideState {

    @Override
    public void move(Customer cust) {
	if (Elevator.currentFloor == cust.getDesiredFloor()) {
	    // TODO trigger customerJoins in Elevator class
	    cust.setState(inElevator);
	}
    }

    @Override
    public void selectElevatorCommand(Customer cust) {
	callElevator(desiredFloor);
    }

    @Override
    protected void stateExit(Customer cust) {

    }

    @Override
    protected void stateEnter(Customer cust) {

    }
}
