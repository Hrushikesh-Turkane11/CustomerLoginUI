package com.code;

public enum ServicePlan {SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);
	
	private double price;
	
	private ServicePlan(double price)
	{
		this.price=price;
	}
	
	public double getPrice()
	{
		return this.price;
	}
}
