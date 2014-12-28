/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

/**
 * @author gcorin01
 *
 */
public class ArrivedState extends RideState {

    public ArrivedState() {
        this.flagDescription = "Arrived";
    }

    @Override
    public void pressElevatorButton (Customer customer)
            throws Exception {
        // No need to implement

        throw new Exception(
                "Customer has arrived and is not allowed to"
                + " select another button of the elevator.");
    }

    @Override
    public RideState move (Customer customer) throws Exception {
        // No need to implement

        throw new Exception("Customer has altrady exited the elevator.");
    }
}
