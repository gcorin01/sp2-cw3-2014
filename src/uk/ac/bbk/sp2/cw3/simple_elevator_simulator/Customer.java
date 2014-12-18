/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;
import java.util.Random;

/**
 * @author gcorin01
 *
 */
public class Customer {
    private int id;
    private RideState stateVar;
    private int desiredFloor;

    public Customer(int id) {
	setId(id); // ID comes from customerList index created in Building
	setDesiredFloor();
	
	this.stateVar = RideState.awaitingElevator;
	    stateVar.stateEnter(this);
    }

    /**
     * @return the id
     */
    public int getId() {
	return id;
    }
    
    /**
     * @param id
     *            the id to set
     */
    public void setId(int id) {
	this.id = id;
    }
    
    /**
     * @return the desiredFloor
     */
    public int getDesiredFloor() {
	return desiredFloor;
    }

    public void setDesiredFloor() {
	// TODO change this method so that the implementation of the random number is moved outside of this class
	// TODO set MAX and MIN floor number in Building class
	int max = 10;
	int min = 0;
	
	Random r = new Random();
	this.desiredFloor = r.ints(1, min, max).findFirst().getAsInt();
    }


    void move(Customer cust) {
	
    }

    void selectElevatorCommand(Customer cust) {
	
    }

    // Set the new state
    public void setState(RideState newState) {
	stateVar.stateExit(this);
	this.stateVar = newState;
	stateVar.stateEnter(this);
    }
}