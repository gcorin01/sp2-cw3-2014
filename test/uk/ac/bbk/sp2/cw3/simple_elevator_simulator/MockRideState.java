/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;



/**
 * @author Gabriel
 *
 */
public class MockRideState extends RideState {
    
    // Created to test the RideStatus abstract class
    @Override
    public RideState move(Customer customer) {
        
        return null;
    }

    @Override
    public void pressElevatorButton (Customer customer)
            throws Exception {
    }
}
