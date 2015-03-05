package edu.washington.ext;

// TODO: Auto-generated Javadoc
/**
 * The Class Librarian.
 */
public class Librarian implements Employee {
	
	/** The bonus rate. */
	private static double bonusRate;
	
	/** The name. */
	private String name;
	
	/** The base pay. */
	private double basePay;
	
	/** The current library totals. */
	private double currentLibraryTotals;
	
	/** The current librarian totals. */
	private double currentLibrarianTotals;
	
	/* (non-Javadoc)
	 * @see edu.washington.ext.Employee#getName()
	 */
	@Override
	public String getName() {
		return this.name;
	}

	/* (non-Javadoc)
	 * @see edu.washington.ext.Employee#calculatePay()
	 */
	@Override
	public double calculatePay() {
		return basePay+(bonusRate*currentLibraryTotals);
	}
	
	/**
	 * Instantiates a new librarian.
	 *
	 * @param name the name
	 */
	public Librarian(String name){
		this.name = name;
		
	}
	
	/**
	 * Sets the bonus rate.
	 *
	 * @param rate the new bonus rate
	 */
	public static void setBonusRate(double rate){
		bonusRate = rate;
	}
	
	/**
	 * Sets the current librarian used book totals.
	 *
	 * @param totals the new current librarian used book totals
	 */
	public void setCurrentLibrarianUsedBookTotals(double totals){
		this.currentLibrarianTotals = totals;
	}
	
	/**
	 * Gets the current librarian used book totals.
	 *
	 * @return the current librarian used book totals
	 */
	public double getCurrentLibrarianUsedBookTotals(){
		return this.currentLibrarianTotals;
	}
	
	/**
	 * Sets the base pay.
	 *
	 * @param base_pay the new base pay
	 */
	public void setBasePay(double base_pay){
		this.basePay = base_pay;
	}
	
	/**
	 * Sets the current library used book sales totals.
	 *
	 * @param totals the new current library used book sales totals
	 */
	public void setCurrentLibraryUsedBookSalesTotals(double totals){
		this.currentLibraryTotals = totals;
	}
	
	/**
	 * Gets the current library used book sales totals.
	 *
	 * @return the current library used book sales totals
	 */
	public double getCurrentLibraryUsedBookSalesTotals(){
		return this.currentLibraryTotals;
	}

}
