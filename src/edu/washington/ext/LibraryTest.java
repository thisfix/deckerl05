package edu.washington.ext;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class LibraryTest.
 */
public class LibraryTest {
	
	/** The library. */
	private Library library;
	
	/** The librarian. */
	private Librarian librarian;
	
	/** The library employee. */
	private LibraryEmployee libraryEmployee;
	
	/** The library associate1. */
	private LibraryAssociate libraryAssociate1;
	
	/** The library associate2. */
	private LibraryAssociate libraryAssociate2;
	
	/** The library associate3. */
	private LibraryAssociate libraryAssociate3;
	
	/** The librarian name. */
	private static String LIBRARIAN_NAME = "Librarian";
	
	/** The librarian base pay. */
	private static double LIBRARIAN_BASE_PAY = 4000.00;
	
	/** The librarian used book sales. */
	private static double LIBRARIAN_USED_BOOK_SALES = 10000.00;
	
	/** The librarian bonus rate. */
	private static double LIBRARIAN_BONUS_RATE = 0.005;
	
	/** The library employee name. */
	private static String LIBRARY_EMPLOYEE_NAME = "Library Employee";
	
	/** The library employee hourly rate. */
	private static double LIBRARY_EMPLOYEE_HOURLY_RATE = 10.50;
	
	/** The library employee current hours. */
	private static double LIBRARY_EMPLOYEE_CURRENT_HOURS = 160;
	
	/** The library employee current sales. */
	private static double LIBRARY_EMPLOYEE_CURRENT_SALES = 500.00;

	/** The LIBRAR y_ associat e1_ name. */
	private static String LIBRARY_ASSOCIATE1_NAME = "Library Associate #1";
	
	/** The LIBRAR y_ associat e1_ rate. */
	private static double LIBRARY_ASSOCIATE1_RATE = 12.50;
	
	/** The LIBRAR y_ associat e1_ curren t_ hours. */
	private static double LIBRARY_ASSOCIATE1_CURRENT_HOURS = 138;
	
	/** The LIBRAR y_ associat e1_ commisio n_ rate. */
	private static double LIBRARY_ASSOCIATE1_COMMISION_RATE = 0.02;
	
	/** The LIBRAR y_ associat e1_ curren t_ sales. */
	private static double LIBRARY_ASSOCIATE1_CURRENT_SALES = 15000.00;

	/** The LIBRAR y_ associat e2_ name. */
	private static String LIBRARY_ASSOCIATE2_NAME = "Library Associate #2";
	
	/** The LIBRAR y_ associat e2_ rate. */
	private static double LIBRARY_ASSOCIATE2_RATE = 14.50;
	
	/** The LIBRAR y_ associat e2_ curren t_ hours. */
	private static double LIBRARY_ASSOCIATE2_CURRENT_HOURS = 160;
	
	/** The LIBRAR y_ associat e2_ commisio n_ rate. */
	private static double LIBRARY_ASSOCIATE2_COMMISION_RATE = 0.02;
	
	/** The LIBRAR y_ associat e2_ curren t_ sales. */
	private static double LIBRARY_ASSOCIATE2_CURRENT_SALES = 30000.00;

	/** The LIBRAR y_ associat e3_ name. */
	private static String LIBRARY_ASSOCIATE3_NAME = "Library Associate #3";
	
	/** The LIBRAR y_ associat e3_ rate. */
	private static double LIBRARY_ASSOCIATE3_RATE = 15.00;
	
	/** The LIBRAR y_ associat e3_ curren t_ hours. */
	private static double LIBRARY_ASSOCIATE3_CURRENT_HOURS = 160;
	
	/** The LIBRAR y_ associat e3_ commisio n_ rate. */
	private static double LIBRARY_ASSOCIATE3_COMMISION_RATE = 0.03;
	
	/** The LIBRAR y_ associat e3_ curren t_ sales. */
	private static double LIBRARY_ASSOCIATE3_CURRENT_SALES = 45000.00;
	
	/** The librarian pay. */
	private static double LIBRARIAN_PAY = 4502.5;
	
	/** The library employee pay. */
	private static double LIBRARY_EMPLOYEE_PAY = 1680.0;
	
	/** The LIBRAR y_ associat e1_ pay. */
	private static double LIBRARY_ASSOCIATE1_PAY = 2025.0;
	
	/** The LIBRAR y_ associat e2_ pay. */
	private static double LIBRARY_ASSOCIATE2_PAY = 2920.0;
	
	/** The LIBRAR y_ associat e3_ pay. */
	private static double LIBRARY_ASSOCIATE3_PAY = 3750.0;
	
	/** The library current sales. */
	private static double LIBRARY_CURRENT_SALES = 100500.0;


	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		library = new Library(1);
		librarian = new Librarian(LIBRARIAN_NAME);
		libraryEmployee = new LibraryEmployee(LIBRARY_EMPLOYEE_NAME);
		libraryAssociate1 = new LibraryAssociate(LIBRARY_ASSOCIATE1_NAME);
		libraryAssociate2 = new LibraryAssociate(LIBRARY_ASSOCIATE2_NAME);
		libraryAssociate3 = new LibraryAssociate(LIBRARY_ASSOCIATE3_NAME);
		
		librarian.setBasePay(LIBRARIAN_BASE_PAY);
		librarian.setCurrentLibrarianUsedBookTotals(LIBRARIAN_USED_BOOK_SALES);
		Librarian.setBonusRate(LIBRARIAN_BONUS_RATE);
		
		libraryEmployee.setHourlyRate(LIBRARY_EMPLOYEE_HOURLY_RATE);
		libraryEmployee.setCurrentHours(LIBRARY_EMPLOYEE_CURRENT_HOURS);
		libraryEmployee.setCurrentSales(LIBRARY_EMPLOYEE_CURRENT_SALES);
	
		libraryAssociate1.setHourlyRate(LIBRARY_ASSOCIATE1_RATE);
		libraryAssociate1.setCurrentHours(LIBRARY_ASSOCIATE1_CURRENT_HOURS);
		libraryAssociate1.setCommisionRate(LIBRARY_ASSOCIATE1_COMMISION_RATE);
		libraryAssociate1.setCurrentSales(LIBRARY_ASSOCIATE1_CURRENT_SALES);

		libraryAssociate2.setHourlyRate(LIBRARY_ASSOCIATE2_RATE);
		libraryAssociate2.setCurrentHours(LIBRARY_ASSOCIATE2_CURRENT_HOURS);
		libraryAssociate2.setCommisionRate(LIBRARY_ASSOCIATE2_COMMISION_RATE);
		libraryAssociate2.setCurrentSales(LIBRARY_ASSOCIATE2_CURRENT_SALES);

		libraryAssociate3.setHourlyRate(LIBRARY_ASSOCIATE3_RATE);
		libraryAssociate3.setCurrentHours(LIBRARY_ASSOCIATE3_CURRENT_HOURS);
		libraryAssociate3.setCommisionRate(LIBRARY_ASSOCIATE3_COMMISION_RATE);
		libraryAssociate3.setCurrentSales(LIBRARY_ASSOCIATE3_CURRENT_SALES);

		library.setLibrarian(librarian);
		library.addEmployee(libraryEmployee);
		library.addEmployee(libraryAssociate1);
		library.addEmployee(libraryAssociate2);
		library.addEmployee(libraryAssociate3);
		
		
	}

	/**
	 * Test process payroll.
	 */
	@Test
	public void testProcessPayroll() {
		List<PayrollRecord> payrollList = library.processPayroll();
		for (Iterator<PayrollRecord> i = payrollList.iterator(); i.hasNext(); ){
			PayrollRecord record = i.next();
			System.out.println(record.getEmployeeName()+" pay = "+record.getCurrentPay());
			String name = record.getEmployeeName();
			if (name == LIBRARIAN_NAME){
				assertEquals(LIBRARIAN_PAY, record.getCurrentPay(),0);
			} else if (name == LIBRARY_EMPLOYEE_NAME){
				assertEquals(LIBRARY_EMPLOYEE_PAY, record.getCurrentPay(),0);
			} else if (name == LIBRARY_ASSOCIATE1_NAME){
				assertEquals(LIBRARY_ASSOCIATE1_PAY, record.getCurrentPay(),0);
			} else if (name == LIBRARY_ASSOCIATE2_NAME){
				assertEquals(LIBRARY_ASSOCIATE2_PAY, record.getCurrentPay(),0);
			} else if (name == LIBRARY_ASSOCIATE3_NAME){
				assertEquals(LIBRARY_ASSOCIATE3_PAY, record.getCurrentPay(),0);
			}
		}
	}

	/**
	 * Test get current used book sales.
	 */
	@Test
	public void testGetCurrentUsedBookSales() {
		System.out.println("Library current sales = "+library.getCurrentUsedBookSales());
		assertEquals(LIBRARY_CURRENT_SALES, library.getCurrentUsedBookSales(),0);
	}

}
