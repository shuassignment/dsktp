package com.cg.app.repository;

import java.util.List;

import com.cg.app.model.Customer;

public interface CustomerRepository {

	public List<Customer> findAll();
}
