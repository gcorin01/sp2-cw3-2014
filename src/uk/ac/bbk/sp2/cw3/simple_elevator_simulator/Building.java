/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

/**
 * @author gcorin01
 *
 */
public class Building {

    public static final int FLOOR_TO_IGNORE      = 13;
    public static final int numOfFloors          = 20; // TODO obtain from user
    public static final int lOWEST_FLOOR_NUMBER  = 0;
    public static final int HIGHEST_FLOOR_NUMBER = lOWEST_FLOOR_NUMBER
                                                         + numOfFloors + 1;
    Elevator elevator = new Elevator();

}
