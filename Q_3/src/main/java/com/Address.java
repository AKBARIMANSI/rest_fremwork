package com;

public class Address 
{
	private String city;
	
	public Address(String city)
	{
		this.city=city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public String toString()
	{
		return "Address{"+"city='"+city+'\''+'}';
	}
}
