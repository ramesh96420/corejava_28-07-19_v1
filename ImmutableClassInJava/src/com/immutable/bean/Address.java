package com.immutable.bean;

public class Address implements Cloneable{

	private String city;
	private int addressId;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	
	// here we can do the clone() than the data is not changed.
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
