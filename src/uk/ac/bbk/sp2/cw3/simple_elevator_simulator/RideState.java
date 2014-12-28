package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

/**
 * RideState is the abstract state class for the various states in which a
 * customer can be within this simulated environment. The other classes forming
 * the state design pattern are as follows:
 * <ul>
 * <li>Context/driver state class: <code>Customer</code>;
 * <li>Concrete state class: <code>AwaitingElevatorState</code>;
 * <li>Concrete state class: <code>OnboardElevatorState</code>;
 * <li>Concrete state class: <code>ArrivedState</code>.
 * </ul>
 * <p>
 * This is Coursework Three to be submitted for the purposes of Birkbeck,
 * University of London's module Software and Programming II (2014_15).
 * 
 * @author gcorin01
 * @version %i%, 28 December 2014
 */
public abstract class RideState {

    private String flagDescription = null;

    /**
     * @return the flagDescription
     */
    public String getFlagDescription () {
        return flagDescription;
    }

    /**
     * @param flagDescription
     *            the flagDescription to set
     */
    protected void setFlagDescription (String flagDescription) {
        this.flagDescription = flagDescription;
    }

    public abstract void pressElevatorButton (Customer customer)
            throws Exception;

    public abstract RideState move (Customer customer) throws Exception;
}
