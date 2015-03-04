package edu.washington.ext;

public class LibraryEmployee implements Employee {

	private double currentHours;
	private double hourlyRate;
	private String name;
	private double currentSales;
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public double calculatePay() {
		return currentHours*hourlyRate;
	}
	LibraryEmployee(String name){
		//initialize the instance
		this.currentHours = 0;
		this.hourlyRate = 0;
		this.name = name;
		this.currentSales = 0;
	}
	public void setCurrentSales(double cur_sales){
		this.currentSales = cur_sales;
	}
	public double getCurrentSales(){
		return currentSales;
	}
	public void setHourlyRate(double rate){
		this.hourlyRate = rate;
	}
	public void setCurrentHours(double cur_hours){
		this.currentHours = cur_hours;
	}

}
