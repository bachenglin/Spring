package com.demo;

import java.util.Date;
import java.util.function.Consumer;

class SystemOutConsumer implements Consumer<String> {
	@Override
	public void accept(String t) {
		System.out.println("Received " + t + " at " + new Date());
	}
}
