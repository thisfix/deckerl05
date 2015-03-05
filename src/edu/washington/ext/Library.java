package edu.washington.ext;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class Library.
 */
public class Library {
	
	/** The library number. */
	private int libraryNumber;
	
	/** The payroll list. */
	private List<PayrollRecord> payrollList = new ArrayList<PayrollRecord>();
	
	/** The staff. */
	private List<LibraryEmployee> staff = new ArrayList<LibraryEmployee>();
	
	/** The librarian. */
	private Librarian librarian = null;
	
	/**
	 * Instantiates a new library.
	 *
	 * @param number the number
	 */
	public Library(int number){
		this.libraryNumber = number;
	}
	
	/**
	 * Gets the library number.
	 *
	 * @return the library number
	 */
	public int getLibraryNumber(){
		return libraryNumber;
	}
	
	/**
	 * Process payroll.
	 *
	 * @return the list
	 */
	public List<PayrollRecord> processPayroll(){
		getCurrentUsedBookSales();
		return payrollList;
	}
	
	/**
	 * Gets the current used book sales.
	 *
	 * @return the current used book sales
	 */
	public double getCurrentUsedBookSales(){
		double usedBookSales = 0;
		for (Iterator<LibraryEmployee> i = staff.iterator(); i.hasNext(); ){
			LibraryEmployee emp = i.next();
			usedBookSales += emp.getCurrentSales();
			PayrollRecord record = new PayrollRecord(emp.getName(), emp.calculatePay());
			payrollList.add(record);
		}
		usedBookSales += this.librarian.getCurrentLibrarianUsedBookTotals();
		librarian.setCurrentLibraryUsedBookSalesTotals(usedBookSales);
		PayrollRecord record = new PayrollRecord(librarian.getName(), librarian.calculatePay());
		payrollList.add(record);
		return usedBookSales;
	}
	
	/**
	 * Adds the employee.
	 *
	 * @param employee the employee
	 */
	public void addEmployee(LibraryEmployee employee){
		staff.add(employee);
//		PayrollRecord record = new PayrollRecord(employee.getName(), employee.calculatePay());
//		payrollList.add(record);
//		setLibrarianTotalUsedBookSales();
		
	}
	
	/**
	 * Sets the librarian.
	 *
	 * @param librarian the new librarian
	 */
	public void setLibrarian(Librarian librarian){
		this.librarian = librarian;
	}

}
