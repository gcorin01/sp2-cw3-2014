/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

/**
 * @author gcorin01
 *
 */
public class AwaitingElevatorState extends RideState {
    public String flag = null;

    public AwaitingElevatorState() {
        this.flag = "Awaiting Elevator";
    }

    @Override
    public void pressElevatorButton (Customer customer, String command) {
        callElevator(customer, command);
    }

    private void callElevator (Customer customer, String command) {
        // Command is the customer.atFloorNumber
        int n = Integer.parseInt(command);
        
        Elevator.requestedFloorToStop.add(n);

        System.out.println("Customer #" + customer.getId()
                + " is waiting for the elevator at floor number " + n);
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