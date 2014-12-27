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
        this.flagDescription = "Awaiting Elevator";
    }

    @Override
    public void pressElevatorButton (Customer customer, String command)
            throws Exception {
        try {
            // Command is to call the Elevator at customer.atFloorNumber
            int n = Integer.parseInt(command);

            Elevator.requestedFloorToStop.add(n);

            System.out.println("Customer #" + customer.getId()
                    + " is waiting for the elevator at floor number " + n);
        } catch (Exception e) {
            System.err.println("A customer #" + customer.getId()
                    + " could not call the elevator.");
            e.printStackTrace();
        }
    }

    @Override
    public RideState move (Customer customer) throws Exception {
        // Customer enters the Elevator
        try {
            Elevator.customerJoins.add(customer);
            System.out.println("Customer #" + customer.getId()
                    + " has boarded the elevator at floor number");

            return new OnboardElevatorState();
        } catch (Exception e) {
            System.err.println("Customer cannot enter the elevator.");
            e.printStackTrace();

            return customer.getRideState();
        }
    }
}