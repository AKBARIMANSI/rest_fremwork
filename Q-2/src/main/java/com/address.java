package com;

public class address
{
	private int houseno;
	private String city;
	private int pincode;
	
	public address(int houseno , String city , int pincode)
	{
		this.houseno=houseno;
		this.city=city;
		this.pincode=pincode;
	}
	
	public String toString()
	{
		return "#"+houseno+","+city+"-"+pincode;
	}
	
}
