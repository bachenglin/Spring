package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.config.AppConfig;
import com.demo.service.CustomerService;
import com.demo.service.CustomerServiceImpl;

public class App {

	public static void main(String[] args) {
		
		//CustomerService customerService = new CustomerServiceImpl();
		
		//ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		CustomerService customerService = appContext.getBean("customerService", CustomerService.class);
		
		//System.out.println(customerService);
		
		System.out.println(customerService.findAll().get(0).getFirstname());
		
		/*CustomerService customerService2 = appContext.getBean("customerService", CustomerService.class);

		System.out.println(customerService2);*/
		
		/*System.out.println(customerService.findAll().get(0).getFirstname());
		
		
		AnnotationConfigApplicationContext appContext2 = new AnnotationConfigApplicationContext(AppConfig.class);
		
		CustomerService customerService3 = appContext.getBean("customerService", CustomerService.class);
		
		System.out.println(customerService3);*/


	}

}
