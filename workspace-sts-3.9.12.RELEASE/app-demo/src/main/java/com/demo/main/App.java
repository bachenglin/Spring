package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.service.ShapeService;

public class App {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		ShapeService shapeService = appContext.getBean("shapeService", ShapeService.class); 

		//System.out.println(shapeService.getTriangle().getName());
		
		//shapeService.getCircle().setName("Trinity Circle");;
		
		//System.out.println(shapeService.getCircle().getName());
		
		shapeService.getCircle().setName("SOME Circle");
		
		System.out.println(shapeService.getCircle().getName());
		
		//System.out.println(shapeService.getTriangle().getName());
	}

}
