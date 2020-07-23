package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.service.CustomerService;
import com.demo.service.CustomerServiceImpl;

public class App {

	public static void main(String[] args) {
		
		//CustomerService customerService = new CustomerServiceImpl();
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService customerService = appContext.getBean("customerService", CustomerService.class);
		
		System.out.println(customerService.findAll().get(0).getFirstname());

	}

}
