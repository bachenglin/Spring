package com.demo;

import java.util.function.Predicate;

public class LengthofString 
{

	public static void main(String[] args) 
	{
		Predicate<String> p = s ->(s.length()>6);
		System.out.println(p.test("abcd"));
		System.out.println(p.test("abcdeafsaf"));
	}

}
