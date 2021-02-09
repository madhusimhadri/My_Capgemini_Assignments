package com.madhu.springMVC2.controller;

public class SimpleInterest 
{

	private double pAmount;;
	private double nYears;
	private double rOI;
	
	public SimpleInterest()
	{
		
	}

	public SimpleInterest(double pAmount, double nYears, double rOI) {
		super();
		this.pAmount = pAmount;
		this.nYears = nYears;
		this.rOI = rOI;
	}

	public double getpAmount() {
		return pAmount;
	}

	public void setpAmount(double pAmount) {
		this.pAmount = pAmount;
	}

	public double getnYears() {
		return nYears;
	}

	public void setnYears(double nYears) {
		this.nYears = nYears;
	}

	public double getrOI() {
		return rOI;
	}

	public void setrOI(double rOI) {
		this.rOI = rOI;
	}
	
	public double getInterest()
	{
		return (pAmount*nYears*rOI)/100;
	}
	
}
