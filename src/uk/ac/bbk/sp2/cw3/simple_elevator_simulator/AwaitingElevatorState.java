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
    public void pressElevatorButton (Customer customer) throws Exception {
        try {
            // Customer calls the Elevator at customer.atFloorNumber
            customer.setAtFloorNumber();

            System.out.println("Customer #" + customer.getId()
                    + " is waiting for the elevator at floor number "
                    + customer.getAtFloorNumber());
        } catch (Exception e) {
            System.err.println("Customer #" + customer.getId()
                    + " could not call the elevator at floor number "
                    + customer.getAtFloorNumber());
        }
    }

    @Override
    public RideState move (Customer customer) throws Exception {
        // Customer enters the Elevator and the RideState/flag changes to
        // "In Elevator"
        try {
            Elevator.registerList.add(customer);
            System.out.println("Customer #" + customer.getId()
                    + " has boarded the elevator at floor number "
                    + customer.getAtFloorNumber());

            return new OnboardElevatorState();
        } catch (Exception e) {
            System.err.println("Customer #" + customer.getId()
                    + " was unable board the elevator at floor number "
                    + customer.getAtFloorNumber());

            // If for any reason the customer is unable to enter the elevator,
            // the RideState/flag will be null
            return customer.getRideState();
        }
    }
}