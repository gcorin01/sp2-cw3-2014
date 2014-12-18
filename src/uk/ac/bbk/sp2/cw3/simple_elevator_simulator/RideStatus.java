/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

/**
 * @author Gabriel
 *
 */
public abstract class RideStatus {

    public abstract void selectElevatorCommand(Customer cust);

    public abstract void move(Customer cust);

}
