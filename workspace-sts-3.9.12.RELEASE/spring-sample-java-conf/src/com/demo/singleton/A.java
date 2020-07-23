package com.demo.singleton;

import java.util.Date;

public class A {
	private static A a1;
	
	
	
	private A() {
		
		System.out.println(new Date());
		
	}
	
	public static A getInstance() {
		if(a1 == null)
			a1 = new A();
		
		return a1;
	}
	
	

}
