/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

/**
 * @author gcorin01
 *
 */
public class AwaitingElevatorState extends RideState {
    private int atFloorNumber; // Floor number at which the customer is waiting
                               // for the elevator

    public AwaitingElevatorState(Customer cust) {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void move (Customer cust) {
        if (Elevator.currentFloor == atFloorNumber) {
            // TODO trigger customerJoins in Elevator class
            // change state to OnboardElevator;
        }
    }

    @Override
    public void pressElevatorButton (Customer cust) {
        callElevator(cust);
    }

    private void callElevator (Customer cust) {
        Elevator.requestedFloorToStop.add(cust.atFloorNumber);
        
        System.out.println("Customer " + cust.getId()
                + " is waiting for the elevator at floor number "
                + cust.atFloorNumber);
    }
}