package com.demo;

import java.util.function.Predicate;

public class GreaterThanInteger {

	public static void main(String[] args) 
	{
		Predicate<Integer> p = i -> (i>30);
		System.out.println(p.test(12));
		System.out.println(p.test(40));
		System.out.println(p.test(24));
		System.out.println(p.test(58));
	}

}
