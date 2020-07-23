package com.demo.singleton;

public class B {
	public static void main(String a[]) {
		A  temp = A.getInstance();
		System.out.println(temp);
		
		A temp2 = A.getInstance();
		System.out.println(temp2);
		
		try {
			Thread.sleep(3000);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
