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
    public void pressElevatorButton (Customer customer, String command)
            throws Exception {
        try {
            // Command is to select the desired floor which is
            // customer.toFloorNumber
            int n = Integer.parseInt(command);

            Elevator.requestedFloorToStop.add(n);

            System.out.println("A customer #" + customer.getId()
                    + " requested to be taken to floor number " + n);
        } catch (Exception e) {
            System.err.println("A customer #" + customer.getId()
                    + " could not select the desired floor.");
            e.printStackTrace();
        }
    }

    @Override
    public RideState move (Customer customer) throws Exception {
        try {
            // Customer exit the Elevator
            // TODO Remove customer from Elevator customerLeaves(customer) >
            // registerList

            // Customer has arrived to the desired floor
            System.out.println("A customer #" + customer.getId()
                    + " has exited the elevator");

            return new ArrivedState();
        } catch (Exception e) {
            System.err.println("Customer #" + customer.getId()
                    + " cannot be moved.");
            e.printStackTrace();

            return customer.getRideState();
        }
    }
}