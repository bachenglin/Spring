package com.demo.main;

import com.demo.service.CustomerService;
import com.demo.service.CustomerServiceImpl;

public class App {

	public static void main(String[] args) {
		
		CustomerService customerService = new CustomerServiceImpl();
		System.out.println(customerService.findAll().get(0).getFirstname());

	}

}
