/**
 * 
 */
package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

/**
 * @author gcorin01
 *
 */
public abstract class RideState {

    private String   flagDescription = null;

    /**
     * @return the flagDescription
     */
    public String getFlagDescription () {
        return flagDescription;
    }

    /**
     * @param flagDescription the flagDescription to set
     */
    protected void setFlagDescription (String flagDescription) {
        this.flagDescription = flagDescription;
    }

    public abstract void pressElevatorButton (Customer customer)
            throws Exception;

    public abstract RideState move (Customer customer) throws Exception;
}
