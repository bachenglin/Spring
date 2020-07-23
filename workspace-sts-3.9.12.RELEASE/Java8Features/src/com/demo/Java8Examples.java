package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Examples {

	public static void main(String[] args) 
	{
		Stream<Integer> s1 = Stream.of(new Integer[] {10,20,30,40,50,60});
		ArrayList<Integer> l = new ArrayList<>(Arrays.asList(10,15,25,35,45,50));
		Stream<Integer> s2= l.stream();
		//System.out.println(s2);
		//s2.forEach(y->System.out.println(y));
		Stream<Date> d = Stream.generate(()->{return new Date();});
		//d.forEach(z->System.out.println(z));
		Stream<String> s3 = Stream.of("A$B$C$".split("\\$"));	
		//s3.forEach(p->System.out.println(p));
		List<Integer> l2 = s2.filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println(l2);
		ArrayList<String> names = new ArrayList<>(Arrays.asList("abc","efg","agi","wey","asd"));
		//names.stream().filter(p -> p.startsWith("a")).forEach(System.out::println);
		//names.stream().filter(p -> p.startsWith("a")).map(String::toUpperCase).forEach(System.out::println);
		names.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
	}

}
