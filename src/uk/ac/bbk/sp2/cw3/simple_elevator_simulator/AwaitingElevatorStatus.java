/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;



/**
 * @author Gabriel
 *
 */
public class AwaitingElevatorStatus extends RideStatus {
    
     @Override
    public void move(Customer cust) {
	 if (Elevator.currentFloor == cust.getDesiredFloor()) {
	     // TODO change Ride Status to OnboardElevatorStatus
	 }
	
    }

    @Override
    public void selectElevatorCommand(Customer cust) {
	cust.setDesiredFloor();
    }

}
