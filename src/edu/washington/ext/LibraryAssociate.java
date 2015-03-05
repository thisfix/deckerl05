package edu.washington.ext;

// TODO: Auto-generated Javadoc
/**
 * The Class LibraryAssociate.
 */
public class LibraryAssociate extends LibraryEmployee {
	
	/** The commision rate. */
	private double commisionRate;

	/**
	 * Instantiates a new library associate.
	 *
	 * @param name the name
	 */
	public LibraryAssociate(String name) {
		super(name);
	}
	
	/**
	 * Sets the commision rate.
	 *
	 * @param rate the new commision rate
	 */
	public void setCommisionRate(double rate){
		this.commisionRate = rate;
	}
	
	/* (non-Javadoc)
	 * @see edu.washington.ext.LibraryEmployee#calculatePay()
	 */
	@Override
	public double calculatePay() {
		
		return (super.calculatePay()+(super.getCurrentSales()*this.commisionRate));
	}
	

}
