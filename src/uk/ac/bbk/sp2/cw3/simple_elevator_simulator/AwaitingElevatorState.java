package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

/**
 * AwaitingElevator is the fist amongst the various states in which a customer
 * can be within this simulated environment. This is a concrete state class.
 * When a customer <code>pressElevatorButton</code> while being in this state,
 * the elevator is called to stop at a specific floor (
 * <code>atFloorNumber</code>) enabling the customer to get-in. When a customer
 * <code>move()</code> while being in this state, the respective action to be
 * simulated is to enter the elevator.
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

    public AwaitingElevatorState() {
        setFlagDescription("Awaiting Elevator");
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