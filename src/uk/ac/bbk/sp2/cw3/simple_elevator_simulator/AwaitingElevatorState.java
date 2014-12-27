/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

/**
 * @author gcorin01
 *
 */
public class AwaitingElevatorState extends RideState {

    public AwaitingElevatorState() {

    }

    @Override
    public void pressElevatorButton (String atFloorNumber) {
        callElevator(atFloorNumber);
    }

    private void callElevator (String atFloorNumber) {
        int n = Integer.parseInt(atFloorNumber);
        Elevator.requestedFloorToStop.add(n);

        System.out
                .println("A customer is waiting for the elevator at floor number "
                        + atFloorNumber);
    }

    @Override
    public RideState move () {
        // TODO trigger customerJoins in Elevator class
        return setStateToOnboardElevator();
    }

    public RideState setStateToOnboardElevator () {
        System.out.println("A customer has borded the elevator");

        return new OnboardElevatorState();
    }
}