package com.demo.impl;

import javax.jws.WebService;

import com.demo.IHello;

@WebService(endpointInterface = "com.demo.IHello")
public class HelloImpl implements IHello{
	public String sayHello(String name) 
	{
	
		return "Hello from SOAP to: " + name.toUpperCase();
}
}
