/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

/**
 * @author gcorin01
 *
 */
public abstract class RideState {

    protected Customer customer = null;
    protected String command = null; 

    public abstract void pressElevatorButton (Customer customer, String command);

    public abstract RideState move ();
}
