package com.cg.rest.mongodbspringboot.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.rest.mongodbspringboot.customer.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);

}