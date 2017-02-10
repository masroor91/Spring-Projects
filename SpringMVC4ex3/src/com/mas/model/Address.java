package com.mas.model;

import javax.validation.constraints.NotNull;

public class Address {

	private String	street, city, country;
	
	@NotNull
	private int pincode;
	
	@NotNull
	public String getStreet() {
		return street;
	}
	
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	@NotNull
	public String getCity() {
		return city;
	}
	
	
	public void setCity(String city) {
		this.city = city;
	}
	
	@NotNull
	public String getCountry() {
		return country;
	}
	
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	public int getPincode() {
		return pincode;
	}
	
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

}
