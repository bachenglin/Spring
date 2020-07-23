package com.demo;

import java.util.function.Predicate;

public class PredicateJoins {

	public static void main(String[] args) 
	{
		int [] x = {10,20,30,40,50,60,70,80,90};
		Predicate<Integer> p1 = y->y>40;
		Predicate<Integer> p2 = z -> z%2 == 0;
		System.out.println("Greater than 40 are: ");
		f1(p1,x);
		System.out.println("Even Numbers are: ");
		f1(p2,x);
		
	}
	static void f1(Predicate<Integer> p,int[] x)
	{
		for (int a:x)
		{
			if(p.test(a))
			{
				System.out.println(a);
			}
		}
	}

}
