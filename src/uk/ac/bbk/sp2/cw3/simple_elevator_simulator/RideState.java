/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

/**
 * @author gcorin01
 *
 */
public abstract class RideState {

    //protected RideState awaitingElevatorState;
    //protected RideState onboardElevatorState;

    public abstract void pressElevatorButton (String command);

    public abstract RideState move ();
}
