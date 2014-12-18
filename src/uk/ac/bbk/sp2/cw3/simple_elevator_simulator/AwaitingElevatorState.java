/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;



/**
 * @author Gabriel
 *
 */
public class AwaitingElevatorState extends RideState {
    
     @Override
    public void move(Customer cust) {
	 if (Elevator.currentFloor == cust.getDesiredFloor()) {
	     // TODO change RideState to OnboardElevatorState
	 }
	
    }

    @Override
    public void selectElevatorCommand(Customer cust) {
	cust.setDesiredFloor();
    }
    
    @Override
    protected void stateExit(Customer cust) {
	
    }

    @Override
    protected void stateEnter(Customer cust) {
    
    }
}
