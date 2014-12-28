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
        this.flagDescription = "In Elevator";
    }

    @Override
    public void pressElevatorButton (Customer customer) throws Exception {
        try {
            // Customer selects the desired destination floor which is
            // customer.toFloorNumber
            customer.setToFloorNumber();

            System.out.println("Customer #" + customer.getId()
                    + " requested to be taken to floor number "
                    + customer.getToFloorNumber());
        } catch (Exception e) {
            System.err.println("Customer #" + customer.getId()
                    + " could not select the desired floor.");
        }
    }

    @Override
    public RideState move (Customer customer) throws Exception {
        try {
            // Customer has arrived to the desired floor and exits the Elevator
            // and the RideState/flag is changed to "Arrived"
            System.out.println("Customer #" + customer.getId()
                    + " has exited at floor number "
                    + customer.getToFloorNumber());

            return new ArrivedState();
        } catch (Exception e) {
            System.err.println("Customer #" + customer.getId()
                    + " was not able to exit at floor number "
                    + customer.getToFloorNumber());

            // If for any reason the customer is unable to leave the elevator,
            // the RideState/flag remains as "In Elevator"
            return customer.getRideState();
        }
    }
}