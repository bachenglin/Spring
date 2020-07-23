package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterList {

	public static void main(String[] args) 
	{
		List<String> x = Arrays.asList("abc","xyz","efg");
		x.forEach(System.out::println);
		/*List<String> z = f1(x,"xyz");
		for(String i:z)
		{
			System.out.println(i);
		}*/
 		
	}
	private static List<String> f1(List<String> x, String filter)
	{
		List<String> z = new ArrayList<>();
		for (String y:x)
		{
			if(!filter.equals(y))
			{
				z.add(y);
			}
		}
		return z;
	}

}
