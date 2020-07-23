package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterListJava8 {

	public static void main(String[] args)
	{
		List<String> x = Arrays.asList("abc","xyz","efg");
		//x.forEach(System.out::println);
		List<String> y = x.stream() //Convert List
				.filter(z-> !"xyz".equals(z))
				.collect(Collectors.toList());
		y.forEach(System.out::println);

	}

}
