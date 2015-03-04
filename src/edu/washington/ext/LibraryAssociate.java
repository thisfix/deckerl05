package edu.washington.ext;

public class LibraryAssociate extends LibraryEmployee {
	private double commisionRate;

	public LibraryAssociate(String name) {
		super(name);
	}
	public void setCommisionRate(double rate){
		this.commisionRate = rate;
	}
	
	@Override
	public double calculatePay() {
		
		return (super.calculatePay()+(super.getCurrentSales()*this.commisionRate));
	}
	

}
