package com.demo.main;

import com.demo.impl.HelloImplService;
import com.demo.impl.IHello;

public class Test {

	public static void main(String[] args) {
		HelloImplService service = new HelloImplService();
		IHello iHello = service.getHelloImplPort();
		String response = iHello.sayHello("john smith");
		System.out.println(response);

	}

}
