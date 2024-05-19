package com;

public class Customer 
{
	private Address address;
	
	public Customer(Address address)
	{
		this.address=address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String toString()
	{
		return "Customer{"+"address="+address+'}';
	}
}

