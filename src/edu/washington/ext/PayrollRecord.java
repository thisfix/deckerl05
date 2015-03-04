package edu.washington.ext;

public class PayrollRecord {
	private String employeeName;
	private double currentPay;
	public PayrollRecord(String name, double pay){
		this.employeeName = name;
		this.currentPay = pay;
	}
	public double getCurrentPay(){
		return this.currentPay;
	}
	public String getEmployeeName(){
		return this.employeeName;
	}

}
