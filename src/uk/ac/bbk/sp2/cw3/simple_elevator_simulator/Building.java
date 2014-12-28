package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

/**
 * Building class creates a simulated environment where an elevator can operate
 * and customers can use the elevator. 
 * <p>
 * This is Coursework Three to be submitted
 * for the purposes of Birkbeck, University of London's module Software and
 * Programming II (2014_15).
 * 
 * @author gcorin01
 * @version %i%, 28 December 2014
 */
public class Building {

    public static final int FLOOR_TO_IGNORE      = 13;
    public static final int numOfFloors          = 20;                     // TODO
                                                                            // obtain
                                                                            // from
                                                                            // user
    public static final int lOWEST_FLOOR_NUMBER  = 0;
    public static final int HIGHEST_FLOOR_NUMBER = lOWEST_FLOOR_NUMBER
                                                         + numOfFloors + 1;
    Elevator                elevator             = new Elevator();

}
