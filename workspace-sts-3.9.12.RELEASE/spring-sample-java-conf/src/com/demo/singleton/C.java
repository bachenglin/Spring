package com.demo.singleton;

public class C {
	public static void main(String a[]) {
		A  temp = A.getInstance();
		System.out.println(temp);
	
	try {
		Thread.sleep(3000);
	} catch(Exception e) {
		e.printStackTrace();
	}
	}
}
