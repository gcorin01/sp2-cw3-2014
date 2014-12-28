package uk.ac.bbk.sp2.cw3.simple_elevator_simulator;

/**
 * RideState is the abstract state class for the various states in which a
 * customer can be within this simulated environment. The other classes forming
 * the state design pattern are as follows:
 * <ul>
 * <li>Context/driver state class: <code>Customer</code>;
 * <li>Concrete state class: <code>AwaitingElevatorState</code> which extends
 * this (RideState) class;
 * <li>Concrete state class: <code>OnboardElevatorState</code> which extends
 * this (RideState) class;
 * <li>Concrete state class: <code>ArrivedState</code> which extends this
 * (RideState) class.
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
     *            the customer state or flagDescription to set in each subclass
     *            of this abstract class
     */
    protected void setFlagDescription (String flagDescription) {
        this.flagDescription = flagDescription;
    }

    /**
     * Abstract method implemented in the relevant subclasses of this class
     * 
     * @param customer
     * @throws Exception
     */
    public abstract void pressElevatorButton (Customer customer)
            throws Exception;

    /**
     * Abstract method implemented in the relevant subclasses of this class
     * 
     * @param customer
     * @return the customer RideState at any given time which is implemented in
     *         this abstract class' subclass
     * @throws Exception
     */
    public abstract RideState move (Customer customer) throws Exception;
}
