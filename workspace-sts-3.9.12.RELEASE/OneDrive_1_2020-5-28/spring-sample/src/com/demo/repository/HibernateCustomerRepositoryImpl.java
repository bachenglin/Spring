package com.demo.repository;

import java.util.ArrayList;
import java.util.List;

import com.demo.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Override
	public List<Customer> findAll() {
		
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer customer = new Customer();
		customer.setFirstname("John");
		customer.setLastname("Smith");
		
		customers.add(customer);
		
		return customers;
	}

}
