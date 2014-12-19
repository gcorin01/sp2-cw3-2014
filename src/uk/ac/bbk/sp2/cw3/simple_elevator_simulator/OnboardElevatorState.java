/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

/**
 * @author gcorin01
 *
 */
public class OnboardElevatorState extends RideState {

    public OnboardElevatorState(RideState rideState) {
        this.customer = rideState.customer;
    }

    @Override
    // TODO Auto-generated method stub
    public void pressElevatorButton () {
        setDesiredFloor();
    }

    private void setDesiredFloor () {
        Elevator.requestedFloorToStop.add(customer.toFloorNumber);

        System.out.println("Customer " + customer.getId()
                + " requested to be taken to floor number "
                + customer.toFloorNumber);
    }

    @Override
    public void move () {
        exitElevator();

    }

    private void exitElevator () {
        // TODO Remove customer from Elevator registerList
        
    }

    @Override
    public void setStateToAwaitingElevator () {
        // No need to implement as the customer has just finished waiting for
        // the elevator

    }

    @Override
    public void setStateToOnboardElevator () {
        // No need to implement as this is already the current RideState

    }
}