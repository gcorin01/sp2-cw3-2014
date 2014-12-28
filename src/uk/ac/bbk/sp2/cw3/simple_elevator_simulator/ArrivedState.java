package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

/**
 * ArrivedState is the final stage of a customer <code>RideState</code> in the
 * elevator. This is a concrete state class amongst the various states in which
 * a customer can be within this simulated environment. A customer cannot
 * <code>pressElevatorButton</code> or <code>move()</code> while being in this
 * state as they have already reached the desired floor number (
 * <code>toFloorNumber</code>) and they have already exited the elevator.
 * <p>
 * The other classes forming the state design pattern are as follows:
 * <ul>
 * <li>Context/driver state class: <code>Customer</code>;
 * <li>Abstract state class: <code>RideState</code>;
 * <li>Concrete state class: <code>AwaitingElevator</code>;
 * <li>Concrete state class: <code>OnboardElevatorState</code>.
 * </ul>
 * <p>
 * This is Coursework Three to be submitted for the purposes of Birkbeck,
 * University of London's module Software and Programming II (2014_15).
 * 
 * @author gcorin01
 * @version %i%, 28 December 2014
 */
public class ArrivedState extends RideState {

    public ArrivedState() {
        setFlagDescription("Arrived");
    }

    @Override
    public void pressElevatorButton (Customer customer) throws Exception {
        // No need to implement

        throw new Exception("Customer has arrived and is not allowed to"
                + " select another button of the elevator.");
    }

    @Override
    public RideState move (Customer customer) throws Exception {
        // No need to implement

        throw new Exception("Customer has altrady exited the elevator.");
    }
}
