package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

/**
 * OnboardElevatorState is the second state amongst the various states in which
 * a customer can be within this simulated environment. This is a concrete state
 * class which extends the RideState abstract class. When a customer
 * <code>pressElevatorButton</code> while being in this state, the desired floor
 * destination number (<code>toFloorNumber</code>) is selected in order for the
 * elevator to stop and allow the customer to get-out. When a customer
 * <code>move()</code> while being in this state, the respective action to be
 * simulated is to exit the elevator and the customer state/flag is changed from
 * "In Elevator" to "Arrived".
 * <p>
 * The other classes forming the state design pattern are as follows:
 * <ul>
 * <li>Context/driver state class: <code>Customer</code>;
 * <li>Abstract state class: <code>RideState</code>;
 * <li>Concrete state class: <code>AwaitingElevator</code>;
 * <li>Concrete state class: <code>ArrivedState</code>.
 * </ul>
 * <p>
 * This is Coursework Three to be submitted for the purposes of Birkbeck,
 * University of London's module Software and Programming II (2014_15).
 * 
 * @author gcorin01
 * @version %i%, 28 December 2014
 */
public class OnboardElevatorState extends RideState {

    /**
     * Class constructor where the flag/state description is generated
     */
    public OnboardElevatorState() {
        setFlagDescription("In Elevator");
    }

    /**
     * Generates randomly the desired destination floor which
     * <code>customer.toFloorNumber</code>
     * 
     * @param customer
     * @throws Exception
     *             if for any reason the customer is unable to press the button
     */
    @Override
    public void pressElevatorButton (Customer customer) throws Exception {
        try {
            customer.setToFloorNumber();

            System.out.println("Customer #" + customer.getId()
                    + " requested to be taken to floor number "
                    + customer.getToFloorNumber());
        } catch (Exception e) {
            System.err.println("Customer #" + customer.getId()
                    + " could not select the desired floor.");
        }
    }

    /**
     * Moves the customer outside the Elevator and changes the customer's
     * <code>currentRideState</code> to "Arrived"
     * 
     * @param customer
     * @return the customer "Arrived" <code>currentRideState</code> if moved
     *         successfully or the unchanged <code>currentRideState</code> which
     *         in this case would be "In Elevator"
     * @throws Exception
     *             if for any reason the customer is unable to enter the
     *             elevator.
     */
    @Override
    public RideState move (Customer customer) throws Exception {
        try {
            System.out.println("Customer #" + customer.getId()
                    + " has exited at floor number "
                    + customer.getToFloorNumber());

            // The RideStete/flag is set to "Arrived"
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