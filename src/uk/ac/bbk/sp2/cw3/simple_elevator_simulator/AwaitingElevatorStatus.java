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
    public void move() {
	Elevator.customersOnBoardCount ++;
	
    }

    @Override
    public void selectElevatorCommand() {
	// TODO Auto-generated method stub
	
    }

}
