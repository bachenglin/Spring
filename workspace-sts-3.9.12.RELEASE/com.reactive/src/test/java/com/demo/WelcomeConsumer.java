package com.demo;

import java.util.Date;
import java.util.function.Consumer;

class WelcomeConsumer implements Consumer<String> {
	@Override
	public void accept(String t) {
		System.out.println("Welcome to " + t + " at " + new Date());
	}
}