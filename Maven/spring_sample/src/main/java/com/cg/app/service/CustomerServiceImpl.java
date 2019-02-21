package com.cg.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.app.model.Customer;
import com.cg.app.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
		
//	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("In constructor");
		this.customerRepository=customerRepository;
	}
	
	
//	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("In setter Method");
		this.customerRepository = customerRepository;
	}



	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
