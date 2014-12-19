/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

/**
 * @author Gabriel
 *
 */
public abstract class RideState {

    public abstract void pressElevatorButton(Customer cust);

    public abstract void move(Customer cust);

}
