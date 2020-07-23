package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.demo.model.Customer;
import com.demo.repository.CustomerRepository;
import com.demo.repository.HibernateCustomerRepositoryImpl;

@Service("customerService")
//@Scope("prototype")

public class CustomerServiceImpl implements CustomerService {
	
	@Value("${app.userName}")
	private String username;
	
	@Value("${app.password}")
	private String password;
	
	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl() {
		
	}
	
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
		System.out.println("Inside CONS!");
	}

	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
		System.out.println("Inside setter!");
		
		System.out.println(username +":" + password);
	}

	@Override
	public List<Customer> findAll() {
		
		return customerRepository.findAll();
		
	}

}
