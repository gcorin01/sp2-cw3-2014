package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

/**
 * AwaitingElevator is the fist amongst the various states in which a customer
 * can be within this simulated environment. This is a concrete state class
 * which extends the RideState abstract class. When a customer
 * <code>pressElevatorButton</code> while being in this state, the elevator is
 * called to stop at a specific floor ( <code>atFloorNumber</code>) enabling the
 * customer to get-in. When a customer <code>move()</code> while being in this
 * state, the respective action to be simulated is to enter the elevator and the
 * customer state/flag is changed from "Awaiting Elevator" to "In Elevator".
 * <p>
 * The other classes forming the state design pattern are as follows:
 * <ul>
 * <li>Context/driver state class: <code>Customer</code>;
 * <li>Abstract state class: <code>RideState</code>;
 * <li>Concrete state class: <code>OnboardElevatorState</code>;
 * <li>Concrete state class: <code>ArrivedState</code>.
 * </ul>
 * <p>
 * This is Coursework Three to be submitted for the purposes of Birkbeck,
 * University of London's module Software and Programming II (2014_15).
 * 
 * @author gcorin01
 * @version %i%, 28 December 2014
 */
public class AwaitingElevatorState extends RideState {

    /**
     * Class constructor where the flag/state description is generated
     */
    public AwaitingElevatorState() {
        setFlagDescription("Awaiting Elevator");
    }

    /**
     * Calls the Elevator at a randomly generated floor number. Implements the
     * abstract method
     * 
     * @param customer
     * @throws Exception
     *             if for any reason the <code>customer.atFloorNumber</code>
     *             cannot be set or the customer is null
     */
    @Override
    public void pressElevatorButton (Customer customer) throws Exception {
        try {
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

    /**
     * Moves the customer inside the Elevator and changes the customer's
     * RideState/flag to "In Elevator"
     * 
     * @param customer
     * @return the customer "In Elevator" <code>currentRideState</code> if moved
     *         successfully or the unchanged <code>currentRideState</code> which
     *         in this case would be null
     * @throws Exception
     *             if for any reason the customer is unable to enter the
     *             elevator. For example, in future developments, it might be
     *             that the max number of customers in the elevator is checked
     *             and the customer cannot board the elevator when it's already
     *             full
     */
    @Override
    public RideState move (Customer customer) throws Exception {
        try {
            Elevator.registerList.add(customer);
            System.out.println("Customer #" + customer.getId()
                    + " has boarded the elevator at floor number "
                    + customer.getAtFloorNumber());

            // The RideStete/flag is set to "In Elevator"
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