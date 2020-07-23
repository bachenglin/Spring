package com.demo;

import java.util.function.Function;

public class FunctionExampe {

	public static void main(String[] args) 
	{
		Function<String,Integer> f = x->x.length();
		System.out.println(f.apply("asdfafiuahsdf"));

	}

}
