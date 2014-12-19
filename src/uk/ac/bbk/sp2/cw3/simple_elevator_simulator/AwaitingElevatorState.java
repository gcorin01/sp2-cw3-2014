/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

/**
 * @author gcorin01
 *
 */
public class AwaitingElevatorState extends RideState {

    public AwaitingElevatorState(RideState rideState) {
        this.customer = rideState.customer;
    }

    @Override
    public void pressElevatorButton () {
        callElevator();
    }

    private void callElevator () {
        Elevator.requestedFloorToStop.add(customer.atFloorNumber);

        System.out.println("Customer " + customer.getId()
                + " is waiting for the elevator at floor number "
                + customer.atFloorNumber);
    }

    @Override
    public void move () {
        if (Elevator.currentFloor == customer.atFloorNumber) {
            // TODO trigger customerJoins in Elevator class
            // change state to OnboardElevator;
        }
    }

    @Override
    public void setStateToAwaitingElevator () {
        // No need to implement as this is already the current RideState
    }

    @Override
    public void setStateToOnboardElevator () {
        this.customer.setRideState(new OnboardElevatorState(this));
        
        System.out.println("Customer " + customer.getId()
                + " is inside the elevator");
    }
}