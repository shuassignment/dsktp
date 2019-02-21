package com.cg.rest.mongodbspringboot.customer;

import org.springframework.data.annotation.Id;


public class Customer {

    @Id
    public String id;

    private String firstName;
    private String middleName;
    private String lastName;
    
    
    public Customer(String firstName, String middleName, String lastName) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}

	public Customer() {}

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + "]";
	}
    
    

}