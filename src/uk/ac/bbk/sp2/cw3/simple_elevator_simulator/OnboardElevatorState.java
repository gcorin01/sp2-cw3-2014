/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

/**
 * @author gcorin01
 *
 */
public class OnboardElevatorState extends RideState {

    public OnboardElevatorState() {

    }

    @Override
    public void pressElevatorButton (Integer toFloorNumber) {
        setDesiredFloor(toFloorNumber);
    }

    private void setDesiredFloor (Integer toFloorNumber) {
        Elevator.requestedFloorToStop.add(toFloorNumber);

        System.out.println("A customer requested to be taken to floor number "
                + toFloorNumber);
    }

    @Override
    public RideState move () {
        exitElevator();
        
        // Customer has arrived to the desired floor and can be destroyed
        return null;
    }

    private void exitElevator () {
        // TODO Remove customer from Elevator customerLeaves(customer) >
        // registerList

        System.out.println("A customer has exited the elevator");
    }
}