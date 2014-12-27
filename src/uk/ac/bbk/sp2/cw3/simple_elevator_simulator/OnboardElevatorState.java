/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

/**
 * @author gcorin01
 *
 */
public class OnboardElevatorState extends RideState {
    public String flag = null;

    public OnboardElevatorState() {
        this.flag = "In Elevator";
    }

    @Override
    public void pressElevatorButton (Customer customer, String command) {
        setDesiredFloor(customer, command);
    }

    private void setDesiredFloor (Customer customer, String command) {
        // Command is the customer.toFloorNumber
        int n = Integer.parseInt(command);
                
        Elevator.requestedFloorToStop.add(n);

        System.out.println("A customer #" + customer.getId()
                + " requested to be taken to floor number " + n);
    }

    @Override
    public RideState move () {
        exitElevator();

        // Customer has arrived to the desired floor and can be destroyed
        return new ArrivedState();
    }

    private void exitElevator () {
        // TODO Remove customer from Elevator customerLeaves(customer) >
        // registerList

        System.out.println("A customer has exited the elevator");
    }
}