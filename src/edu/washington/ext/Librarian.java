package edu.washington.ext;

public class Librarian implements Employee {
	private static double bonusRate;
	private String name;
	private double basePay;
	private double currentLibraryTotals;
	private double currentLibrarianTotals;
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double calculatePay() {
		return basePay+(bonusRate*currentLibraryTotals);
	}
	public Librarian(String name){
		this.name = name;
		setBonusRate(0.10);
		setCurrentLibrarianusedBookTotals(0);
		setCurrentLibraryUsedBookSalesTotals(0);
		
	}
	public static void setBonusRate(double rate){
		bonusRate = rate;
	}
	public void setCurrentLibrarianusedBookTotals(double totals){
		this.currentLibrarianTotals = totals;
	}
	public double getCurrentLibrarianusedBookTotals(){
		return this.currentLibrarianTotals;
	}
	public void setBasePay(double base_pay){
		this.basePay = base_pay;
	}
	public void setCurrentLibraryUsedBookSalesTotals(double totals){
		this.currentLibrarianTotals = totals;
	}
	public double getCurrentLibraryUsedBookSalesTotals(){
		return this.currentLibrarianTotals;
	}

}
