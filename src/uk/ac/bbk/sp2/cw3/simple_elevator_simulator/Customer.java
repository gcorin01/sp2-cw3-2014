/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;
import java.util.Random;

/**
 * @author Gabriel
 *
 */
public class Customer {
    private int id;
    int desiredFloor;

    public Customer(int id) {
	setId(id);
    }

    public void setDesiredFloor() {
	// TODO set MAX and MIN floor number in Building class
	int max = 10;
	int min = 0;
	
	Random r = new Random();
	desiredFloor = r.ints(1, min, max).findFirst().getAsInt();
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

    public static int getCurrentFloor() {
	// TODO Auto-generated method stub
	return 0;
    }

    public static int getDestinationFloor() {
	// TODO Auto-generated method stub
	return 0;
    }

    public boolean inElevator() {
	return false;
	// TODO Auto-generated method stub

    }

    public boolean arrived() {
	// TODO Auto-generated method stub
	return false;
    }

}
