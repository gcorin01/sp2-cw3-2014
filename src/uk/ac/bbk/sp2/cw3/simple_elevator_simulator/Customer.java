/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

/**
 * @author Gabriel
 *
 */
public class Customer {
    private int id;
    private int desiredFloor;

    public Customer(int id, int desiredFloor) {
        setId(id);
        setDesiredFloor(desiredFloor);
    }
    
    /**
     * @return the id
     */
    public int getId () {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId (int id) {
        this.id = id;
    }

    /**
     * @return the desiredFloor
     */
    public int getDesiredFloor () {
        return desiredFloor;
    }

    /**
     * @param desiredFloor
     *            the desiredFloor to set
     */
    public void setDesiredFloor (int desiredFloor) {
        this.desiredFloor = desiredFloor;
    }

    public static int getCurrentFloor () {
        // TODO Auto-generated method stub
        return 0;
    }

    public static int getDestinationFloor () {
        // TODO Auto-generated method stub
        return 0;
    }

    public boolean inElevator () {
        return false;
        // TODO Auto-generated method stub

    }

    public boolean arrived () {
        // TODO Auto-generated method stub
        return false;
    }

}
