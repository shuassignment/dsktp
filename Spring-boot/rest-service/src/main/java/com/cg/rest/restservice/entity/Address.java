package com.cg.rest.restservice.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Address implements Serializable{

	private Integer flatNo;
	private String name;
	private String street;
	private String city;
	private Integer pincode;
	
	public Address() {

	}
	public Address(Integer flatNo, String name, String street, String city, Integer pincode) {
		super();
		this.flatNo = flatNo;
		this.name = name;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}
	public Integer getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(Integer flatNo) {
		this.flatNo = flatNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	
	
}
