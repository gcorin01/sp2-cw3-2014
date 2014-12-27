/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

/**
 * @author gcorin01
 *
 */
public class ArrivedState extends RideState {
    public String flag = null;
    
    public ArrivedState() {
        this.flag = "Arrived";
    }
    
    @Override
    public void pressElevatorButton (Customer customer, String command) {
        // No need to implement

    }

    @Override
    public RideState move () {
        // TODO No need to implement
        return null;
    }

}
