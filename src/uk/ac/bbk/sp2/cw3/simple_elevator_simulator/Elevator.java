/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

import java.util.*;

/**
 * @author gcorin01
 *
 */
public class Elevator {
    private int                   currentFloor = 0;
    private static int            floorVisited = 0;
    public static List<Customer>  registerList = new ArrayList<Customer>();
    private ListIterator<Integer> floorsToStop = null;

    /**
     * Class constructor.
     * 
     * @param customerList
     * @throws Exception
     */
    public Elevator(ArrayList<Customer> customerList) throws Exception {
        floorsToStop = getFloorsToStop(customerList);
        move(customerList);
    }

    private void move (ArrayList<Customer> customerList) throws Exception {

        while (floorsToStop.hasNext()) {
            currentFloor = floorsToStop.next();
            floorVisited++;
            System.out.println("Current floor: " + currentFloor);

            for (Customer c : customerList) {
                if (((c.getToFloorNumber() != null) && Integer.parseInt(c
                        .getToFloorNumber()) == currentFloor)
                        && (c.getRideState().getFlagDescription() != "Arrived")) {

                    c.move();
                } else if ((Integer.parseInt(c.getAtFloorNumber()) == currentFloor)
                        && c.getRideState().getFlagDescription() != "Arrived") {

                    c.move();
                    c.pressElevatorButton();
                    floorsToStop.add(Integer.parseInt(c.getToFloorNumber()));
                }
            }
        }
        System.out.println("\nTotal number of floor visited: " + floorVisited);
    }

    private ListIterator<Integer> getFloorsToStop (
            ArrayList<Customer> customerList) {
        List<Integer> tempFloorsToStop = new ArrayList<Integer>();

        for (Customer c : customerList) {
            if (c.getRideState().getFlagDescription() != "Arrived") {
                tempFloorsToStop.add(Integer.parseInt(c.getAtFloorNumber()));
            }
        }
        return floorsToStop = tempFloorsToStop.listIterator();
    }

    /**
     * @return the atFloorNumber or toFloorNumber
     */
    public static String getFloorNumber (Customer c) {
        return setFloorNumber(c);
    }

    private static String setFloorNumber (Customer c) {
        int max = Building.highestFloorNumber;
        int min = Building.lOWEST_FLOOR_NUMBER;

        Random r = new Random();

        // Random number creation
        String x = Integer.toString(min + r.nextInt(max - min + 1));

        // Current floor
        String y = c.getAtFloorNumber();

        // Floor to ignore
        String z = Integer.toString(Building.FLOOR_TO_IGNORE);

        // Check that when setting the randomly generated floor number, the
        // number for the toFloorNumber variable is not the same as the floor
        // from which the customer is calling the elevator and that the random
        // number is not a floor that the Building class requests to ignore.
        x = (x.equals(y) || x.equals(z)) ? setFloorNumber(c) : x;

        return x;
    }
}
