package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

/**
 * ArrivedState is the final state class of a customer ride on the elevator. It
 * extends the <code>RideState</code> abstract class. This is a concrete state
 * class amongst the various states in which a customer can be within this
 * simulated environment. A customer cannot <code>pressElevatorButton</code> or
 * <code>move()</code> while being in this state as they have already reached
 * the desired floor number ( <code>toFloorNumber</code>) and they have already
 * exited the elevator.
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

    /**
     * Class constructor where the flag/state description is generated
     */
    public ArrivedState() {
        setFlagDescription("Arrived");
    }

    /**
     * Method not implemented as it should never be called
     * 
     * @param customer
     * @throws Exception
     *             if for any reason this method is called while the customer is
     *             in this RideState
     */
    @Override
    public void pressElevatorButton (Customer customer) throws Exception {
        throw new Exception("Customer has arrived and is not allowed to"
                + " select another button of the elevator.");
    }

    /**
     * Method not implemented as it should never be called
     * 
     * @param customer
     * @return nothing
     * @throws Exception
     *             if for any reason this method is called while the customer is
     *             in this RideState
     */
    @Override
    public RideState move (Customer customer) throws Exception {
        throw new Exception("Customer has altrady exited the elevator.");
    }
}
