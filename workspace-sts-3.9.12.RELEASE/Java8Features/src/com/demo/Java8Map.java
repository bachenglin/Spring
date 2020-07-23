package com.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8Map {

	public static void main(String[] args) 
	{
		Map<Integer,String> m= new HashMap<>();
		m.put(1,"xyz.com");
		m.put(2,"xyw.com");
		m.put(3,"xyd.com");
		m.put(4,"xys.com");
		m.put(5,"xyu.com");
		//Map -> Stream -> Filter -> Map
		Map<Integer,String> s = m.entrySet().stream()
				.filter(a -> a.getKey() == 4)
				.collect(Collectors.toMap(p -> p.getKey(), p->p.getValue()));
		System.out.println(s);
	}

}
