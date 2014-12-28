/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

/**
 * @author gcorin01
 *
 */
public abstract class RideState {

    protected Customer customer        = null;
    protected String   command         = null;
    protected String   flagDescription = null;

    public abstract void pressElevatorButton (Customer customer)
            throws Exception;

    public abstract RideState move (Customer customer) throws Exception;
}
