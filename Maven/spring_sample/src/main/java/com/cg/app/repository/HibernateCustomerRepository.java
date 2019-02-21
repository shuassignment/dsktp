package com.cg.app.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.app.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepository implements CustomerRepository{

	@Override
	public List<Customer> findAll() {
		
		List<Customer> customers=new ArrayList<Customer>();
		Customer customer=new Customer();
		customer.setFirstName("Shubham");
		customer.setLastName("Raut");
		customers.add(customer);
		
		return customers;
	}

	
	
}
